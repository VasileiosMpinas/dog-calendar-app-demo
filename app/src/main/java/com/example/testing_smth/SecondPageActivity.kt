package com.example.testing_smth

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondPageActivity : AppCompatActivity() {
    lateinit var toptext: TextView
    lateinit var description: TextView
    lateinit var eventButton: Button

    val dog_info = listOf(
        listOf("",listOf("January")
            ,listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf("")
        ,listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf("Ace","Description",R.drawable.ace),""
            ,listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf("")),   //January
        listOf("",listOf("February")
            ,listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf("")
            ,listOf(""),listOf(""),listOf(""),listOf(""),listOf("Henry","Description",R.drawable.henry),listOf(""),listOf(""),listOf(""),listOf(""),listOf("")
            ,listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf("Jimmy","Description",R.drawable.coming_soon)),  //February
        listOf("",listOf("March")
            ,listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf("")
            ,listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf("Max","Description",R.drawable.max),listOf(""),listOf(""),listOf("")
            ,listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf("")),     //March
        listOf("",listOf("April")
            ,listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf("Loki","Description",R.drawable.coming_soon),listOf(""),listOf(""),listOf(""),listOf("")
            ,listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf("")
            ,listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf("")),     //April
        listOf("", listOf("May")
            ,listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf("")
            ,listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf("")
            ,listOf(""),listOf("Luna","Description",R.drawable.luna),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf("")),       //May
        listOf("",listOf("June")
            ,listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf("")
            ,listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf("")
            ,listOf(""),listOf(""),listOf(""),listOf("Zeus","Description",R.drawable.zeus),listOf(""),listOf(""),listOf(""),listOf(""),listOf("")),      //June
        listOf("",listOf("July")
            ,listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf("")
            ,listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf("")
            ,listOf(""),listOf(""),listOf(""),listOf(""),listOf("Hachiko","Description",R.drawable.hachiko),listOf(""),listOf(""),listOf(""),listOf("")),      //July
        listOf("", listOf("August")
            ,listOf("Atlas","Description",R.drawable.coming_soon),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf("")
            ,listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf("")
            ,listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf("")),    //August
        listOf("",listOf("September")
            ,listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf("")
            ,listOf(""),listOf(""),listOf(""),listOf(""),listOf("Rex","Description",R.drawable.rex),listOf(""),listOf(""),listOf(""),listOf(""),listOf("")
            ,listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf("")), //September
        listOf("",listOf("October")
            ,listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf("Sam","Description",R.drawable.coming_soon),listOf(""),listOf("")
            ,listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf("")
            ,listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf("")),   //October
        listOf("",listOf("Snow","Description",R.drawable.snow),listOf("Merlin","Description",R.drawable.coming_soon)
            ,listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf("")
            ,listOf(""),listOf(""),listOf(""),listOf("Chedar","Description",R.drawable.chedar),listOf(""),listOf(""),listOf("Bella","Description",R.drawable.bella),listOf(""),listOf(""),listOf("")
            ,listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf("")),   //November
        listOf("",listOf("December")
            ,listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf("")
            ,listOf(""),listOf(""),listOf(""),listOf(""),listOf("Daisy","Description",R.drawable.coming_soon),listOf(""),listOf(""),listOf(""),listOf(""),listOf("")
            ,listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""),listOf(""))   //December
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_page)



        eventButton=findViewById(R.id.pbutton)
        toptext = findViewById(R.id.topView)
        description = findViewById(R.id.textView)

        val days = intent.getIntExtra("day", -1)
        val months = intent.getIntExtra("month", -1)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // safe bounds check for outer list
        if (months < 0 || months >= dog_info.size) {
            toptext.text = "No Dog Assigned"
            return
        }

// dog_info[months] should be a List<*>
        val monthEntry = dog_info[months] as? List<*>
        if (monthEntry == null || days < 0 || days >= monthEntry.size) {
            toptext.text = "No Dog Assigned"
            return
        }

// monthEntry[days] expected to be a List<*> like ["Ace","Description",R.drawable.ace]
        val dayEntry = monthEntry[days] as? List<*>
        if (dayEntry == null || dayEntry.isEmpty()) {
            toptext.text = "No Dog Assigned"
            return
        }

// get name, description and image safely
        val name = dayEntry.getOrNull(0) as? String ?: "No Dog Assigned"
        val descr = dayEntry.getOrNull(1) as? String ?: "No description"
        val photoRes = (dayEntry.getOrNull(2) as? Int) ?: R.drawable.coming_soon

        toptext.text = name
        findViewById<ImageView>(R.id.imageView2)?.setImageResource(photoRes)
        if(months==10 && days==1) {
            description.text = "Description:" + "\n" +
                    "Snow is a fluffy white Samoyed with a personality as bright as fresh winter powder. " +
                    "True to the Samoyed spirit, Snow is playful, affectionate, and endlessly friendly — the kind of dog who greets everyone with a wagging tail and a signature “Sammy smile." +
                    "With a coat as soft as snowflakes and eyes full of gentle curiosity, Snow brings warmth wherever he goes. "
        }else{
            description.text="Description:"+"\n"+"Coming Soon"
        }
        eventButton.text="<"
        eventButton.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}