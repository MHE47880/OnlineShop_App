package ir.mhe47880.onlineshopapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import dagger.hilt.android.AndroidEntryPoint
import ir.mhe47880.onlineshopapp.ui.navigation.graphs.SetupNavigation
import ir.mhe47880.onlineshopapp.ui.theme.OnlineShopAppTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {

            OnlineShopAppTheme {

                SetupNavigation()

            }

        }

    }
}