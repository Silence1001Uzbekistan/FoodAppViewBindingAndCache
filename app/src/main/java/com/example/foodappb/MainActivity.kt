package com.example.foodappb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodappb.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.addButton.setOnClickListener {

            val intent = Intent(this, AddActivity::class.java)

            startActivity(intent)

        }

        binding.menuButton.setOnClickListener {

            val intent = Intent(this, ListActivity::class.java)

            startActivity(intent)

        }

    }
}