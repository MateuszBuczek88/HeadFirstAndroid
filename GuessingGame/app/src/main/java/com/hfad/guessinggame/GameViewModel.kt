package com.hfad.guessinggame

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel() {
    private val words = listOf("ANDROID", "ACTIVITY", "FRAGMENT")
    private val secredWord = words.random().uppercase()
    private var correctGuesses = ""
    private val _gameOver = MutableLiveData<Boolean>(false)
    val gameOver: LiveData<Boolean>
        get() = _gameOver
    private val _secredWordDisplay = MutableLiveData<String>()
    val secredWordDisplay: LiveData<String>
        get() = _secredWordDisplay

    private val _incorrectGuesses = MutableLiveData<String>("")
    val incorrectGuesses: LiveData<String>
        get() = _incorrectGuesses

    private var _livesLeft = MutableLiveData<Int>(8)
    val livesLeft: LiveData<Int>
        get() = _livesLeft

    init {
        _secredWordDisplay.value = deriveWordDisplay()
    }

    private fun deriveWordDisplay(): String {
        var display = ""
        secredWord.forEach {
            display += checkLetter(it.toString())
        }
        return display
    }

    private fun checkLetter(str: String) =
        when (correctGuesses.contains(str)) {
            true -> str
            false -> "_"
        }

    fun makeGuess(guess: String) {
        if (guess.length == 1) {
            if (secredWord.contains(guess)) {
                correctGuesses += guess
                _secredWordDisplay.value = deriveWordDisplay()
            } else {
                _incorrectGuesses.value += "$guess"
                _livesLeft.value = _livesLeft.value?.minus(1)
            }
        }
        if (isWon() || isLost()) _gameOver.value = true
    }

    private fun isWon() = secredWord.equals(secredWordDisplay.value, true)
    private fun isLost() = (livesLeft.value ?: 0) <= 0
    fun wonLostMessage(): String {
        var message = ""
        if (isWon()) message = "You Won."
        else if (isLost()) message = "You Lost."
        message += " The word was: $secredWord"
        return message
    }

    fun finishGame() {
        _gameOver.value = true
    }

}