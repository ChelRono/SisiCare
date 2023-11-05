package com.example.sisicare.screen.onboarding

import androidx.annotation.DrawableRes
import com.example.sisicare.R

data class Page(val title: String, val description: String, @DrawableRes val image:Int)
val onboardPages = listOf(
    Page(
        "Welcome to SISICARE App",
        "This is an app that allows one to give back to the community through food, books, clothes and sanitary towels." ,
        R.drawable.care
    ),
    Page(
        "Easy and Fast donation",
        "Pick an item you would like to donate give the pickup and drop off details and you are done in less than no time",
        R.drawable.cart
    ),
    Page(
        "Lets Get You Started",
        "You must be the change you wish to see in the world.",
        R.drawable.thanks
    )
)