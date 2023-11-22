package com.example.sisicare.screen.navigation

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

sealed class NavigationItem {

    object SignUpDetails :  NavigationItem()

    object SignInDetails : NavigationItem()

    object OnBoardingPager : NavigationItem()

    object DonorScreen : NavigationItem()

}

object NavigationSetup {

    var currentScreen: MutableState<NavigationItem> = mutableStateOf(NavigationItem.SignUpDetails)

    fun navigateTo(destination : NavigationItem){
        currentScreen.value = destination
    }


}

