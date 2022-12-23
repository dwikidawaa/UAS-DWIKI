package com.example.uts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mobil = arrayOf("Toyota", "BMW", "Subaru", "Lexus", "Mercedes-Benz")

        val adapter = ArrayAdapter (this,android.R.layout.simple_list_item_1, mobil)

        lv_mobil.adapter = adapter
        lv_mobil.setOnItemClickListener{parent, view, position, id ->
            Toast.makeText(this, "ini adalah mobil ${mobil[position]}", Toast.LENGTH_SHORT).show()
        }
    }
}