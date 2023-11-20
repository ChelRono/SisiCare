package com.example.sisicare.screen.onboarding

import androidx.compose.runtime.Composable
import com.example.sisicare.R
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier

data class Page(val title: String, val description: String, val image:Int)
val onboardPages = listOf(
    Page(
        "Welcome to SisiCare",
        "This app allows you to give back to the community through food, books, clothes and sanitary towels." ,
        R.drawable.page1
    ),
    Page(
        "Easy and Fast donation",
        "Pick an item you would like to donate give the pickup and drop off details and you are done in less than no time",
        R.drawable.page2
    ),
    Page(
        "Lets Get You Started",
        "You must be the change you wish to see in the world.",
        R.drawable.page3
    )
)
