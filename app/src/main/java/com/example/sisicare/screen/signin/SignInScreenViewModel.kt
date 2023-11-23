package com.example.sisicare.screen.signin

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.sisicare.data.SignInUIEvent
import com.example.sisicare.data.Validator
import com.example.sisicare.screen.navigation.BottomNavItem
import com.example.sisicare.screen.navigation.NavigationItem
import com.example.sisicare.screen.navigation.NavigationSetup
import com.google.firebase.auth.FirebaseAuth

class SignInScreenViewModel : ViewModel() {
    private val TAG = SignInScreenViewModel::class.simpleName

    var signInScreenState = mutableStateOf(SignInScreenState())

    var allValidationsPassed = mutableStateOf(false)
    fun onEvent(event : SignInUIEvent){
        when(event){
            is SignInUIEvent.EmailChanged -> {
                signInScreenState.value = signInScreenState.value.copy(
                    email = event.email
                )
                printState()
            }
            is SignInUIEvent.PasswordChanged -> {
                signInScreenState.value = signInScreenState.value.copy(
                    password = event.password
                )
                printState()
            }
            is SignInUIEvent.SignInButtonClicked -> {
                signIn()
            }
        }
        validateSignInDataWithRules()
    }

    private fun validateSignInDataWithRules() {
        val emailResult = Validator.validateEmail(
            email = signInScreenState.value.email
        )
        val  passwordResult = Validator.validatePassword(
            password = signInScreenState.value.password
        )
        signInScreenState.value = signInScreenState.value.copy(
            emailError = emailResult.status,
            passwordError = passwordResult.status,
        )
        allValidationsPassed.value = emailResult.status && passwordResult.status
        }

    private fun signIn() {

        val email = signInScreenState.value.email
        val password = signInScreenState.value.password

        FirebaseAuth
            .getInstance()
            .signInWithEmailAndPassword(email, password)
            .addOnCompleteListener{
                Log.d(TAG, "Inside_signIn_success")
                Log.d(TAG, "${it.isSuccessful}")

                if (it.isSuccessful){
                   NavigationSetup.navigateTo(NavigationItem.MainRoute)

                }
            }
            .addOnFailureListener {
                Log.d(TAG, "Inside_signIn_failure")
                Log.d(TAG, it.localizedMessage)
            }
    }

    private fun printState(){
        Log.d(TAG,"Inside_printState")
        Log.d(TAG,signInScreenState.value.toString())
    }
}
