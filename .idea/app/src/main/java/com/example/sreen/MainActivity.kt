package com.example.sreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Type Casting / Declaring our elements
        val button =findViewById<Button>(R.id.button)
        val number =findViewById<EditText>(R.id.editTextNumber)

        // Listener that goes to the next page
        button?.setOnClickListener{

            //Create the explicit intent
            val intent =Intent (this,MainActivity2::class.java)
            //WE adding the table number to the intent
            intent.putExtra("number",number.text.toString())

            //Start the activity
            startActivity(intent)
    }
}