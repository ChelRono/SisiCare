package com.example.sisicare.screen.food

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sisicare.R


@Composable
fun FoodScreenDetails(){
    Column {
        Box{
            Image(
                painterResource(id = R.drawable.bank2),
                modifier = Modifier
                    .clip(RoundedCornerShape(0.dp,0.dp,30.dp,30.dp))
                    .fillMaxWidth(),
                contentDescription = "",
                contentScale = ContentScale.FillWidth,
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                IconButton(onClick = { }) {
                    Icon(
                        painter = painterResource(id = R.drawable.arrow_back_24),
                        contentDescription = "",
                        modifier = Modifier

                    )
                }
                IconButton(
                    onClick = { /*TODO*/ }
                ) {
                    Icon(
                        imageVector = Icons.Default.FavoriteBorder,
                        contentDescription = "",
                        tint = Color.Black
                    )
                }
            }
        }
        BankDetails()

        DonateButton()

    }
}

@Composable
fun BankDetails(){
    Column(
        modifier = Modifier
            .padding(20.dp)
    ) {
        Row (
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(
                text = "The Food Centre",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                )

            Button(
                    onClick = {  },
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.buttonColors(Color(0xFFfb8500),)

                ) {
                    Text(
                        text = "DONATE",
                        )
            }
        }
        Spacer(modifier = Modifier.height(15.dp))
        Row {
            Icon(
                painter = painterResource(id = R.drawable.location_on_24),
                contentDescription = "",
                tint = Color(0xFFfb8500)
            )
            Spacer(modifier = Modifier.width(10.dp))

            Text(
                text = "Los Angeles",
                fontWeight = FontWeight.SemiBold,
                color = Color.LightGray
                )

            Spacer(modifier = Modifier.width(20.dp))

            Icon(
                painter = painterResource(id = R.drawable.time_24),
                contentDescription = "",
                tint = Color(0xFFfb8500)
            )
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                text = "20-25 Min",
                fontWeight = FontWeight.SemiBold,
                color = Color.LightGray
                )
        }
        Spacer(modifier = Modifier.height(15.dp))

        Text(
            text = "Description",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
            )
        Spacer(modifier = Modifier.height(15.dp))
            Text(
                text = "This food bank was founded in 2005 to help people who cannot afford to feed themselves or their families.",
                fontWeight = FontWeight.SemiBold,
                color = Color.LightGray
            )
        Spacer(modifier = Modifier.height(15.dp))
        Text(
            text = "Shopping List",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(15.dp))
        Row {
            Checkbox(checked = false, onCheckedChange = {})
            Text(
                text = "Dry Foods",
                modifier = Modifier
                    .align(Alignment.CenterVertically)
            )
        }
        Row {
            Checkbox(checked = false, onCheckedChange = {})
            Text(
                text = "Cooked Food",
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                )
        }
        Spacer(modifier = Modifier.height(15.dp))


    }
}

@Composable
fun DonateButton(){
    Button(
        onClick = {  },
        shape = RoundedCornerShape(12.dp),
        colors = ButtonDefaults.buttonColors(Color(0xFFfb8500),),
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp)

    ) {
        Text(
            text = "Checkout",
            fontSize = 18.sp
        )
    }

}