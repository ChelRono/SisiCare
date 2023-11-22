package com.example.sisicare.data

import android.app.Application
import com.google.firebase.FirebaseApp

class SisiCare : Application() {
    override fun onCreate(){
        super.onCreate()

        FirebaseApp.initializeApp(this)
    }
}