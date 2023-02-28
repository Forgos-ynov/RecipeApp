package com.example.recipe_application.Models

import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

open class Auth {

    private val auth = Firebase.auth

    open fun signIn(email: String, password: String, completion: (exception: Exception?) -> Unit) {
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    completion(null)
                } else {
                    completion(task.exception)
                }
            }
    }
}