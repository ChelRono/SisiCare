package com.example.sisicare.screen.sanitary

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.sisicare.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SanitaryScreen(
    viewModel: SanitaryScreenViewModel,
    navController: NavController
){
    Scaffold(
        topBar = {
            TopAppBar(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp),
                actions = {
                    Icon(
                        painter = painterResource(id = R.drawable.woman),
                        contentDescription = stringResource(id = R.string.imagedesc1) )
                },
                navigationIcon = {
                    IconButton(onClick = {  }) {
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
            Text(text = "Sanitary")
        }
    }
}