package com.example.recipeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recipe_application.Models.Auth
import com.example.recipe_application.R
import com.google.firebase.FirebaseApp

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        FirebaseApp.initializeApp(applicationContext)
        println("fvre")
        Auth().signIn("lord.forgos@gmail.com", "password") {
            if (it == null) {
                println("Is Auth")
            } else {
                println(it)
            }
        }
    }

//    RecyclerView -> affichage des recettes
}