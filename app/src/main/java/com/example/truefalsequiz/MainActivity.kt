package com.example.truefalsequiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.truefalsequiz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var trueButton :Button
    lateinit var falseButton :Button
    lateinit var checkButton :Button
    lateinit var nextButton :Button
    lateinit var prevButton :Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.checkButton.setOnClickListener{
            var checkButton = Intent(this,check::class.java)
            startActivity(checkButton)
        }


        binding.falseButton
        binding.trueButton
        binding.answerTextView
    }

}