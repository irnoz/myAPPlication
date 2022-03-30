package com.example.myapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.Navigation
import com.example.myapplication.R

class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var amountEditText: EditText
    private lateinit var sendButton: Button


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = Navigation.findNavController(view)

        amountEditText = view.findViewById(R.id.editText)
        sendButton = view.findViewById(R.id.button)
        sendButton.setOnClickListener {
            val inputAmount = amountEditText.text.toString()
            if (inputAmount.isEmpty()) {
                return@setOnClickListener
            }
            val inputAmount2 = inputAmount.toInt()
            val action = HomeFragmentDirections.actionHomeFragmentToDashBoardFragment(inputAmount2)
            navController.navigate(action)

        }

    }
}