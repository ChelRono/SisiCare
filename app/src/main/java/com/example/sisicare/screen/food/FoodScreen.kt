
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
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
import androidx.navigation.NavController
import com.example.sisicare.R
import com.example.sisicare.screen.food.FoodScreenViewModel


@Composable
fun FoodScreen(
    viewModel: FoodScreenViewModel,
    navController: NavController
) {
    var organisation by remember { mutableStateOf("") }


    Column(
        modifier = Modifier
            .padding(20.dp)
            .fillMaxSize()
    ) {
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
                painter = painterResource(id = R.drawable.people),
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
                text = "Dry Foods only",
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
                    painter = painterResource(id = R.drawable.people),
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

@Composable
fun FavoriteDetails(){
    Column {
        Text(
            text = "Favorites",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(horizontal = 16.dp)
        )
        Card {

        }
    }

}