package ir.mhe47880.onlineshopapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf

private val DarkColorScheme = darkColorScheme()

private val LightColorScheme = lightColorScheme()

val LocalExtendedColors = staticCompositionLocalOf {
    ExtendedColors(
        gradientStart = Light_Red,
        gradientEnd = Dark_Red
    )
}

@Composable
fun OnlineShopAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {

    val extendedColors = if (darkTheme) {
        ExtendedColors(
            Light_Red,
            Dark_Red
        )
    } else {
        ExtendedColors(
            //todo change this for dark mode
            Light_Red,
            Dark_Red
        )
    }

    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    CompositionLocalProvider(LocalExtendedColors provides extendedColors) {

        MaterialTheme(
            colorScheme = colorScheme,
            typography = Typography,
            content = content
        )

    }
}