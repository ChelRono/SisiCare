package com.example.sisicare.screen.navigation

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomAppBar
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.sisicare.R
import com.example.sisicare.screen.books.BookScreen
import com.example.sisicare.screen.books.BookScreenViewModel
import com.example.sisicare.screen.clothes.ClothScreen
import com.example.sisicare.screen.clothes.ClothScreenViewModel
import com.example.sisicare.screen.food.FoodScreen
import com.example.sisicare.screen.food.FoodScreenViewModel
import com.example.sisicare.screen.donor.DonorScreen
import com.example.sisicare.screen.donor.DonorScreenViewModel
import com.example.sisicare.screen.sanitary.SanitaryScreen
import com.example.sisicare.screen.sanitary.SanitaryScreenViewModel

@Composable
fun NavigationGraph(navController: NavHostController, modifier: Modifier) {
    NavHost(navController, startDestination = BottomNavItem.Donor.route) {
        composable(BottomNavItem.Food.route) {
            FoodScreen(viewModel = FoodScreenViewModel(), navController = navController )
        }
        composable(BottomNavItem.Books.route) {
            BookScreen(viewModel = BookScreenViewModel(), navController = navController )
        }
        composable(BottomNavItem.Donor.route) {
            DonorScreen(viewModel = DonorScreenViewModel(), navController = navController )
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
        BottomNavItem.Food,
        BottomNavItem.Books,
        BottomNavItem.Donor,
        BottomNavItem.Sanitary,
        BottomNavItem.Clothes
    )
    androidx.compose.material.BottomNavigation(
        backgroundColor = Color.White,
        contentColor = Color.Black,
        modifier = Modifier
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        items.forEach { item ->
            BottomNavigationItem(
                icon = { Icon(
                    painterResource(id = item.icon),
                    contentDescription = item.title,
                    tint = Color.DarkGray
                ) },
                label = {
                    Text(
                        text = item.title,
                        fontSize = 16.sp,
                        color = Color.DarkGray,
                        softWrap = false,
                        overflow = TextOverflow.Visible,
                        modifier = Modifier.padding(horizontal = 2.dp)
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