package com.hfad.guessinggame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.hfad.guessinggame.databinding.FragmentGameBinding

class GameFragment : Fragment() {
    private var _binding: FragmentGameBinding? = null
    private val binding get() = _binding!!

    val words = listOf("ANDROID", "ACTIVITY", "FRAGMENT")
    val secredWord = words.random().uppercase()
    var secredWordDisplay = ""
    var correctGuesses = ""
    var incorrectGuesses = ""
    var livesLeft = 8

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentGameBinding.inflate(inflater, container, false)
        val view = binding.root

        secredWordDisplay = deriveWordDisplay()
        updateScreen()
        binding.guessButton.setOnClickListener {
            makeGuess(binding.guess.text.toString().uppercase())
            binding.guess.text = null
            updateScreen()
            if (isWon()||isLost()){
                val action = GameFragmentDirections.actionGameFragmentToResultFragment((wonLostMessage()))
                view.findNavController().navigate(action)
            }
        }

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun updateScreen(){
        binding.word.text = secredWordDisplay
        binding.lives.text = "You have $livesLeft lives left."
        binding.incorrectGuessses.text = "Incorrect guesses: $incorrectGuesses"
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