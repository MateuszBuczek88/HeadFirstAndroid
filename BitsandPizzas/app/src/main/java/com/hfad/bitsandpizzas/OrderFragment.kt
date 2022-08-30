package com.hfad.bitsandpizzas

import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class OrderFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_order, container, false)
        val toolbar = view.findViewById<MaterialToolbar>(R.id.tool_bar)
        (activity as AppCompatActivity).setSupportActionBar(toolbar)


        val fab = view.findViewById<FloatingActionButton>(R.id.fab)

        fab.setOnClickListener {
            val pizzaGroup = view.findViewById<RadioGroup>(R.id.pizza_group)
            val pizzaType = pizzaGroup.checkedRadioButtonId
            if (pizzaType == -1) {
                Toast.makeText(activity, "No pizza type selected", Toast.LENGTH_SHORT).show()

            } else {
                var text = view.findViewById<Button>(pizzaGroup.checkedRadioButtonId).text
                Snackbar.make(fab, text, Snackbar.LENGTH_SHORT).show()
            }
        }
        return view
    }
}