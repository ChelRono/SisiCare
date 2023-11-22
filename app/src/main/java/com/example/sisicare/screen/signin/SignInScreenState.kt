package com.example.sisicare.screen.signin

data class SignInScreenState(
    var email :String = "",
    var password  :String = "",

    var emailError :Boolean = false,
    var passwordError : Boolean = false,
)
