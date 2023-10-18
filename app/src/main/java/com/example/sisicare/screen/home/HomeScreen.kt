package com.example.sisicare.screen.home

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController

@Composable
fun HomeScreen(
    viewModel: HomeScreenViewModel,
    navController: NavController
  ){
     Text(text = "Home")
}