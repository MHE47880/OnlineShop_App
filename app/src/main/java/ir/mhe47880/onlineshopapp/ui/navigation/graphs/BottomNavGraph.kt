package ir.mhe47880.onlineshopapp.ui.navigation.graphs

import android.annotation.SuppressLint
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ir.mhe47880.onlineshopapp.ui.components.BackgroundTexture
import ir.mhe47880.onlineshopapp.ui.navigation.routes.BottomNavScreens
import ir.mhe47880.onlineshopapp.ui.screens.bottomnav.HomeScreen
import ir.mhe47880.onlineshopapp.ui.components.BottomNavigationBar
import ir.mhe47880.onlineshopapp.ui.screens.bottomnav.CategoriesScreen
import ir.mhe47880.onlineshopapp.ui.screens.bottomnav.ProfileScreen
import ir.mhe47880.onlineshopapp.ui.screens.bottomnav.ShoppingCartScreen

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SetupBottomNavigation() {

    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            BottomNavigationBar(navController = navController)
        }
    ) {

        NavHost(
            navController = navController,
            startDestination = BottomNavScreens.Home
        ) {

            composable<BottomNavScreens.Home> { HomeScreen() }
            composable<BottomNavScreens.Categories> { CategoriesScreen() }
            composable<BottomNavScreens.ShoppingCart> { ShoppingCartScreen() }
            composable<BottomNavScreens.Profile> { ProfileScreen() }

        }

        BackgroundTexture()

    }

}