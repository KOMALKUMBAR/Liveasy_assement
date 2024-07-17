package com.android1.livaesayassement

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.Toast
import androidx.cardview.widget.CardView

class MainActivity<Spinner> : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var courses = arrayOf<String?>("English", "Gujarati", "Hindi", "Kannada", "Kashmiri", "Konkani", "Maithili", "Malayalam", "Manipuri", "Marathi", "Nepali", "Odia", "Punjabi", "Sanskrit", "Santali", "Sindhi", "Tamil", "Telugu",)
        val autoComplete = findViewById<AutoCompleteTextView>(R.id.MachineName)
        val adapter = ArrayAdapter(this, R.layout.list_item, courses)
        autoComplete.setAdapter(adapter)
        autoComplete.onItemClickListener =
            AdapterView.OnItemClickListener() { adapterView, view, i, l ->
                val itemSelected = adapterView.getItemAtPosition(i)
                Toast.makeText(this, "Language: $itemSelected", Toast.LENGTH_LONG).show() }

        val nexbutton = findViewById<Button>(R.id.nextButton)
        nexbutton.setOnClickListener() {
            val intent = Intent(this, mobilePageActivity::class.java)
            startActivity(intent)
        }

    }

}


