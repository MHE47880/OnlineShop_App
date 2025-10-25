package ir.mhe47880.onlineshopapp.ui.screens.register_and_login

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import ir.mhe47880.onlineshopapp.R
import ir.mhe47880.onlineshopapp.ui.components.BackgroundTexture
import ir.mhe47880.onlineshopapp.ui.components.BoldTextFieldHeader
import ir.mhe47880.onlineshopapp.ui.components.CustomTextField
import ir.mhe47880.onlineshopapp.ui.components.GradientButton
import ir.mhe47880.onlineshopapp.ui.components.Logo
import ir.mhe47880.onlineshopapp.ui.navigation.routes.Screens
import ir.mhe47880.onlineshopapp.ui.theme.Gray
import ir.mhe47880.onlineshopapp.ui.theme.hamisheh

@Composable
fun GetProfileInformation(navController: NavHostController) {

    val focus = LocalFocusManager.current

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFCF3EC))
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null
            ) { focus.clearFocus() }
    ) {

        BackgroundTexture()

        Column(
            modifier = Modifier
                .align(Alignment.TopCenter),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Logo(
                modifier = Modifier
                    .padding(vertical = 70.dp)
                    .size(300.dp)
            )

            BoldTextFieldHeader(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp),
                text = stringResource(R.string.profile_information)
            )

            Spacer(modifier = Modifier.height(12.dp))

            CustomTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(55.dp)
                    .padding(horizontal = 24.dp),
                value = "",
                onValueChange = { /*TODO*/ },
                textStyle = TextStyle(textDirection = TextDirection.Rtl),
                placeholder = {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = stringResource(R.string.place_holder_profile_information),
                        style = TextStyle(
                            color = Gray,
                            textDirection = TextDirection.Rtl,
                            fontFamily = hamisheh,
                            fontWeight = FontWeight.Normal,
                            fontSize = 14.sp
                        )
                    )
                }
            )

            Spacer(modifier = Modifier.height(16.dp))

            GradientButton(
                modifier = Modifier
                    .clip(RoundedCornerShape(12.dp))
                    .fillMaxWidth()
                    .height(55.dp)
                    .padding(horizontal = 24.dp),
                buttonText = stringResource(R.string.register_information),
                onClick = {
                    /*todo*/
                    navController.navigate(Screens.MainScreen){
                        popUpTo(Screens.GetProfileInformation){
                            inclusive = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )

        }

    }

}