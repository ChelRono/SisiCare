package com.example.sisicare.screen.donor

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sisicare.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    Scaffold(
        modifier = Modifier
            .padding(20.dp),
        topBar = {
            TopAppBar(
                title = { },
                actions = {
                    IconButton(
                        onClick = { /*TODO*/ },
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.girl),
                            contentDescription = "person",
                            modifier = Modifier
                                .clip(CircleShape)
                        )
                    }
                }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
        ) {
            Text(
                text = "Hi Valarie !",
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp
            )
        }
    }
}