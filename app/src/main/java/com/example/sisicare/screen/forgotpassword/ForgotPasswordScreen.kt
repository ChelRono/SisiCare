package com.example.sisicare.screen.forgotpassword

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sisicare.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ForgotPasswordDetails() {
    var email by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .background(Color.White)
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = stringResource(id = R.string.forgotIntro),
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFfb8500),
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(25.dp))

        OutlinedTextField(
            value = email,
            onValueChange = { newValue ->
                email = newValue
            },
            modifier = Modifier
                .border(2.dp, Color.Gray, RoundedCornerShape(30.dp))
                .fillMaxWidth(),
            shape = RoundedCornerShape(30.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color(0xFFfb8500),
                unfocusedBorderColor = Color.DarkGray
            ),
            leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.email_24),
                    contentDescription = stringResource(id = R.string.iconDesc)
                )
            },
            placeholder = {
                Text(
                    text = stringResource(id = R.string.placeholderTitle),
                    color = Color.Gray
                )
            }
        )
        Spacer(modifier = Modifier.height(15.dp))

        Button(
            modifier = Modifier
                .height(50.dp)
                .fillMaxWidth(),
            onClick = {},
            shape = RoundedCornerShape(30.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFfb8500))
        ) {
            Text(
                text = stringResource(id = R.string.buttonText),
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
        }
        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = stringResource(id = R.string.forgotOutro),
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            color = Color.Gray

        )
    }
}

