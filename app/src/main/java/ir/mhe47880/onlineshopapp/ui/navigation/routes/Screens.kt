package ir.mhe47880.onlineshopapp.ui.navigation.routes

import kotlinx.serialization.Serializable

@Serializable
sealed interface Screens {

    @Serializable
    data object SplashScreen : Screens

    //region Email registration & verify
    @Serializable
    data object EmailRegistration : Screens

    @Serializable
    data object GetEmail : Screens

    @Serializable
    data object VerifyEmail : Screens
    //endregion

}