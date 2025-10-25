package ir.mhe47880.onlineshopapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavDestination.Companion.hasRoute
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import ir.mhe47880.onlineshopapp.ui.navigation.routes.BottomNavScreens
import ir.mhe47880.onlineshopapp.ui.theme.Gray
import ir.mhe47880.onlineshopapp.ui.theme.Orange
import ir.mhe47880.onlineshopapp.ui.theme.White
import ir.mhe47880.onlineshopapp.ui.theme.hamisheh

@Composable
fun BottomNavigationBar(navController: NavHostController) {

    val currentBackStackEntry by navController.currentBackStackEntryAsState()

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(WindowInsets.navigationBars.asPaddingValues())
            .height(75.dp)
            .background(White),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {

        BottomNavScreens.bottomNavScreensList.forEach { screen ->

            val isSelected = currentBackStackEntry?.destination?.hasRoute(screen::class) ?: false

            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .width(60.dp),
                contentAlignment = Alignment.Center
            ) {

                if (isSelected) {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.TopCenter
                    ) {
                        Surface(
                            modifier = Modifier
                                .padding(horizontal = 10.dp)
                                .fillMaxWidth()
                                .height(4.dp),
                            shape = CircleShape,
                            color = Orange
                        ) {}
                    }
                }

                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {

                    IconButton(
                        onClick = {
                            if (!isSelected) {
                                navController.navigate(screen) {
                                    popUpTo(navController.graph.startDestinationId) {
                                        inclusive = false
                                    }
                                    launchSingleTop = true
                                    restoreState = true
                                }
                            }
                        }
                    ) {
                        Icon(
                            modifier = Modifier.scale(1.15f),
                            painter = painterResource(screen.icon),
                            contentDescription = null,
                            tint = null
                        )
                    }

                    Text(
                        text = stringResource(screen.faNameAddress),
                        style = TextStyle(
                            color = if (isSelected) Orange else Gray,
                            fontSize = 12.sp,
                            fontFamily = hamisheh,
                            fontWeight = FontWeight.Bold
                        ),
                        maxLines = 1
                    )

                }

            }

        }

    }

}