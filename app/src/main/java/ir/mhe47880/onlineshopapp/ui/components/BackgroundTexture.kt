package ir.mhe47880.onlineshopapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import ir.mhe47880.onlineshopapp.R
import ir.mhe47880.onlineshopapp.ui.theme.Creamy

@Composable
fun BackgroundTexture(paddingValues: PaddingValues = PaddingValues()) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Creamy)
            .padding(paddingValues)
    ) {
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(R.drawable.main_background_texture),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
    }

}