package com.example.sisicare.screen.books

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.sisicare.screen.home.HomeScreenViewModel


@Composable
fun BookScreen(
    viewModel: BookScreenViewModel,
    navController: NavController
){
    Text(text = "Book")
}