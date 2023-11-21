package com.example.sisicare.screen.signin

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sisicare.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignInDetails() {
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var showPassword by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .background(Color.White)
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = "Sign In",
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFfb8500)
        )
        Spacer(modifier = Modifier.height(25.dp))

        OutlinedTextField(
            value = username,
            onValueChange = { newValue ->
                username = newValue
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
                    painter = painterResource(id = R.drawable.person_24),
                    contentDescription = ""
                )
            },
            placeholder = {
                Text(
                    text = "Name or Email",
                    color = Color.Gray
                )
            }
        )
        Spacer(modifier = Modifier.height(15.dp))

        OutlinedTextField(
            value = password,
            onValueChange = { newValue ->
                password = newValue
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
                    painter = painterResource(id = R.drawable.lock_24),
                    contentDescription = ""
                )
            },
            trailingIcon = {
                if (showPassword) {
                    IconButton(onClick = { showPassword = false }) {
                        Icon(
                            painter = painterResource(id = R.drawable.visibility_24),
                            contentDescription = ""
                        )
                    }
                } else {
                    IconButton(
                        onClick = { showPassword = true }) {
                        Icon(
                            painter = painterResource(id = R.drawable.visibility_off_24),
                            contentDescription = ""
                        )
                    }
                }
            },
            placeholder = {
                Text(
                    text = "Password",
                    color = Color.Gray
                )
            },
            visualTransformation = if (showPassword) {
                VisualTransformation.None
            } else {
                PasswordVisualTransformation()
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )
        Spacer(modifier = Modifier.height(15.dp))

        Text(
            text = "Forgot Password?",
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
            onClick = {},
            shape = RoundedCornerShape(30.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFfb8500))
        ) {
            Text(
                text = "Sign In",
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
        }
    }
    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row {
            Text(
                text = "Don't have an account?",
                modifier = Modifier
                    .padding(vertical = 24.dp)
            )
            Text(
                text = "Sign Up",
                color = Color.Blue,
                modifier = Modifier
                    .padding(vertical = 24.dp)
            )
        }
    }
}


