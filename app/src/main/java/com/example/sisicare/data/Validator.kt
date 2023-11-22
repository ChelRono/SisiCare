package com.example.sisicare.data

object Validator {

    fun validateFullName(fName : String) : ValidationResult{
        return ValidationResult(
            (!fName.isNullOrEmpty() && fName.length>=10)
        )
    }
    fun validateEmail(email : String) : ValidationResult{
        return ValidationResult(
            (!email.isNullOrEmpty())
        )

    }
    fun validatePassword(password : String) : ValidationResult{
        return ValidationResult(
            (!password.isNullOrEmpty() && password.length>=4)
        )
    }
    fun validateConfirmPassword(cPassword: String) : ValidationResult{
        return ValidationResult(
            (!cPassword.isNullOrEmpty() && cPassword.length>=4)
        )
    }
}

data class ValidationResult(
    val status :Boolean = false
)