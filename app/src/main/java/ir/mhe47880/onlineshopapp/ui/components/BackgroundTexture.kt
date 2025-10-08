package ir.mhe47880.onlineshopapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import ir.mhe47880.onlineshopapp.R

@Composable
fun BackgroundTexture() {

    Image(
        modifier = Modifier.fillMaxSize(),
        painter = painterResource(R.drawable.main_background_texture),
        contentDescription = null,
        contentScale = ContentScale.Crop
    )

}