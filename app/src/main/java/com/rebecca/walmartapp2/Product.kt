package com.rebecca.walmartapp2

class Product {
    var title : String = ""
    var price : Double = 0.0
    var color: String = ""
    var image: String = ""
    var itemid: String = ""
    var desc: String = ""

    constructor(
        title: String,
        price: Double,
        color: String,
        image: String,
        itemid: String,
        desc: String
    ) {
        this.title = title
        this.price = price
        this.color = color
        this.image = image
        this.itemid = itemid
        this.desc = desc
    }

    constructor()

}