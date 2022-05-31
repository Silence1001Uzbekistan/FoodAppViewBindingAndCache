package com.example.foodappb.Class

import java.io.Serializable

class FoodClass:Serializable {

    var foodName: String? = null
    var foodwant: String? = null
    var foodNorm: String? = null


    constructor(foodName: String?, foodwant: String?, foodNorm: String?) {
        this.foodName = foodName
        this.foodwant = foodwant
        this.foodNorm = foodNorm
    }

    constructor()
}