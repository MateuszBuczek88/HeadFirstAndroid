package com.hfad.guessinggame

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GameViewModel: ViewModel() {
    val words = listOf("ANDROID", "ACTIVITY", "FRAGMENT")
    val secredWord = words.random().uppercase()
    val secredWordDisplay = MutableLiveData<String>()
    var correctGuesses = ""
    val incorrectGuesses = MutableLiveData<String>("")
    val livesLeft = MutableLiveData<Int>(8)

    init {
        secredWordDisplay.value = deriveWordDisplay()
    }

    fun deriveWordDisplay(): String {
        var display = ""
        secredWord.forEach {
            display += checkLetter(it.toString())
        }
        return display
    }

    fun checkLetter(str: String) =
        when (correctGuesses.contains(str)) {
            true -> str
            false -> "_"
        }
    fun makeGuess(guess: String) {
        if (guess.length == 1) {
            if (secredWord.contains(guess)) {
                correctGuesses += guess
                secredWordDisplay.value = deriveWordDisplay()
            } else {
                incorrectGuesses.value += "$guess"
                livesLeft.value?.minus(1)
            }
        }
    }
    fun isWon() = secredWord.equals(secredWordDisplay.value,true)
    fun isLost() = (livesLeft.value ?: 0) <= 0
    fun wonLostMessage() :String{
        var message =""
        if(isWon()) message = "You Won"
        else if (isLost()) message = "You Lost"
        message += "The word was $secredWord"
        return message
    }
}