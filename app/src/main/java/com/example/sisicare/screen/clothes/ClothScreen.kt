package com.example.sisicare.screen.clothes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun ClothesScreen(){
    Column {
        Box(
            modifier = Modifier
                .background(Color.Red)
        ) {
            Text(
                text = "Box 1",
            )
        }
        Box(
            modifier = Modifier
                .background(Color.Blue)
        ) {
            Text(
                text = "Box 2",
            )
        }
    }
}