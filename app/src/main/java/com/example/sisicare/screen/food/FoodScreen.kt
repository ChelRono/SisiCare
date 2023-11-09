package com.example.sisicare.screen.food

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sisicare.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FoodScreen() {
    var organisation by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .padding(20.dp)
    ) {
        Row {
            Icon(
                painter = painterResource(id = R.drawable.location_on_24),
                contentDescription = "location",
                tint = Color(0xFFfb8500)
            )
            Spacer(modifier = Modifier.width(5.dp))

            Text(
                text = "Los Angeles ,California",
                fontSize = 14.sp
            )
            Spacer(modifier = Modifier.width(10.dp))

            Text(
                text = "Change",
                color = Color(0xFFfb8500),
                fontSize = 14.sp
            )
        }
        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = organisation,
            onValueChange = {newValue ->
                organisation = newValue
            },
            modifier = Modifier
                .border(2.dp, Color.Gray, RoundedCornerShape(12.dp))
                .fillMaxWidth(),
            shape = RoundedCornerShape(12.dp),
            leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.search_24),
                    contentDescription = "search icon"
                )
            },
            placeholder = {
                Text(
                    text = "Search for organisations",
                    color = Color.Gray
                )
            }
        )
    }
}

