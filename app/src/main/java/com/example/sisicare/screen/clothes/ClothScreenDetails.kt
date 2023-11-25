package com.example.sisicare.screen.clothes

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DisplayMode
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.toSize
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.sisicare.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ClothScreenDetails() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Details",
                        textAlign = TextAlign.Right
                    ) },
                navigationIcon = {
                    IconButton(
                        onClick = {  }
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.arrow_back_24),
                            contentDescription = "back arrow",
                        )
                    }
                }
            )

        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(horizontal = 20.dp)
                .padding(paddingValues)
        ) {

            CategoryDetails()

            Spacer(modifier = Modifier.height(20.dp))

            QuantityDetails()

            Spacer(modifier = Modifier.height(20.dp))

            PhoneDetails()

            Spacer(modifier = Modifier.height(20.dp))

            DateDetails()

            Spacer(modifier = Modifier.height(20.dp))

            CountryDetails()

            Spacer(modifier = Modifier.height(20.dp))

            AddressDetails()

            Spacer(modifier = Modifier.height(50.dp))

            ClothesButton()
        }
    }
}
@Composable
fun TopBar(){
    Scaffold(
        topBar = {
            Icon(
                painter = painterResource(id = R.drawable.arrow_back_24),
                contentDescription = "back arrow"
            )
        }
    ) {paddingValues ->
        Text(
            text = "Clothes",
            modifier = Modifier
                .padding(paddingValues )
        )

    }
}

@Composable
fun CategoryDetails() {
    var expanded by remember { mutableStateOf(false) }
    val options = listOf("Clothes", "Shoes", )
    var selectedText by remember { mutableStateOf("") }
    var textFieldSize by remember { mutableStateOf(Size.Zero)}
    val icon = if (expanded)
        Icons.Filled.KeyboardArrowUp
    else
        Icons.Filled.KeyboardArrowDown

    OutlinedTextField(
        value = selectedText,
        onValueChange = { selectedText = it },
        modifier = Modifier
            .fillMaxWidth()
            .onGloballyPositioned { coordinates ->
                textFieldSize = coordinates.size.toSize()
            },
        label = { Text("Category") },
        trailingIcon = {
            Icon(icon, "contentDescription",
                Modifier.clickable { expanded = !expanded })
        },
    )
    DropdownMenu(
        expanded = expanded,
        onDismissRequest = { expanded = false },
        modifier = Modifier
            .width(with(LocalDensity.current) { textFieldSize.width.toDp() })
    ) {
        options.forEach { label ->
            DropdownMenuItem(onClick = {
                selectedText = label
                expanded = false
            }) {
                Text(text = label)
            }
        }
    }
}

@Composable
fun QuantityDetails(){
    var expanded by remember { mutableStateOf(false) }
    val quantity = listOf("1", "2","3","4","5","6","7","8","9","10","10+", )
    var selectedText by remember { mutableStateOf("") }
    var textFieldSize by remember { mutableStateOf(Size.Zero)}
    val icon = if (expanded)
        Icons.Filled.KeyboardArrowUp
    else
        Icons.Filled.KeyboardArrowDown

    OutlinedTextField(
        value = selectedText,
        onValueChange = { selectedText = it },
        modifier = Modifier
            .fillMaxWidth()
            .onGloballyPositioned { coordinates ->
                textFieldSize = coordinates.size.toSize()
            },
        label = { Text("Quantity") },
        trailingIcon = {
            Icon(icon, "contentDescription",
                Modifier.clickable { expanded = !expanded })
        }
    )
    DropdownMenu(
        expanded = expanded,
        onDismissRequest = { expanded = false },
        modifier = Modifier
            .width(with(LocalDensity.current) { textFieldSize.width.toDp() })
    ) {
        quantity.forEach { label ->
            DropdownMenuItem(onClick = {
                selectedText = label
                expanded = false
            }) {
                Text(text = label)
            }
        }
    }
}

@Composable
fun PhoneDetails(){
    var phoneNumber by remember { mutableStateOf("") }

    OutlinedTextField(
        value = phoneNumber,
        onValueChange = {  },
        modifier = Modifier
            .fillMaxWidth(),
        label = { Text("Mobile No.") },
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DateDetails(){
    var date by remember { mutableStateOf("") }
    var state = rememberDatePickerState(initialDisplayMode =  DisplayMode.Input)


    OutlinedTextField(
        value = date,
        onValueChange = {  },
        modifier = Modifier
            .fillMaxWidth(),
        label = { Text("Pickup Date") },
        trailingIcon = {
            IconButton(
                onClick = { }
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.calendar_month_24) ,
                    contentDescription = "Calendar"
                )
            }
        }
    )
}

@Composable
fun CountryDetails(){
    var country by remember { mutableStateOf("") }

    OutlinedTextField(
        value = country,
        onValueChange = {  },
        modifier = Modifier
            .fillMaxWidth(),
        label = { Text("Country") },
    )

}

@Composable
fun AddressDetails(){
    var address by remember { mutableStateOf("") }

    OutlinedTextField(
        value = address,
        onValueChange = {  },
        modifier = Modifier
            .fillMaxWidth(),
        label = { Text("Address") },
    )
}

@Composable
fun ClothesButton(){
    OutlinedButton(
        modifier = Modifier
            .height(60.dp)
            .fillMaxWidth(),
        onClick = {},
        shape = RoundedCornerShape(7.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFfb8500))
    ) {
        Text(
            text = "DONATE",
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp
        )
    }
}