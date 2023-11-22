package com.example.sisicare.screen.signup

data class SignUpScreenState(
    var fullName :String = "",
    var email  :String = "",
    var password  :String = "",
    var confirmPassword  :String = "",

    var fullNameError :Boolean = false,
    var emailError :Boolean = false,
    var passwordError : Boolean = false,
    var confirmPasswordError: Boolean = false,
    var termsAcceptedError:Boolean = false
)

