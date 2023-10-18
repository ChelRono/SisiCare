package com.example.sisicare.screen.sanitary

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.sisicare.screen.home.HomeScreenViewModel


@Composable
fun SanitaryScreen(
    viewModel: SanitaryScreenViewModel,
    navController: NavController
){
    Text(text = "Sanitary")
}