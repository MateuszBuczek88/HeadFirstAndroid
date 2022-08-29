package com.hfad.secretmessage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.findNavController


class MessageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_message, container, false)
        val backButton = view.findViewById<Button>(R.id.back_buton)
        val messageView = view.findViewById<EditText>(R.id.message)

        backButton.setOnClickListener {
            view.findNavController().navigateUp()
        }

        val nextButton = view.findViewById<Button>(R.id.next_button)
        nextButton.setOnClickListener {
            val message = messageView.text.toString()
            val action = MessageFragmentDirections.actionFragmentMessageToEncryptFragment(message)
            view.findNavController().navigate(action)
        }
        return view
    }
}