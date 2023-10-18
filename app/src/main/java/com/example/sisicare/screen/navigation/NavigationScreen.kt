package com.example.sisicare.screen.navigation

import com.example.sisicare.R


sealed class BottomNavItem(var title:String, var icon:Int, var route:String){

    object Home : BottomNavItem("Home", R.drawable.home,"home")
    object Food: BottomNavItem("Food",R.drawable.food,"food")
    object Books: BottomNavItem("Books",R.drawable.library_books,"books")
    object Sanitary: BottomNavItem("Sanitary", R.drawable.female,"sanitary")
    object Clothes: BottomNavItem("Clothes",R.drawable.shopping_basket,"clothes")
}