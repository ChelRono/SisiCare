package com.example.sisicare.common

import android.util.Log
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sisicare.R

@Composable
fun NormalText (){
    Text(
        text = stringResource(id = R.string.introText),
        fontSize = 26.sp,
        fontWeight = FontWeight.Bold,
        color = Color(0xFFfb8500),
        modifier = Modifier
            .fillMaxWidth(),
        textAlign = TextAlign.Center
    )
}

@Composable
fun NameComponent(onTextSelected: (String) -> Unit, errorStatus :Boolean = false){
    var username by remember { mutableStateOf("") }

    OutlinedTextField(
        value = username,
        onValueChange = {newValue ->
            username = newValue
            onTextSelected(newValue)
        },
        modifier = Modifier
            .border(2.dp, Color.Gray, RoundedCornerShape(12.dp))
            .fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
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
        },
        keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
        isError = !errorStatus
    )
}

@Composable
fun EmailComponent(onTextSelected: (String) -> Unit, errorStatus :Boolean = false){
    var email by remember { mutableStateOf("") }
    OutlinedTextField(
        value = email,
        onValueChange = {newValue ->
            email = newValue
            onTextSelected(newValue)
        },
        modifier = Modifier
            .border(2.dp, Color.Gray, RoundedCornerShape(12.dp))
            .fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
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
        },
        keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
        isError = !errorStatus
    )
}

@Composable
fun PasswordComponent(onTextSelected: (String) -> Unit, errorStatus :Boolean = false){
    var password by remember { mutableStateOf("") }
    var showPassword by remember { mutableStateOf(false) }

    OutlinedTextField(
        value = password,
        onValueChange = {newValue ->
            password = newValue
            onTextSelected(newValue)
        },
        modifier = Modifier
            .border(2.dp, Color.Gray, RoundedCornerShape(12.dp))
            .fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
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
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password, imeAction = ImeAction.Next),
        isError = !errorStatus
    )
}

@Composable
fun ConfirmPasswordComponent(onTextSelected: (String) -> Unit, errorStatus :Boolean = false){
    var confirmpassword by remember { mutableStateOf("") }
    var showPassword by remember { mutableStateOf(false) }

    OutlinedTextField(
        value = confirmpassword,
        onValueChange = {newValue ->
            confirmpassword = newValue
            onTextSelected(newValue)
        },
        modifier = Modifier
            .border(2.dp, Color.Gray, RoundedCornerShape(12.dp))
            .fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
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
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password, imeAction = ImeAction.Done),
        isError = !errorStatus
    )
}

@Composable
fun CheckboxComponent(){
    var isChecked by remember { mutableStateOf(false) }

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

@Composable
fun ButtonComponent(isEnabled : Boolean = false, onButtonClicked : () -> Unit ){
    Button(
        modifier = Modifier
            .height(50.dp)
            .fillMaxWidth(),
        onClick = {
                  onButtonClicked.invoke()
        },
        shape = RoundedCornerShape(12.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFfb8500)),
        enabled = isEnabled
    ) {
        Text(
            text = stringResource(id = R.string.introText),
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp
        )
    }
}

@Composable
fun ClickableLoginTextComponent(tryingToLogin: Boolean = true, onTextSelected: (String) -> Unit) {
    val initialText =
        if (tryingToLogin) "Already have an account? " else "Don’t have an account yet? "
    val loginText = if (tryingToLogin) "Login" else "Register"

    val annotatedString = buildAnnotatedString {
        append(initialText)
        withStyle(style = SpanStyle(color = Color.Blue)) {
            pushStringAnnotation(tag = loginText, annotation = loginText)
            append(loginText)
        }
    }
    ClickableText(
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = 40.dp),
        style = TextStyle(
            fontSize = 18.sp,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal,
            textAlign = TextAlign.Center
        ),
        text = annotatedString,
        onClick = { offset ->

            annotatedString.getStringAnnotations(offset, offset)
                .firstOrNull()?.also { span ->
                    Log.d("ClickableTextComponent", "{${span.item}}")

                    if (span.item == loginText) {
                        onTextSelected(span.item)
                    }
                }
        },
    )
}