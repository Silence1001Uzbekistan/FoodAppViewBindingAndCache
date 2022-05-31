package com.example.foodappb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.foodappb.Adapter.FoodBaseAdapter
import com.example.foodappb.Cache.MySharedPreference
import com.example.foodappb.Class.FoodClass
import com.example.foodappb.databinding.ActivityAddBinding

class AddActivity : AppCompatActivity() {

    private lateinit var bindingA: ActivityAddBinding

    var list = ArrayList<FoodClass>()

    lateinit var foodBaseAdapter: FoodBaseAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingA = ActivityAddBinding.inflate(layoutInflater)
        setContentView(bindingA.root)

        MySharedPreference.init(this)

        foodBaseAdapter = FoodBaseAdapter(list)



        bindingA.saveButton.setOnClickListener {

            if (bindingA.foodName.text.trim().isNotEmpty() && bindingA.productWant.text.trim()
                    .isNotEmpty() && bindingA.foodNorm.text.trim().isNotEmpty()
            ) {

                list = MySharedPreference.obyekString

                list.add(
                    FoodClass(
                        bindingA.foodName.text.toString(), bindingA.productWant.text.toString(),
                        bindingA.foodNorm.text.toString()
                    )
                )

                MySharedPreference.obyekString = list

                Toast.makeText(this, "Saved", Toast.LENGTH_SHORT).show()
                finish()

            } else {
                Toast.makeText(this, "To'g'ri kiritilsin", Toast.LENGTH_SHORT).show()
            }

        }


    }

}