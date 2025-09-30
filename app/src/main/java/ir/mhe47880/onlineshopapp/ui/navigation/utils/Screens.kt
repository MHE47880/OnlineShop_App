package ir.mhe47880.onlineshopapp.ui.navigation.utils

import kotlinx.serialization.Serializable

@Serializable
sealed interface Screens {

    @Serializable
    data object SplashScreen : Screens

}