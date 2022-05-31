package com.example.foodappb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodappb.Class.FoodClass
import com.example.foodappb.databinding.ActivityDataBinding

class DataActivity : AppCompatActivity() {

    private lateinit var bindingD: ActivityDataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingD = ActivityDataBinding.inflate(layoutInflater)
        setContentView(bindingD.root)

        val foodClass = intent.getSerializableExtra("a") as FoodClass

        bindingD.foodNameData.text = foodClass.foodName
        bindingD.foodWantData.text = foodClass.foodwant
        bindingD.foodTextData.text = foodClass.foodNorm

    }
}