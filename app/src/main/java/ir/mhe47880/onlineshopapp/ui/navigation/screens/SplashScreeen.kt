package ir.mhe47880.onlineshopapp.ui.navigation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import ir.mhe47880.onlineshopapp.R
import ir.mhe47880.onlineshopapp.ui.theme.White

@Composable
fun SplashScreen(){

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(White)
    ){

        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(R.drawable.splash_screen_banner),
            contentDescription = "Splash Screen",
            contentScale = ContentScale.Crop
        )

    }

}