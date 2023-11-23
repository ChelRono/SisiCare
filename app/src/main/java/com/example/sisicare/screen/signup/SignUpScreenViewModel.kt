package com.example.sisicare.screen.signup

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.sisicare.data.SignUpUIEvent
import com.example.sisicare.data.Validator
import com.example.sisicare.screen.navigation.NavigationItem
import com.example.sisicare.screen.navigation.NavigationSetup
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuth.AuthStateListener

class SignUpScreenViewModel : ViewModel() {

    private val TAG = SignUpScreenViewModel::class.simpleName

    var signUpScreenState = mutableStateOf(SignUpScreenState())

    var allValidationPassed = mutableStateOf(false)

    fun onEvent(event : SignUpUIEvent){
        validateDataWithRules()
        when(event){
            is SignUpUIEvent.FullNameChanged -> {
                signUpScreenState.value = signUpScreenState.value.copy(
                    fullName = event.fullName
                )
                printState()
            }
            is SignUpUIEvent.EmailChanged -> {
                signUpScreenState.value = signUpScreenState.value.copy(
                    email = event.email
                )
                printState()
            }
            is SignUpUIEvent.PasswordChanged -> {
                signUpScreenState.value = signUpScreenState.value.copy(
                    password = event.password
                )
                printState()
            }
            is SignUpUIEvent.ConfirmPasswordChanged -> {
                signUpScreenState.value = signUpScreenState.value.copy(
                    confirmPassword = event.confirmPassword
                )
                printState()
            }
            is SignUpUIEvent.SignUpButtonClicked -> {
                signUp()
            }
        }
    }

    private fun signUp() {
        Log.d(TAG,"Inside_signUp")
        printState()

        createUserInFirebase(
            email = signUpScreenState.value.email,
            password = signUpScreenState.value.password,
        )
    }

    private fun validateDataWithRules() {
        val fNameResult = Validator.validateFullName(
            fName = signUpScreenState.value.fullName
        )
        val emailResult = Validator.validateEmail(
            email = signUpScreenState.value.email
        )
        val  passwordResult = Validator.validatePassword(
            password = signUpScreenState.value.password
        )
        val confirmPasswordResult = Validator.validateConfirmPassword(
            cPassword = signUpScreenState.value.confirmPassword
        )
        Log.d(TAG,"Inside_validateDataWithRules")
        Log.d(TAG,"fNameResult = $fNameResult")
        Log.d(TAG,"emailResult = $emailResult")
        Log.d(TAG,"passwordResult = $passwordResult")
        Log.d(TAG,"confirmPasswordResult = $confirmPasswordResult")

        signUpScreenState.value = signUpScreenState.value.copy(
            fullNameError = fNameResult.status,
            emailError = emailResult.status,
            passwordError = passwordResult.status,
            confirmPasswordError = confirmPasswordResult.status
        )

        allValidationPassed.value = fNameResult.status && emailResult.status &&
                passwordResult.status && confirmPasswordResult.status
    }

    private fun printState(){
        Log.d(TAG,"Inside_printState")
        Log.d(TAG,signUpScreenState.value.toString())
    }

    private fun createUserInFirebase(email : String, password : String){
        FirebaseAuth
            .getInstance()
            .createUserWithEmailAndPassword(email,password)
            .addOnCompleteListener {
                Log.d(TAG, "inside_OnCompleteListener")
                Log.d(TAG, "isSuccessful = ${it.isSuccessful}")

                if (it.isSuccessful){
                    //NavigationSetup.navigateTo(NavigationItem.DonorScreen)
                }

            }
            .addOnFailureListener {
                Log.d(TAG, "Inside_OnFailureListener")
                Log.d(TAG, "Exception = ${it.message}")
                Log.d(TAG, "Exception = ${it.localizedMessage}")
            }
    }

    fun logout(){
        val firebaseAuth = FirebaseAuth.getInstance()

        firebaseAuth.signOut()

        val authStateListener = AuthStateListener{
            if (it.currentUser == null){
                Log.d(TAG,"Inside sign outsucess")
                NavigationSetup.navigateTo(NavigationItem.SignInDetails)

            }else{
                Log.d(TAG,"Inside sign out is not complete")
            }
        }
        firebaseAuth.addAuthStateListener (authStateListener)
    }

}