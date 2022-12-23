package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mobil = arrayOf("Toyota", "BMW", "Mercedes-Benz", "Subaru", "Lexus")

        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1, mobil)

        lv_mobil.adapter = adapter
        lv_mobil.setOnItemClickListener {parent, view, position, id ->
            Toast.makeText(this, "ini adalah Mobil ${mobil[position]}", Toast.LENGTH_SHORT).show()
    }
}