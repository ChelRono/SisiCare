package com.example.sisicare

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.sisicare.app.NavigationApp
import com.example.sisicare.screen.books.BookScreenDetails
import com.example.sisicare.screen.food.FoodScreenDetails
import com.example.sisicare.screen.navigation.BottomNavigation
import com.example.sisicare.screen.navigation.NavigationGraph
import com.example.sisicare.screen.signin.SignInDetails
import com.example.sisicare.screen.signup.SignUpDetails
import com.example.sisicare.ui.theme.SisiCareTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SisiCareTheme {

                   //NavigationApp()
                //FoodScreenDetails()
                BookScreenDetails()
            }
        }
    }
}


@Composable
fun MainContent() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
            BottomNavigation(navController = navController)
        }
    ) {paddingValues ->
        NavigationGraph(navController = navController, modifier = Modifier.padding(paddingValues))
    }
}