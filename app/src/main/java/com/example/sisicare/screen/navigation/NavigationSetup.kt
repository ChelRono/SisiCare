package com.example.sisicare.screen.navigation

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.example.sisicare.R

sealed class NavigationItem {

    object OnBoardingPager : NavigationItem()

    object SignUpDetails :  NavigationItem()

    object SignInDetails : NavigationItem()

    object MainRoute : NavigationItem()

}

sealed class BottomNavItem(var title:String, var icon:Int, var route:String){
    object Food: BottomNavItem("Food", R.drawable.food,"food")
    object Books: BottomNavItem("Books",R.drawable.library_books,"books")
    object Donor : BottomNavItem("", R.drawable.volunteer_activism,"donor")
    object Sanitary: BottomNavItem("Sanitary", R.drawable.woman,"sanitary")
    object Clothes: BottomNavItem("Clothes",R.drawable.apparel,"clothes")
}

object NavigationSetup {

    var currentScreen: MutableState<NavigationItem> = mutableStateOf(NavigationItem.OnBoardingPager)

    fun navigateTo(destination : NavigationItem){
        currentScreen.value = destination
    }


}

