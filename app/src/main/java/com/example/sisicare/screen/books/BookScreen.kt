package com.example.sisicare.screen.books

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sisicare.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BookScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                actions = {
                    Icon(
                        painter = painterResource(id = R.drawable.book_24),
                        contentDescription = "" )
                },
                title = {
                        Text(
                            modifier = Modifier
                                .fillMaxWidth(),
                            text = "Discover",
                            textAlign = TextAlign.Center
                        )
                },
            )

        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
                .padding(paddingValues)
        ) {
            Spacer(modifier = Modifier.height(20.dp))

            DonationDisplay()
        }
    }
}

@Composable
fun DonationDisplay() {
    val listOfItems = mutableListOf(
        "Becoming",
        "Becoming",
        "Becoming",
        "Becoming",
        "Becoming",
        "Becoming",
    )
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier
            .fillMaxSize()

    ) {
        items(listOfItems) { item ->
            BookDetails(title = item)
        }
    }
}

@Composable
fun BookDetails(title : String){
    ElevatedCard(
        colors = CardDefaults.cardColors(
            containerColor = Color.White,
        ),
        elevation = CardDefaults.cardElevation(6.dp),
        modifier = Modifier
            .fillMaxSize()

    ) {
        Image(
            painter = painterResource(id = R.drawable.michelle),
            contentDescription = "",
            modifier = Modifier,
            contentScale = ContentScale.FillWidth
        )
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = title,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(horizontal = 16.dp)
        )
        Text(
            text = "Author : Michelle Obama",
            modifier = Modifier
                .padding(horizontal = 16.dp),
            color = Color.Gray,
            fontSize = 16.sp,
        )
        Spacer(modifier = Modifier.height(14.dp))

        Button(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .height(40.dp),
            onClick = {},
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFfb8500))
        ) {
            Text(
                text = "VIEW",
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
    }
}
