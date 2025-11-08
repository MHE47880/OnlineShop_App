package ir.mhe47880.onlineshopapp.ui.screens.bottomnav

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import ir.mhe47880.onlineshopapp.R
import ir.mhe47880.onlineshopapp.ui.components.Banner
import ir.mhe47880.onlineshopapp.ui.utils.DoubleBackToExit

@Composable
fun HomeScreen(paddingValues: PaddingValues = PaddingValues()) {

    DoubleBackToExit()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues)
    ) {

        Banner(
            modifier = Modifier
                .fillMaxWidth()
                .height(220.dp)
                .padding(horizontal = 24.dp, vertical = 32.dp),
            image = painterResource(R.drawable.banner),
            contentBoxText = stringResource(R.string.discount),
            onNextButtonClick = { /*TODO*/ },
            onPreviousButtonClick = { /*TODO*/ }
        )


    }

}