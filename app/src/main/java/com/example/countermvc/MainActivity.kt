package com.example.countermvc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    lateinit var countTxt: TextView
    lateinit var countBtn: Button
    lateinit var controller: Controller
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        countTxt = findViewById(R.id.counter)
        countBtn = findViewById(R.id.countBtn)
        controller = Controller()
        observer()
            countBtn.setOnClickListener {
                controller.counter()
                countTxt.text = controller.x.value.toString()
            }
    }

    fun observer(){
        controller.x.observe(this, Observer {

        })
    }
}