package com.example.sisicare.screen.onboarding

import androidx.compose.runtime.Composable
import com.example.sisicare.R
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.rememberLottieComposition

data class Page(val title: String, val description: String, val image:Int)
val onboardPages = listOf(
    Page(
        "Welcome to SisiCare",
        "This app allows you to give back to the community through food, books, clothes and sanitary towels." ,
        R.raw.heart
    ),
    Page(
        "Easy and Fast donation",
        "Pick an item you would like to donate give the pickup and drop off details and you are done in less than no time",
        R.raw.yellow
    ),
    Page(
        "Lets Get You Started",
        "You must be the change you wish to see in the world.",
        R.raw.welcome3
    )
)
@Composable
fun LoaderIntro(modifier: Modifier, image: Int) {
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(image))
    LottieAnimation(
        composition = composition,
        iterations = LottieConstants.IterateForever,
    )
}