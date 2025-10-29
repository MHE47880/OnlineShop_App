package ir.mhe47880.onlineshopapp.ui.utils

import androidx.activity.compose.LocalActivity
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.core.view.WindowInsetsControllerCompat

@Suppress("DEPRECATION")
@Composable
fun SetStatusBarColor(
    color: Color,
    darkIcons: Boolean = true
) {
    val activity = LocalActivity.current ?: return

    SideEffect {
        val window = activity.window
        window.statusBarColor = color.toArgb()
        WindowInsetsControllerCompat(window, window.decorView)
            .isAppearanceLightStatusBars = darkIcons
    }
}
