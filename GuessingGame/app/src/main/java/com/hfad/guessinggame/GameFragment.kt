package com.hfad.guessinggame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController


class GameFragment : Fragment() {

    lateinit var viewModel: GameViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        viewModel = ViewModelProvider(this).get(GameViewModel::class.java)
        viewModel.gameOver.observe(viewLifecycleOwner, Observer { newValue ->
            if (newValue) {
                val action =
                    GameFragmentDirections.actionGameFragmentToResultFragment((viewModel.wonLostMessage()))
                view?.findNavController()?.navigate(action)
            }
        })

        return ComposeView(requireContext()).apply {
            setContent {
                MaterialTheme() {
                    Surface() {
                        GameFragmentContent(viewModel)
                    }
                }
            }
        }


    }

}

@Composable
fun GameFragmentContent(viewModel: GameViewModel) {
    val guess = remember { mutableStateOf("") }
    val incorrectGuesses = viewModel.incorrectGuesses.observeAsState("")
    val livesLeft = viewModel.livesLeft.observeAsState()
    val secredWord = viewModel.secredWordDisplay.observeAsState()
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            SecretWordDisplay(text = secredWord.value!!)
        }
        EnterGuess(guess = guess.value, changed = { guess.value = it })
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            GuessButton {
                viewModel.makeGuess(guess.value.uppercase())
                guess.value = ""
            }

            FinishButton {
                viewModel.finishGame()
            }
            IncorrectGuessesText(text = incorrectGuesses.value)
            LivesLeftText(text = livesLeft.value.toString())

        }
    }

}

@Composable
fun FinishButton(onClick: () -> Unit) {
    Button(onClick = onClick) {
        Text(text = "Finish Game")
    }
}

@Composable
fun EnterGuess(guess: String, changed: (String) -> Unit) {
    TextField(
        value = guess,
        onValueChange = changed,
        label = { Text(text = "Make a guess") }
    )
}

@Composable
fun GuessButton(clicked: () -> Unit) {

    Button(onClick = clicked) {
        Text(text = "Guess!")
    }
}

@Composable
fun IncorrectGuessesText(text: String) {
    Text(text = "Incorrect guesses: $text")
}

@Composable
fun LivesLeftText(text: String) {
    Text(text = "Lives left: $text")
}

@Composable
fun SecretWordDisplay(text: String) {
    Text(text = text, letterSpacing = 0.1.em, fontSize = 36.sp)
}