package com.example.sisicare.data

sealed class SignUpUIEvent {
    data class FullNameChanged(val fullName:String) : SignUpUIEvent()
    data class EmailChanged(val email:String): SignUpUIEvent()
    data class PasswordChanged(val password: String) : SignUpUIEvent()
    data class ConfirmPasswordChanged(val confirmPassword:String) : SignUpUIEvent()

    object SignUpButtonClicked : SignUpUIEvent()

}
