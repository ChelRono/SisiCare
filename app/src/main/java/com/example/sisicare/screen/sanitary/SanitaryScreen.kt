package com.example.sisicare.screen.sanitary

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun SanitaryScreen(
    viewModel: SanitaryScreenViewModel,
    navController: NavController
){
    Text(text = "Sanitary")
}