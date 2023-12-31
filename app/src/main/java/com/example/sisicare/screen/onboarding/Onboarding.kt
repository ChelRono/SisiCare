package com.example.sisicare.screen.onboarding


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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sisicare.R
import com.example.sisicare.screen.navigation.NavigationItem
import com.example.sisicare.screen.navigation.NavigationSetup
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.rememberPagerState
import kotlinx.coroutines.launch
import java.util.Stack

@Composable
fun OnBoardingDetails(page: Page) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Box(
            modifier = Modifier
        ) {
         Column (
             verticalArrangement = Arrangement.Top,
             horizontalAlignment = Alignment.CenterHorizontally,
             modifier = Modifier
                 .padding(20.dp)
                 .fillMaxSize()
         ){
             Image(
                 painter = painterResource(id = page.image),
                 contentDescription = "",
                 contentScale = ContentScale.None,
                 modifier = Modifier
             )
         }
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(24.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = page.title,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = page.description,
                    color = Color.Black,
                    modifier = Modifier
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun OnBoardingPager( ) {
    val pagerState = rememberPagerState()
    val scope = rememberCoroutineScope()


    HorizontalPager(
        state = pagerState,
        count = 3,
        modifier = Modifier
            .fillMaxWidth()
    ) { page ->
        OnBoardingDetails(page = onboardPages[page])
    }
    Column(
        verticalArrangement = Arrangement.Bottom,
        modifier = Modifier
            .fillMaxSize()
            .padding(65.dp)
    ) {
        HorizontalPagerIndicator(
            pagerState = pagerState,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(20.dp),
            activeColor = colorResource(R.color.purple_500),
            indicatorWidth = 10.dp
        )
    }
    Box(
        modifier = Modifier
            .padding(horizontal = 30.dp, vertical = 24.dp)
            .fillMaxSize(),
        contentAlignment = Alignment.BottomStart
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            if (pagerState.currentPage == 2) {
                Button(
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .weight(0.8f),
                    onClick = {
                              NavigationSetup.navigateTo(NavigationItem.SignUpDetails)
                    },
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFfb8500))
                ) {
                    Text(text = "GET STARTED")
                }
            } else {
                Button(
                    modifier = Modifier
                        .weight(0.4f),
                    onClick = {
                        scope.launch {
                            if (pagerState.currentPage == 3) {
                                //Navigate to Login screen
                            } else {
                                pagerState.animateScrollToPage(
                                    page = pagerState.currentPage +2
                                )
                            }
                        }
                    },
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Gray)
                ) {
                    Text(text = stringResource(id = R.string.SkipButton))
                }
                Button(
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .weight(0.8f),
                    onClick = {
                        scope.launch {
                            if (pagerState.currentPage == 3) {
                                //Navigate to Login screen
                            } else {
                                pagerState.animateScrollToPage(
                                    page = pagerState.currentPage + 1
                                )
                            }
                        }
                    },
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(containerColor =  Color(0xFFfb8500))
                ) {
                    Text(text = stringResource(id = R.string.NextButton))
                }
            }
        }
    }
}