package ir.mhe47880.onlineshopapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import ir.mhe47880.onlineshopapp.R

@Composable
fun Logo(modifier: Modifier){

    Image(
        modifier = modifier,
        painter = painterResource(R.drawable.logo),
        contentDescription = stringResource(R.string.logo)
    )

}