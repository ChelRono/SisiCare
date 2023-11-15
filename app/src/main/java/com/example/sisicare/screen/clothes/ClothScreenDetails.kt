package com.example.sisicare.screen.clothes

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
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

@Composable
fun ClothScreenDetails(){
    Column(
        modifier = Modifier
            .padding(20.dp)
    ){
        CategoryDetails()

        Spacer(modifier = Modifier.height(10.dp))

        QuantityDetails()
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
            }
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

}



