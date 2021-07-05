package com.example.aboutme

import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.aboutme.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val aName : PersonName = PersonName("ShuJiun","Haha")
        binding.myName = aName

        binding.changebutton.setOnClickListener{
            aName.nickName = binding.editTextTextPersonName2.text.toString()
            binding.changebutton.visibility = View.GONE
            binding.editTextTextPersonName2.visibility = View.GONE
            binding.textView3.text = binding.editTextTextPersonName2.text
            binding.textView3.visibility = View.VISIBLE
        }

    }
}