package ir.mhe47880.onlineshopapp.ui.navigation.graphs

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ir.mhe47880.onlineshopapp.ui.components.BackgroundTexture
import ir.mhe47880.onlineshopapp.ui.components.BottomNavigationBar
import ir.mhe47880.onlineshopapp.ui.components.CustomTopAppBar
import ir.mhe47880.onlineshopapp.ui.navigation.routes.BottomNavScreens
import ir.mhe47880.onlineshopapp.ui.screens.bottomnav.CategoriesScreen
import ir.mhe47880.onlineshopapp.ui.screens.bottomnav.HomeScreen
import ir.mhe47880.onlineshopapp.ui.screens.bottomnav.ProfileScreen
import ir.mhe47880.onlineshopapp.ui.screens.bottomnav.ShoppingCartScreen
import ir.mhe47880.onlineshopapp.ui.theme.White
import ir.mhe47880.onlineshopapp.ui.utils.SetStatusBarColor

@Composable
fun MainNavGraph() {

    val navController = rememberNavController()

    SetStatusBarColor(color = White)

    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .padding(WindowInsets.statusBars.asPaddingValues()),
        topBar = {
            CustomTopAppBar(navController = navController)
        },
        bottomBar = {
            BottomNavigationBar(navController = navController)
        }
    ) { innerPadding ->

        BackgroundTexture(paddingValues = innerPadding)

        NavHost(
            navController = navController,
            startDestination = BottomNavScreens.Home
        ) {

            composable<BottomNavScreens.Home> { HomeScreen(paddingValues = innerPadding) }
            composable<BottomNavScreens.Categories> { CategoriesScreen(paddingValues = innerPadding) }
            composable<BottomNavScreens.ShoppingCart> { ShoppingCartScreen(paddingValues = innerPadding) }
            composable<BottomNavScreens.Profile> { ProfileScreen(paddingValues = innerPadding) }

        }

    }

}