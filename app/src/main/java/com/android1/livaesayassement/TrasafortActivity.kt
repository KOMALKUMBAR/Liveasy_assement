package com.android1.livaesayassement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class TrasafortActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.trasafort)
        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)


            val selectedId = radioGroup.checkedRadioButtonId
            if (selectedId != -1) {
                val selectedRadioButton = findViewById<RadioButton>(selectedId)
                val selectedText = selectedRadioButton.text.toString()
                Toast.makeText(this, "Selected: $selectedText", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please select a profile", Toast.LENGTH_SHORT).show()
            }

    }
}

