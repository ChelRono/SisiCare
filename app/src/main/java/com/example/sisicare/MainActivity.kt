package com.example.sisicare

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
<<<<<<< HEAD
import androidx.compose.ui.tooling.preview.Preview
import com.example.sisicare.screen.onboarding.OnBoardingPager
=======
import com.example.sisicare.screen.signup.SignUpDetails
>>>>>>> 55b5092 ( Adds textfield for the sign up screen)
import com.example.sisicare.ui.theme.SisiCareTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SisiCareTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
<<<<<<< HEAD
                 OnBoardingPager()
=======
                    SignUpDetails()
>>>>>>> 55b5092 ( Adds textfield for the sign up screen)
                }
            }
        }
    }
}


