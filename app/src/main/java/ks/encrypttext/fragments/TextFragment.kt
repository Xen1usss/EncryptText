package ks.encrypttext.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.findNavController
import ks.encrypttext.R

class TextFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_text, container, false)
        val encryptButton = view.findViewById<Button>(R.id.encryptButton)
        val textForEncryptView = view.findViewById<TextView>(R.id.textForEncrypt)

        encryptButton.setOnClickListener {
            val text = textForEncryptView.text.toString()
            val action = TextFragmentDirections.actionTextFragmentToEncrypt(text)
            view.findNavController().navigate(action)
        }

        return view
    }

}