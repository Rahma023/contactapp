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
            names("Rahma","rahmafaizyusuf@gmail.com","0789988","https://images.pexels.com/photos/5325842/pexels-photo-5325842.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"),
            names("Anastacia","annahkarobia1@gmail.com","0754648","https://images.pexels.com/photos/4656093/pexels-photo-4656093.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"),
            names("Grace","gracemaina33@gmail.com","0786464","https://images.pexels.com/photos/4992411/pexels-photo-4992411.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"),
            names("Sophie","robertssophie4@gmail.com","075543","https://images.pexels.com/photos/3282335/pexels-photo-3282335.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"),
            names("Sophie","robertssophie4@gmail.com","075543","https://images.pexels.com/photos/1803771/pexels-photo-1803771.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"),
            names("Sophie","robertssophie4@gmail.com","075543","https://images.pexels.com/photos/4398984/pexels-photo-4398984.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"),
            names("Sophie","robertssophie4@gmail.com","075543","https://images.pexels.com/photos/1926768/pexels-photo-1926768.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500")

        )

        rvname=findViewById(R.id.rvnames)
        var namesAdapter=contactsRVAdapter(namesList, baseContext)
        rvname.layoutManager= LinearLayoutManager(baseContext)
        rvname.adapter=namesAdapter
    }
}