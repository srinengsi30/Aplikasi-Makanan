package com.example.makanan.About

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.makanan.navigation.ListDemo
import com.example.makanan.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val profil = Profil(
                name = "Srinengsi Rajagukguk",
                email = "srinengsirajagukguk.com",
                university = "Institut Teknologi DEL",
                major = "Software Engineer",
                imageRes = R.drawable.saya
            )
            ListDemo(profil)
        }
    }
}