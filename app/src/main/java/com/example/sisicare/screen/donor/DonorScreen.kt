package com.example.sisicare.screen.donor

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.sisicare.R


@Composable
fun DonorScreen(
    viewModel: DonorScreenViewModel,
    navController: NavController
) {
TopBar()
}

@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterialApi::class)
@Composable
fun TopBar(){
    var menuExpanded by remember {
        mutableStateOf(false)
    }
    Scaffold(
        modifier = Modifier
            .padding(horizontal = 20.dp),
        topBar = {
            TopAppBar(
                title = {},
                navigationIcon = {
                    IconButton(onClick = { /* doSomething() */ }) {
                        Icon(
                            painter = painterResource(id = R.drawable.volunteer_activism),
                            contentDescription = "",
                            tint = Color(0xFFfb8500),
                            modifier = Modifier
                                .size(30.dp)
                        )
                    }
                },
                actions = {
                    IconButton(
                        onClick = { menuExpanded = !menuExpanded }
                    ) {
                        Icon(
                            imageVector = Icons.Filled.MoreVert,
                            contentDescription = "Localized description"
                        )
                    }
                    DropdownMenu(
                        expanded = menuExpanded,
                        onDismissRequest = { menuExpanded = false },

                        ) {
                        // 6
                        DropdownMenuItem(
                            onClick = { /* TODO */ },
                        ) {
                            Text("Profile")
                        }
                        DropdownMenuItem(
                            onClick = { /* TODO */ },
                        ) {
                            Text("Settings")
                        }
                        DropdownMenuItem(
                            onClick = { },
                        ) { Text("LogOut") }
                    }
                }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
        ) {
            Text(
                text = "Hi Valarie !",
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
                modifier = Modifier
                    .padding(vertical = 10.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))
            CardInfo()
            Spacer(modifier = Modifier.height(20.dp))
            CategoryDetails()
            Spacer(modifier = Modifier.height(20.dp))
            FAQSection()
        }
    }
}

@Composable
fun CardInfo(){
    ElevatedCard(
        modifier = Modifier
            .fillMaxWidth()
            .size(width = 240.dp, height = 200.dp)
    ) {
        Row {
            Box (
                modifier = Modifier
                    .weight(1f)
                    .background(Color.Blue)
            ){
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(horizontal = 16.dp, vertical = 30.dp),
                ) {
                    Text(
                        text = "Giving back to the",
                        textAlign = TextAlign.Center,
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Giving back to the",
                        textAlign = TextAlign.Center,
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                    OutlinedButton(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(Color.White),
                        shape = RoundedCornerShape(12.dp),
                        modifier = Modifier
                            .padding(vertical = 30.dp)
                    ) {
                        Text(
                            text = "Donate",
                            color = Color(0xFFfb8500)
                        )
                    }
                }
            }
            Box (
                modifier = Modifier
                    .weight(1f)
            ){


            }

        }
    }
}

@Composable
fun CategoryDetails() {
    Column {
        Text(
            text = "Categories",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(10.dp))

        Row(
            modifier = Modifier
                .padding(vertical = 20.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                ElevatedCard(
                    modifier = Modifier
                        .size(width = 70.dp, height = 70.dp)

                ) {
                    Image(
                        painter = painterResource(id = R.drawable.food),
                        contentDescription = "",
                        contentScale = ContentScale.Inside,
                        modifier = Modifier
                            .fillMaxSize()
                    )
                }
                Text(text = "Food")
            }
            Column {
                ElevatedCard(
                    modifier = Modifier
                        .size(width = 70.dp, height = 70.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.library_books),
                        contentDescription = "",
                        contentScale = ContentScale.Inside,
                        modifier = Modifier
                            .fillMaxSize()
                    )
                }
                Text(text = "Books")
            }
            Column {
                ElevatedCard(
                    modifier = Modifier
                        .size(width = 70.dp, height = 70.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.woman),
                        contentDescription = "",
                        contentScale = ContentScale.Inside,
                        modifier = Modifier
                            .fillMaxSize()
                    )
                }
                Text(text = "Sanitary")
            }
            Column {
                ElevatedCard(
                    modifier = Modifier
                        .size(width = 70.dp, height = 70.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.apparel),
                        contentDescription = "",
                        contentScale = ContentScale.Inside,
                        modifier = Modifier
                            .fillMaxSize()
                    )
                }
                Text(text = "Clothes")
            }
            Spacer(modifier = Modifier.height(15.dp))
        }
        Text(
            text = "FAQ's",
            fontSize = 22.sp,
            fontWeight = FontWeight.SemiBold
        )
        Spacer(modifier = Modifier.height(10.dp))
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@ExperimentalMaterialApi
@Composable
fun ExpandableFAQCard(title: String, description: String) {
    var expandedState by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .animateContentSize(
                animationSpec = tween(
                    durationMillis = 400,
                    easing = LinearOutSlowInEasing
                )
            ),
        onClick = {
            expandedState = !expandedState
        },
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = title,
                    modifier = Modifier.weight(6f),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold,
                    maxLines =if(!expandedState) 1 else 3,
                    overflow =if(!expandedState) TextOverflow.Ellipsis else TextOverflow.Visible,

                    )
                IconButton(
                    onClick = { expandedState = !expandedState },
                    modifier = Modifier
                        .weight(1f)
                        .alpha(.5f),
                ) {
                    if (expandedState)
                        Icon(
                            painterResource(id = R.drawable.arrow_drop_up_24), contentDescription = "",
                            modifier = Modifier
                                .size(20.dp),
                        )
                    else
                        Icon(
                            imageVector = Icons.Default.Add, contentDescription = "",
                            modifier = Modifier
                                .size(20.dp),
                            tint = Color.Blue
                        )
                }
            }
            if (expandedState) {
                Text(
                    text = description,
                    modifier = Modifier.padding(bottom = 40.dp),
                    fontSize = 14.sp,
                    color = Color.Gray,
                    lineHeight = 18.sp
                )
            }
        }
    }
}

@ExperimentalMaterialApi
@Composable
fun FAQSection() {
    Column() {
        ExpandableFAQCard(
            "What does SisiCare do ?", "SisiCare connects the needy and donors" +
                    "in different locations " + "."
        )
        ExpandableFAQCard(
            "How can i give back to the community ?", "You can give back to the community" +
                    " by donating food, books, sanitary products, shoes and clothes."
        )
        ExpandableFAQCard(
            "How will the needy get what we give ?",
            "The items donated will be taken to shelters, food pantries around the community " +
                    "Some of the items such as sanitary products will be taken to schools"
        )
    }
}
@Composable
fun DonorcScreen(
    viewModel: DonorScreenViewModel,
    navController: NavController
){}