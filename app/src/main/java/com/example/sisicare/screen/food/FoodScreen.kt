package com.example.sisicare.screen.food

import android.provider.ContactsContract.CommonDataKinds.Organization
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
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
            .fillMaxSize()
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
        Spacer(modifier = Modifier.height(20.dp))

        OrganisationList()

        Spacer(modifier = Modifier.height(20.dp))

        OrganizationCard()

    }
}

@Composable
fun OrganisationList() {
    val listOfItems = mutableListOf(
        "The Food Centre",
        "No kid hungry",
        "Feed a child",
        "City Harvest"
    )
    Text(
            text = "Organisations near you",
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
    )
    LazyHorizontalGrid(
        rows = GridCells.Fixed(1),
        horizontalArrangement = Arrangement.spacedBy(30.dp),
        modifier = Modifier
            .padding(vertical = 10.dp)
        ) {
        items(listOfItems) { item ->

            CardDetails(title = item)

        }
    }
}

@Composable
fun CardDetails(title: String) {
    Column (
        modifier = Modifier
    ){
        ElevatedCard (
            colors = CardDefaults.cardColors(
            containerColor = Color.White,
                ),
            elevation = CardDefaults.cardElevation(6.dp),
            modifier = Modifier
                .size(width = 240.dp, height = 370.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.foodbank),
                contentDescription = "",
                modifier = Modifier,
                contentScale = ContentScale.FillWidth
            )
            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = title,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(horizontal = 16.dp)
            )
            Row {
                Icon(
                   painter = painterResource(id = R.drawable.location_on_24) ,
                   contentDescription = "location",
                   tint = Color(0xFFfb8500),
                   modifier = Modifier
                    .padding(horizontal = 16.dp)
                )
                Text(
                   text = "Los Angeles, California",
                   color = Color.Gray,
                   fontSize = 16.sp
                )
            }
            Text(
                text = "This center is a food bank that accepts dry foods and money to buy food",
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
                    text = "DONATE ",
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
            }
        }
    }
}

@Composable
fun OrganizationCard() {
    Column {
        Text(
            text = "Donate Again",
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
        )
        ElevatedCard(
            colors = CardDefaults.cardColors(
                containerColor = Color.White,
            ),
            elevation = CardDefaults.cardElevation(6.dp),
            modifier = Modifier
                .size(240.dp)
        ) {
            Column {
                Image(
                    painter = painterResource(id = R.drawable.foodbank),
                    contentDescription = "",
                    contentScale = ContentScale.FillBounds
                )
            }
        }
        Text(
            text = "The Food Centre",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(vertical = 10.dp)

        )
    }
}