package com.example.recycleviewtest

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var button1: Button
    lateinit var button2: Button
    lateinit var rv: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)

        rv = findViewById(R.id.recyclerView)
        rv.layoutManager = LinearLayoutManager(this)


        button1.setOnClickListener{
            button2.requestFocus()
        }

        button2.setOnClickListener{
            val list = listOf<String>("Иванов Иван", "Петров Петр", "Филипп Киркоров", "Леонид Брежнев")
            rv.adapter = MyAdapter(list)
            rv.requestFocus()
        }
    }

}