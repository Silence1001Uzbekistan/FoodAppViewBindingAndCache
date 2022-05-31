package com.example.foodappb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodappb.Adapter.FoodBaseAdapter
import com.example.foodappb.Cache.MySharedPreference
import com.example.foodappb.Class.FoodClass
import com.example.foodappb.databinding.ActivityListBinding

class ListActivity : AppCompatActivity() {

    private lateinit var bindingL: ActivityListBinding

    lateinit var foodBaseAdapter: FoodBaseAdapter

    var list = ArrayList<FoodClass>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingL = ActivityListBinding.inflate(layoutInflater)
        setContentView(bindingL.root)

        MySharedPreference.init(this)

        list = MySharedPreference.obyekString

        foodBaseAdapter = FoodBaseAdapter(list)

        bindingL.gridView.adapter = foodBaseAdapter

        bindingL.gridView.setOnItemClickListener { parent, view, position, id ->

            val intent = Intent(this, DataActivity::class.java)

            intent.putExtra("a",list[position])


            startActivity(intent)

        }


    }
}