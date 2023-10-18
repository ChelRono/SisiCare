package com.example.sisicare.screen.food

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.sisicare.screen.home.HomeScreenViewModel


@Composable
fun FoodScreen(
    viewModel: FoodScreenViewModel,
    navController: NavController
){
    Text(text = "Food")
}