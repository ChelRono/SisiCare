package com.example.sisicare.screen.donor

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.sisicare.common.ButtonComponent
import com.example.sisicare.screen.signup.SignUpScreenViewModel

@Composable
fun DonorScreen(
                viewModel: DonorScreenViewModel,
                navController: NavController
                ){
    Column {
        Text(text = "Hello Donor")

        ButtonComponent (onButtonClicked ={
          //  signUpScreenViewModel.logout()
        }, isEnabled = true )
    }
}