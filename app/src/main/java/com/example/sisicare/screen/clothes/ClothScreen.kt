package com.example.sisicare.screen.clothes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.sisicare.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ClothScreen(
    viewModel: ClothScreenViewModel,
    navController: NavController
) {
    Scaffold(
        topBar = {
            TopAppBar(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp),
                actions = {
                    Icon(
                        painter = painterResource(id = R.drawable.woman),
                        contentDescription = stringResource(id = R.string.imagedesc1)
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { }) {
                        Icon(
                            painter = painterResource(id = R.drawable.volunteer_activism),
                            contentDescription = "",
                            tint = Color(0xFFfb8500),
                            modifier = Modifier
                                .size(30.dp)
                        )
                    }
                },
                title = {},
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
        ) {

            Box(
                modifier = Modifier
                    .padding(24.dp)
                    .fillMaxWidth()
                    .weight(1F),
            ) {
                Column {
                    CardDetails()
                    Spacer(modifier = Modifier.height(15.dp))
                    CardDetails()
                    Spacer(modifier = Modifier.height(15.dp))
                    CardDetails()
                }
            }
            Box(
                modifier = Modifier
                    .padding(24.dp)
                    .fillMaxWidth(),
                contentAlignment = Alignment.BottomEnd
            ) {

                DonateButton()
            }
        }
    }
}

@Composable
fun DonateButton() {
    ExtendedFloatingActionButton(
        onClick = {   },
        shape = RoundedCornerShape(12.dp),
        containerColor = Color(0xFFfb8500),
        elevation = FloatingActionButtonDefaults.bottomAppBarFabElevation(5.dp),
        modifier = Modifier
            .padding(vertical = 40.dp)

    ) {
        Icon(Icons.Filled.Add, "Floating action button.")
        Text(text = "ADD")
    }
}

@Composable
fun CardDetails(){
    ElevatedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        modifier = Modifier

    ) {
        Column(
            modifier = Modifier
                .padding(16.dp),
        ) {
            Text(
                text = "Name : Valarie Rono",
                textAlign = TextAlign.Center,
            )
            Text(
                text = "Location : Annex",
                textAlign = TextAlign.Center,
            )
            Text(
                text = "Date : 21/03/2023",
                textAlign = TextAlign.Center,
            )
        }
    }
}