package com.rebecca.walmartapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ProductLlist : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_llist)

        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)


        recyclerview.layoutManager = LinearLayoutManager(this)


        var products = arrayListOf<Product>(
            Product("Vizio 70Inch TV",499.99,"Black",R.drawable.img,"1","4k TV"),
            Product("Lenevo Laptop",899.99,"Black",R.drawable.img_8,"2","Laptop"),
            Product("MacBook Pro",2399.99,"Space Grey",R.drawable.img_6,"3","Laptop"),
            Product("IPhone 14 Pro Max",1999.99,"Purple",R.drawable.img_5,"4","Phone"),
            Product("Samsung Galaxy S22",1999.99,"Whitte",R.drawable.img_7,"5","Phone")
        )

        val adapter = CustomAdapter(products)

        recyclerview.adapter = adapter
    }
}