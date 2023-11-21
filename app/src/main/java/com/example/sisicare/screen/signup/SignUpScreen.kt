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
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sisicare.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUpDetails() {
    var username by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmpassword by remember { mutableStateOf("") }
    var isChecked by remember { mutableStateOf(false) }
    var showPassword by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .background(Color.White)
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = stringResource(id = R.string.introText),
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFfb8500)
        )

        Spacer(modifier = Modifier.height(25.dp))

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
                    contentDescription = stringResource(id = R.string.userDesc)
                )
            },
            placeholder = {
                Text(
                    text = stringResource(id = R.string.userTitle),
                    color = Color.Gray
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
                    contentDescription = stringResource(id = R.string.emailDesc)
                )
            },
            placeholder = {
                Text(
                    text = stringResource(id = R.string.emailTitle),
                    color = Color.Gray
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
                    contentDescription = stringResource(id = R.string.passwordIcon1)
                )
            },
            trailingIcon = {
                if (showPassword) {
                    IconButton(onClick = { showPassword = false }) {
                        Icon(
                            painter = painterResource(id = R.drawable.visibility_24),
                            contentDescription = stringResource(id = R.string.passwordIcon2)
                        )
                    }
                } else {
                    IconButton(
                        onClick = { showPassword = true }) {
                        Icon(
                            painter = painterResource(id = R.drawable.visibility_off_24),
                            contentDescription = stringResource(id = R.string.passwordIcon2)
                        )
                    }
                }
            },
            placeholder = {
                Text(
                    text = stringResource(id = R.string.passwordTitle),
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

        OutlinedTextField(
            value = confirmpassword,
            onValueChange = {newValue ->
                confirmpassword = newValue
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
                    contentDescription = stringResource(id = R.string.passwordIcon1)
                )
            },
            trailingIcon = {
                if (showPassword) {
                    IconButton(onClick = { showPassword = false }) {
                        Icon(
                            painter = painterResource(id = R.drawable.visibility_24),
                            contentDescription = stringResource(id = R.string.passwordIcon2)
                        )
                    }
                } else {
                    IconButton(
                        onClick = { showPassword = true }) {
                        Icon(
                            painter = painterResource(id = R.drawable.visibility_off_24),
                            contentDescription = stringResource(id = R.string.passwordIcon2)
                        )
                    }
                }
            },
            placeholder = {
                Text(
                    text = stringResource(id = R.string.passwordTitle2),
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

        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(horizontal = 24.dp)
        ) {
            Checkbox(
                checked = isChecked,
                onCheckedChange = {isChecked = !isChecked},
            )

            Text(
                text = stringResource(id = R.string.checkboxText),
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier

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
            Text(
                text = stringResource(id = R.string.introText),
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
                text = stringResource(id = R.string.outroText1),
                modifier = Modifier
                    .padding(vertical = 24.dp)
            )
            Text(
                text = stringResource(id = R.string.outroText2),
                color = Color.Blue,
                modifier = Modifier
                    .padding(vertical = 24.dp)
            )
        }
    }
}


