package ir.mhe47880.onlineshopapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import ir.mhe47880.onlineshopapp.R
import ir.mhe47880.onlineshopapp.ui.theme.White

@Composable
fun CustomTopAppBar(navController: NavController) {

    //todo

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(75.dp)
            .background(White)
    ) {

        Row(
            modifier = Modifier
                .fillMaxHeight()
                .padding(start = 12.dp)
                .align(Alignment.CenterStart),
            verticalAlignment = Alignment.CenterVertically
        ) {

            IconButton(
                onClick = {
                    if (navController.previousBackStackEntry != null)
                        navController.popBackStack()
                }
            ) {
                Icon(
                    painter = painterResource(R.drawable.ic_arrow_back_left),
                    contentDescription = null
                )
            }

            Spacer(modifier = Modifier.width(2.dp))

            Image(
                modifier = Modifier.scale(1.5f),
                painter = painterResource(R.drawable.single_logo),
                contentDescription = "logo"
            )

            Spacer(modifier = Modifier.width(28.dp))

            Image(
                modifier = Modifier.scale(2f),
                painter = painterResource(R.drawable.single_online_shop_text),
                contentDescription = "logo"
            )
        }

        Row(
            modifier = Modifier
                .fillMaxHeight()
                .padding(end = 12.dp)
                .align(Alignment.CenterEnd),
            verticalAlignment = Alignment.CenterVertically
        ) {

            IconButton(
                onClick = { /* TODO */ }
            ) {
                Icon(
                    painterResource(R.drawable.ic_profile),
                    contentDescription = "Profile Section"
                )
            }

            IconButton(
                onClick = { /* TODO */ }
            ) {
                Icon(
                    painterResource(R.drawable.ic_notifications),
                    contentDescription = "Notifications Section"
                )
            }

            IconButton(
                onClick = { /* TODO */ }
            ) {
                Icon(
                    painterResource(R.drawable.ic_burger_menu),
                    contentDescription = "Burger Menu"
                )
            }

        }

    }

}