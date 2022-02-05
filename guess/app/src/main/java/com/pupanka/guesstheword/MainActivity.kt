package com.pupanka.guesstheword

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import java.security.SecureRandom


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_generate.setOnClickListener {

            var word = "CHICKEN"
            Log.e("xlogx",":" + shuffle(word))
        }
    }

    fun shuffle(string: String): String {

        val helloCharArray = string.toCharArray()
        helloCharArray.shuffle()
        val shuffledHello = helloCharArray.concatToString()

        return shuffledHello
    }

    fun randomString(givenString: String): String {
        val random = SecureRandom()
//        val chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".toCharArray()
        val chars = givenString.toCharArray()
        return (1..givenString.length).map { chars[random.nextInt(chars.size)] }.joinToString("")
    }

}