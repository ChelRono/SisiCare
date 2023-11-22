package com.example.sisicare.screen.signin

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.sisicare.R
import com.example.sisicare.common.ClickableLoginTextComponent
import com.example.sisicare.common.EmailComponent
import com.example.sisicare.common.NameComponent
import com.example.sisicare.common.PasswordComponent
import com.example.sisicare.data.SignInUIEvent
import com.example.sisicare.screen.navigation.NavigationItem
import com.example.sisicare.screen.navigation.NavigationSetup

@Composable
fun SignInDetails(signInScreenViewModel: SignInScreenViewModel = viewModel()) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = stringResource(id = R.string.loginIntro),
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFfb8500),
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(25.dp))

        EmailComponent(
            onTextSelected = {
                signInScreenViewModel.onEvent(SignInUIEvent.EmailChanged(it))
            },
            errorStatus = signInScreenViewModel.signInScreenState.value.emailError
        )

        Spacer(modifier = Modifier.height(15.dp))

        PasswordComponent(
            onTextSelected = {
                signInScreenViewModel.onEvent(SignInUIEvent.PasswordChanged(it))
            },
            errorStatus = signInScreenViewModel.signInScreenState.value.passwordError
        )

        Spacer(modifier = Modifier.height(15.dp))

        Text(
            text = stringResource(id = R.string.forgot),
            fontSize = 14.sp,
            modifier = Modifier
                .align(Alignment.End),
            color = Color.Gray
        )
        Spacer(modifier = Modifier.height(15.dp))

        Button(
            modifier = Modifier
                .height(50.dp)
                .fillMaxWidth(),
            onClick = {
                      signInScreenViewModel.onEvent(SignInUIEvent.SignInButtonClicked)

            },
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFfb8500))
        ) {
            Text(
                text = stringResource(id = R.string.signInButton),
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
        }
    }
    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
    ) {
        Row {
            ClickableLoginTextComponent(tryingToLogin = false, onTextSelected = {
                NavigationSetup.navigateTo(NavigationItem.SignUpDetails)
            })
        }
    }
}