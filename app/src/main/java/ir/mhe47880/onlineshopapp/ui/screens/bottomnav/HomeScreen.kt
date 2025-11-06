package ir.mhe47880.onlineshopapp.ui.screens.bottomnav

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ir.mhe47880.onlineshopapp.ui.utils.DoubleBackToExit

@Composable
fun HomeScreen(paddingValues: PaddingValues = PaddingValues()) {

    DoubleBackToExit()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues)
    ) {

    }

}