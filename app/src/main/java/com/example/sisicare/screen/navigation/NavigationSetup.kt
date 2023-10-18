package com.example.sisicare.screen.navigation

import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
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
fun NavigationGraph(navController: NavHostController, modifier: Modifier) {
    NavHost(navController, startDestination = BottomNavItem.Home.route) {
        composable(BottomNavItem.Home.route) {
            HomeScreen(viewModel = HomeScreenViewModel(), navController = navController )
        }
        composable(BottomNavItem.Food.route) {
            FoodScreen(viewModel = FoodScreenViewModel(), navController = navController )
        }
        composable(BottomNavItem.Books.route) {
            BookScreen(viewModel = BookScreenViewModel(), navController = navController )
        }
        composable(BottomNavItem.Sanitary.route) {
            SanitaryScreen(viewModel = SanitaryScreenViewModel(), navController = navController)
        }
        composable(BottomNavItem.Clothes.route) {
            ClothScreen(viewModel = ClothScreenViewModel(), navController = navController)
        }
    }
}

@Composable
fun BottomNavigation(navController: NavController) {
    val items = listOf(
       BottomNavItem.Home,
       BottomNavItem.Food,
       BottomNavItem.Books,
       BottomNavItem.Sanitary,
       BottomNavItem.Clothes
    )
    androidx.compose.material.BottomNavigation(
        backgroundColor = Color(0.03f, 0.63f, 0.46f, 1.0f),
        contentColor = Color.Black
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        items.forEach { item ->
            BottomNavigationItem(
                icon = { Icon(
                    painterResource(id = item.icon),
                    contentDescription = item.title,
                    tint = Color.White
                ) },
                label = {
                    Text(
                        text = item.title,
                        fontSize = 16.sp,
                        color = Color.White
                    )
                },
                selectedContentColor = Color.DarkGray,
                unselectedContentColor = Color.Black.copy(0.4f),
                alwaysShowLabel = true,
                selected = currentRoute == item.route,
                onClick = {
                    navController.navigate(item.route) {

                        navController.graph.startDestinationRoute?.let { route ->
                            popUpTo(route) {
                                saveState = true
                            }
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}