package com.example.contactactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvname:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displayNames()
    }
    fun displayNames(){
        var namesList= listOf<names>(
            names("Rahma","rahmafaizyusuf@gmail.com","0789988"),
            names("Anastacia","annahkarobia1@gmail.com","0754648"),
            names("Grace","gracemaina33@gmail.com","0786464"),
            names("Sophie","robertssophie4@gmail.com","075543"),
                    names("Sophie","robertssophie4@gmail.com","075543"),
            names("Sophie","robertssophie4@gmail.com","075543"),
            names("Sophie","robertssophie4@gmail.com","075543")

        )

        rvname=findViewById(R.id.rvnames)
        var namesAdapter=contactsRVAdapter(namesList)
        rvname.layoutManager= LinearLayoutManager(baseContext)
        rvname.adapter=namesAdapter
    }
}