package ks.encrypttext.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import ks.encrypttext.R

class Encrypt : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_encrypt, container, false)
        val text = EncryptArgs.fromBundle(requireArguments()).textForEncrypt
        val encryptedText = view.findViewById<TextView>(R.id.encryptedText)

        encryptedText.text = text.reversed()

        return view
    }

}