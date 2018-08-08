package ru.omegalul.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import ru.omegalul.omegalultoastlibrary.c7Toast
import ru.omegalul.omegalultoastlibrary.c9Toast
import ru.omegalul.omegalultoastlibrary.omegalulToast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        applicationContext.omegalulToast()
        applicationContext.c9Toast()
        applicationContext.c7Toast()
    }
}
