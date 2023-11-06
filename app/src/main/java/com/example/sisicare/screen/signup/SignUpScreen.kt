package com.example.sisicare.screen.signup

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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sisicare.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUpDetails() {
    var username by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .background(Color.White)
            .padding(24.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = "Sign Up",
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(15.dp))

        OutlinedTextField(
            value = username,
            onValueChange = {newValue ->
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
                    painter = painterResource(id = R.drawable.person),
                    contentDescription = "user"
                )
            }
        )

        Spacer(modifier = Modifier.height(15.dp))

        OutlinedTextField(
            value = email,
            onValueChange = {newValue ->
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
                    contentDescription = "email"
                )
            }
        )

        Spacer(modifier = Modifier.height(15.dp))

        OutlinedTextField(
            value = password,
            onValueChange = {newValue ->
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
                    contentDescription = "padlock"
                )
            },
            trailingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.eye_24),
                    contentDescription = "eye"
                )
            }
        )

        Spacer(modifier = Modifier.height(15.dp))

        OutlinedTextField(
            value = password,
            onValueChange = {newValue ->
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
                    contentDescription = "padlock"
                )
            },
            trailingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.eye_24),
                    contentDescription = "eye"
                )
            }
        )

        Spacer(modifier = Modifier.height(15.dp))

        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(horizontal = 24.dp)
        ) {
            Checkbox(
                checked = false,
                onCheckedChange = null
            )

            Text(
                text = "I agree to all the Terms & Conditions",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(start = 16.dp)
            )
        }

        Spacer(modifier = Modifier.height(15.dp))

        Button(
            modifier = Modifier
                .height(50.dp)
                .fillMaxWidth(),
            onClick = {},
            shape = RoundedCornerShape(30.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFfb8500))
        ) {
            Text(text = "Sign Up")
        }
    }
    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row {
            Text(
                text = "Already have an account?",
                modifier = Modifier
                    .padding(vertical = 24.dp)
            )
            Text(
                text = "Sign In",
                color = Color.Blue,
                modifier = Modifier
                    .padding(vertical = 24.dp)
            )
        }
    }
}


