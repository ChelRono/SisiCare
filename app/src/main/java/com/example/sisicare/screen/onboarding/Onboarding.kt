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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sisicare.R
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.rememberPagerState

@OptIn(ExperimentalPagerApi::class)
@Composable
fun OnBoardingDetails(page: Page) {
    val pagerState = rememberPagerState(pageCount = 3)
    Column(
            modifier = Modifier
                .fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            contentAlignment = Alignment.TopCenter
        ) {
            Image(
                painter = painterResource(id = page.image),
                contentDescription = stringResource(id = R.string.ContDesc1),
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                )
            }
        Box(
            modifier = Modifier
                .background(Color.White)
                .fillMaxWidth()
                .weight(0.6f)
                .clip(RoundedCornerShape(15.dp, 15.dp, 0.dp, 0.dp))
        ) {
            Column(
                modifier = Modifier
                    .padding(30.dp),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Top
                ) {
                    Text(
                        text = page.title,
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = page.description,
                        fontSize = 16.sp,
                        color = Color.Black
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
                        Button(
                            modifier = Modifier
                                .weight(0.4f),
                            onClick = { },
                            shape = RoundedCornerShape(10.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = Color.Gray)
                        ) {
                            Text(text = stringResource(id = R.string.SkipButton))
                            }
                        Button(
                            modifier = Modifier
                                .padding(start = 10.dp)
                                .weight(0.8f),
                            onClick = { },
                            shape = RoundedCornerShape(10.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFfb8500))
                        ) {
                            Text(text = stringResource(id = R.string.NextButton))
                            }
                    }
                }
            }
        }
    }

@OptIn(ExperimentalPagerApi::class)
@Composable
fun OnBoardingPager() {
    val pagerState = rememberPagerState(pageCount = 3)
        HorizontalPager(
            state = pagerState,
            modifier = Modifier
                .fillMaxWidth()
        ) { page ->
            OnBoardingDetails(page = onboardPages[page])
        }
    Column(
        verticalArrangement = Arrangement.Bottom,
        modifier = Modifier
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
}

