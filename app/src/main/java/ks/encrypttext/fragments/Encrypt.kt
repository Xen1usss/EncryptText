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

        fun caesarCipher(text: String): String {
            val alpha = " ,.!?abcdefghijklmnopqrstuvwxyz()"
            val n = 3 // Сдвиг всегда на 3
            val s = text
            var res = ""
            for (c in s) {
                res += alpha[(alpha.indexOf(c) + n) % alpha.length]
            }
            return res
        }

        encryptedText.text = caesarCipher(text)

        return view
    }

}