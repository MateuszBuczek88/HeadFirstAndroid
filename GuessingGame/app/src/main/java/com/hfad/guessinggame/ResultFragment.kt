package com.hfad.guessinggame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController

class ResultFragment : Fragment() {

    lateinit var viewModel: ResultViewModel
    lateinit var viewModelFactory: ResultViewModelFactory


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val result = ResultFragmentArgs.fromBundle(requireArguments()).result
       // viewModelFactory = ResultViewModelFactory(result)
        //viewModel = ViewModelProvider(this, viewModelFactory).get(ResultViewModel::class.java)
        viewModel = ResultViewModel(result)

        return ComposeView(requireContext()).apply {
            setContent {
                MaterialTheme() {
                    Surface() {
                        view?.let {
                            ResultFragmentContent(it, viewModel)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun ResultFragmentContent(view: View, viewModel: ResultViewModel) {
    Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
        NewGameButton {
            view.findNavController().navigate(R.id.action_resultFragment_to_gameFragment)
        }
        ResultText(result = viewModel.result)
    }
}

@Composable
fun NewGameButton(clicked: () -> Unit) {
    Button(onClick = clicked) {
        Text(text = "Start New Game")

    }
}

@Composable
fun ResultText(result: String) {
    Text(
        text = result,
        fontSize = 28.sp,
        textAlign = TextAlign.Center
    )

}