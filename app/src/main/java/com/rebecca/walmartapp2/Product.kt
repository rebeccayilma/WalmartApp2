package com.rebecca.walmartapp2

data class Product(
    var title: String,
    var price: Double,
    var color: String,
    var image: Int,
    private var itemId: String,
    private var desc: String
) {


}