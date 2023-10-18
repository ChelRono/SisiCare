package com.example.sisicare.screen.clothes

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.sisicare.screen.home.HomeScreenViewModel


@Composable
fun ClothScreen(
    viewModel: ClothScreenViewModel,
    navController: NavController
){
    Text(text = "Cloth")
}