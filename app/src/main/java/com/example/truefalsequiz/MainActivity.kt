package com.example.truefalsequiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.truefalsequiz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var binding: ActivityMainBinding
    lateinit var trueButton :Button
    lateinit var falseButton :Button
    lateinit var answer:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.falseBytton.setOnClickListener(this)
        binding.trueBytton.setOnClickListener(this)
        binding.answerTextView
    }

    override fun onClick(view: View?) {
        switch
    }
}