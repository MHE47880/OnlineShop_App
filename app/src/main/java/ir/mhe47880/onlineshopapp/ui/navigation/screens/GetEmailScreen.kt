package ir.mhe47880.onlineshopapp.ui.navigation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ir.mhe47880.onlineshopapp.R
import ir.mhe47880.onlineshopapp.ui.theme.Black
import ir.mhe47880.onlineshopapp.ui.theme.Dark_Red
import ir.mhe47880.onlineshopapp.ui.theme.Gray
import ir.mhe47880.onlineshopapp.ui.theme.Light_Red
import ir.mhe47880.onlineshopapp.ui.theme.White
import ir.mhe47880.onlineshopapp.ui.theme.iran_rounded

@Composable
fun GetEmailScreen() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFCF3EC))
    ) {

        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(R.drawable.main_background_texture),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = Modifier
                .align(Alignment.TopCenter),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Image(
                modifier = Modifier
                    .padding(vertical = 70.dp)
                    .size(300.dp),
                painter = painterResource(R.drawable.logo),
                contentDescription = stringResource(R.string.logo)
            )

            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp),
                text = stringResource(R.string.email_registration_text),
                style = TextStyle(
                    color = Black,
                    textDirection = TextDirection.Rtl,
                    fontFamily = iran_rounded,
                    fontWeight = FontWeight.Normal,
                    fontSize = 18.sp
                )
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp),
                text = stringResource(R.string.email),
                style = TextStyle(
                    color = Black,
                    textDirection = TextDirection.Rtl,
                    fontFamily = iran_rounded,
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp
                )
            )

            Spacer(modifier = Modifier.height(12.dp))

            TextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp),
                value = "",
                onValueChange = {},
                shape = RoundedCornerShape(12.dp),
                singleLine = true,
                textStyle = TextStyle(
                    textDirection = TextDirection.Rtl
                ),
                placeholder = {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = stringResource(R.string.place_holder),
                        style = TextStyle(
                            color = Gray,
                            textDirection = TextDirection.Rtl,
                            fontFamily = iran_rounded,
                            fontWeight = FontWeight.Normal,
                            fontSize = 14.sp
                        )
                    )
                },
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = White,
                    focusedContainerColor = White,
                    disabledContainerColor = White,
                    errorContainerColor = White,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent,
                    errorIndicatorColor = Color.Transparent
                )
            )

            Spacer(modifier = Modifier.height(16.dp))

            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent
                ),
                shape = RoundedCornerShape(12.dp),
                onClick = { /*todo*/ }
            ) {

                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(12.dp))
                        .fillMaxSize()
                        .background(
                            brush = Brush.linearGradient(
                                colors = listOf(
                                    Light_Red,
                                    Dark_Red
                                )
                            )
                        )
                        .padding(horizontal = 24.dp),
                    contentAlignment = Alignment.Center
                ) {

                    Text(
                        text = stringResource(R.string.accept),
                        style = TextStyle(
                            color = White,
                            textDirection = TextDirection.Rtl,
                            fontFamily = iran_rounded,
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp
                        )
                    )

                }

            }

        }

    }

}