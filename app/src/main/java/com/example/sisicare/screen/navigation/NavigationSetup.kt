package com.example.sisicare.screen.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.sisicare.screen.books.BookScreen
import com.example.sisicare.screen.books.BookScreenViewModel
import com.example.sisicare.screen.clothes.ClothScreen
import com.example.sisicare.screen.clothes.ClothScreenViewModel
import com.example.sisicare.screen.food.FoodScreen
import com.example.sisicare.screen.food.FoodScreenViewModel
import com.example.sisicare.screen.home.HomeScreen
import com.example.sisicare.screen.home.HomeScreenViewModel
import com.example.sisicare.screen.sanitary.SanitaryScreen
import com.example.sisicare.screen.sanitary.SanitaryScreenViewModel

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(navController, startDestination = BottomNavItem.Home.screen_route) {
        composable(BottomNavItem.Home.screen_route) {
            HomeScreen(viewModel = HomeScreenViewModel(), navController = navController )
        }
        composable(BottomNavItem.Food.screen_route) {
            FoodScreen(viewModel = FoodScreenViewModel(), navController = navController )
        }
        composable(BottomNavItem.Books.screen_route) {
            BookScreen(viewModel = BookScreenViewModel(), navController = navController )
        }
        composable(BottomNavItem.Sanitary.screen_route) {
            SanitaryScreen(viewModel = SanitaryScreenViewModel(), navController = navController)
        }
        composable(BottomNavItem.Clothes.screen_route) {
            ClothScreen(viewModel = ClothScreenViewModel(), navController = navController)
        }
    }
}