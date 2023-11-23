package com.example.sisicare.screen.books

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun BookScreen(
    viewModel: BookScreenViewModel,
    navController: NavController
){
    Text(text = "Books")
}