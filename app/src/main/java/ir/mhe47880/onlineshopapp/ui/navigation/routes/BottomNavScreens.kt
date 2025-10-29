package ir.mhe47880.onlineshopapp.ui.navigation.routes

import androidx.annotation.DrawableRes
import ir.mhe47880.onlineshopapp.R
import kotlinx.serialization.Serializable

@Serializable
sealed class BottomNavScreens(
    val faNameAddress: Int,
    @param:DrawableRes val icon: Int
) {

    companion object {
        val bottomNavScreensList = listOf(
            Profile,
            ShoppingCart,
            Categories,
            Home
        )
    }

    @Serializable
    data object Profile : BottomNavScreens(
        faNameAddress = R.string.profile,
        icon = R.drawable.ic_user_octagon
    )

    @Serializable
    data object ShoppingCart : BottomNavScreens(
        faNameAddress = R.string.shopping_cart,
        icon = R.drawable.ic_shopping_cart
    )

    @Serializable
    data object Categories : BottomNavScreens(
        faNameAddress = R.string.categories,
        icon = R.drawable.ic_category
    )

    @Serializable
    data object Home : BottomNavScreens(
        faNameAddress = R.string.home,
        icon = R.drawable.ic_home
    )

}

