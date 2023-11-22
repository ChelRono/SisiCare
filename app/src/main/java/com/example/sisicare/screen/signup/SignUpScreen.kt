package com.example.sisicare.screen.signup

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.sisicare.common.ButtonComponent
import com.example.sisicare.common.CheckboxComponent
import com.example.sisicare.common.ClickableLoginTextComponent
import com.example.sisicare.common.ConfirmPasswordComponent
import com.example.sisicare.common.EmailComponent
import com.example.sisicare.common.NameComponent
import com.example.sisicare.common.NormalText
import com.example.sisicare.common.PasswordComponent
import com.example.sisicare.data.SignUpUIEvent
import com.example.sisicare.screen.navigation.NavigationItem
import com.example.sisicare.screen.navigation.NavigationSetup

@Composable
fun SignUpDetails( signUpScreenViewModel: SignUpScreenViewModel = viewModel()) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(24.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        NormalText()

        Spacer(modifier = Modifier.height(25.dp))

        NameComponent(
            onTextSelected = {
                signUpScreenViewModel.onEvent(SignUpUIEvent.FullNameChanged(it))
            },
            errorStatus = signUpScreenViewModel.signUpScreenState.value.fullNameError
        )

        Spacer(modifier = Modifier.height(15.dp))

        EmailComponent(
            onTextSelected = {
                signUpScreenViewModel.onEvent(SignUpUIEvent.EmailChanged(it))
            },
            errorStatus = signUpScreenViewModel.signUpScreenState.value.emailError
        )

        Spacer(modifier = Modifier.height(15.dp))

        PasswordComponent(
            onTextSelected = {
                signUpScreenViewModel.onEvent(SignUpUIEvent.PasswordChanged(it))
            },
            errorStatus = signUpScreenViewModel.signUpScreenState.value.passwordError
        )

        Spacer(modifier = Modifier.height(15.dp))

        ConfirmPasswordComponent(
            onTextSelected = {
                signUpScreenViewModel.onEvent(SignUpUIEvent.ConfirmPasswordChanged(it))
            },
            errorStatus = signUpScreenViewModel.signUpScreenState.value.confirmPasswordError
        )

        Spacer(modifier = Modifier.height(15.dp))

        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(horizontal = 24.dp)
        ) {
          CheckboxComponent()
        }

        Spacer(modifier = Modifier.height(15.dp))

       ButtonComponent(
           isEnabled = signUpScreenViewModel.allValidationPassed.value,
           onButtonClicked = {
               signUpScreenViewModel.onEvent(SignUpUIEvent.SignUpButtonClicked)
           }
           )
    }
    Spacer(modifier = Modifier.height(15.dp))
    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
    ) {
       ClickableLoginTextComponent(tryingToLogin = true, onTextSelected = {
           NavigationSetup.navigateTo(NavigationItem.SignInDetails)
       } )
    }
}


