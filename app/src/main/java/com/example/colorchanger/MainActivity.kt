package com.example.colorchanger

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var view: View
    private lateinit var floatButton : FloatingActionButton
    private  var colorsArray=arrayOf(Color.RED,Color.WHITE,Color.GRAY,Color.GREEN,Color.MAGENTA,
        Color.YELLOW)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.mainL)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        view = findViewById(R.id.mainL)
        floatButton =findViewById(R.id.floatActionButton)


        floatButton.setOnClickListener {

            view.setBackgroundColor(colorsArray[Random.nextInt(colorsArray.size)])
        }
    }
}