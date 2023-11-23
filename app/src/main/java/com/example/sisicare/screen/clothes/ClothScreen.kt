package com.example.sisicare.screen.clothes

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun ClothScreen(
    viewModel: ClothScreenViewModel,
    navController: NavController
){
    Text(text = "Clothes")
}