package ks.encrypttext.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import ks.encrypttext.R

class TextFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_text, container, false)
        val encryptButton = view.findViewById<Button>(R.id.encryptButton)

        encryptButton.setOnClickListener {
            val navController = view.findNavController()
            navController.navigate(R.id.action_textFragment_to_encrypt)
        }

        return view
    }

}