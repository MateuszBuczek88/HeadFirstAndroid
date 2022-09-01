package com.hfad.guessinggame

import androidx.lifecycle.ViewModel

class GameViewModel: ViewModel() {
    val words = listOf("ANDROID", "ACTIVITY", "FRAGMENT")
    val secredWord = words.random().uppercase()
    var secredWordDisplay = ""
    var correctGuesses = ""
    var incorrectGuesses = ""
    var livesLeft = 8

    init {
        secredWordDisplay = deriveWordDisplay()
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
            false -> ""
        }
    fun makeGuess(guess: String) {
        if (guess.length == 1) {
            if (secredWord.contains(guess)) {
                correctGuesses += guess
                secredWordDisplay = deriveWordDisplay()
            } else {
                incorrectGuesses += "$guess"
                livesLeft--
            }
        }
    }
    fun isWon() = secredWord.equals(secredWordDisplay,true)
    fun isLost() = livesLeft <= 0
    fun wonLostMessage() :String{
        var message =""
        if(isWon()) message = "You Won"
        else if (isLost()) message = "You Lost"
        message += "The word was $secredWord"
        return message
    }
}