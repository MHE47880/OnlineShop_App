package ir.mhe47880.onlineshopapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import ir.mhe47880.onlineshopapp.ui.screens.GetEmailScreen
import ir.mhe47880.onlineshopapp.ui.screens.SplashScreen
import ir.mhe47880.onlineshopapp.ui.screens.VerifyEmailScreen
import ir.mhe47880.onlineshopapp.ui.navigation.routes.Screens
import ir.mhe47880.onlineshopapp.ui.screens.GetProfileInformation

@Composable
fun SetupNavigation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screens.EmailRegistration
    ) {

        composable<Screens.SplashScreen> { SplashScreen() }

        navigation<Screens.EmailRegistration>(
            startDestination = Screens.GetProfileInformation
        ){

            composable<Screens.GetEmail> { GetEmailScreen() }

            composable<Screens.VerifyEmail> { VerifyEmailScreen() }

            composable<Screens.GetProfileInformation> { GetProfileInformation() }

        }

    }

}