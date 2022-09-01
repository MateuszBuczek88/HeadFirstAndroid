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
import com.google.android.material.chip.Chip
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.hfad.bitsandpizzas.databinding.FragmentOrderBinding
import com.hfad.bitsandpizzas.databinding.FragmentOrderBinding.inflate

class OrderFragment : Fragment() {
    private var _binding: FragmentOrderBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = inflate(inflater, container, false)
        val view = binding.root

        (activity as AppCompatActivity).setSupportActionBar(binding.toolBar)

        binding.fab.setOnClickListener {
            val pizzaType = binding.pizzaGroup.checkedRadioButtonId
            if (pizzaType == -1) {
                Toast.makeText(activity, "No pizza type selected", Toast.LENGTH_SHORT).show()

            } else {
                val parmesan =
                    if (binding.parmesan.isChecked) "with extra parmesan"
                    else ""
                val chiliOil =
                    if (binding.chiliOil.isChecked) "with extra chilli oil"
                    else ""
                val pizzaName = if (binding.radioDiavolo.isChecked) binding.radioDiavolo.text
                else binding.radioFunghi.text
                val text = "Pizza $pizzaName $parmesan $chiliOil"

                Snackbar.make(binding.fab, text, Snackbar.LENGTH_SHORT).show()
            }
        }
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}