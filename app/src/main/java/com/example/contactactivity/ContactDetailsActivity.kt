package com.example.contactactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class ContactDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_details)
        var name=intent.getStringExtra("name")
        Toast.makeText(baseContext,name,Toast.LENGTH_LONG).show()

        var phone=intent.getStringExtra("PhoneNumber")
        Toast.makeText(baseContext,phone,Toast.LENGTH_LONG).show()

        var Email=intent.getStringExtra("Email")
        Toast.makeText(baseContext,Email,Toast.LENGTH_LONG).show()
    }
}