package com.rebecca.walmartapp2

class Product {
    private var title: String
    private var price: Double
    private var color: String
    private var image: String
    private var itemId: String
    private var desc: String

    constructor(
        title: String,
        price: Double,
        color: String,
        image: String,
        itemId: String,
        desc: String
    ) {
        this.title = title
        this.price = price
        this.color = color
        this.image = image
        this.itemId = itemId
        this.desc = desc
    }


}