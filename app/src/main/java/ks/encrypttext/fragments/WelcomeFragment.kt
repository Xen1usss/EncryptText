package ks.encrypttext.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import ks.encrypttext.R

class WelcomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_welcome,container, false) //  ссылка на корневой вью фрагмента
        val startButton = view.findViewById<Button>(R.id.startButton) // используем корневой вью для получения ссылки на кнопку

        startButton.setOnClickListener {
            val navController = view.findNavController()
            navController.navigate(R.id.action_welcomeFragment_to_textFragment)
        }
        return view
    }

}