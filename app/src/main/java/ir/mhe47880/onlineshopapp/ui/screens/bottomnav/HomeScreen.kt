package ir.mhe47880.onlineshopapp.ui.screens.bottomnav

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ir.mhe47880.onlineshopapp.ui.theme.Creamy
import ir.mhe47880.onlineshopapp.ui.utils.DoubleBackToExit

@Composable
fun HomeScreen(paddingValues: PaddingValues = PaddingValues()) {

    DoubleBackToExit()

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Creamy)
            .padding(paddingValues)
    ) {


    }

}