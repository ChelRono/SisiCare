package com.example.sisicare.app

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.sisicare.screen.donor.DonorScreen
import com.example.sisicare.screen.navigation.NavigationItem
import com.example.sisicare.screen.navigation.NavigationSetup
import com.example.sisicare.screen.onboarding.OnBoardingPager
import com.example.sisicare.screen.signin.SignInDetails
import com.example.sisicare.screen.signup.SignUpDetails

@Composable
fun NavigationApp(){
    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = Color.White
    ) {

        Crossfade(targetState = NavigationSetup.currentScreen, label = "") { currentState->
            when(currentState.value){
                is NavigationItem.OnBoardingPager ->{
                    OnBoardingPager()
                }
                is NavigationItem.SignUpDetails ->{
                    SignUpDetails()
                }
                is NavigationItem.SignInDetails ->{
                    SignInDetails()
                }
                is NavigationItem.DonorScreen ->{
                    DonorScreen()
                }


            }
        }

    }
}