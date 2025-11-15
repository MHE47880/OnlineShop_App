package ir.mhe47880.onlineshopapp.ui.screens.bottomnav

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDirection
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ir.mhe47880.onlineshopapp.R
import ir.mhe47880.onlineshopapp.ui.components.Banner
import ir.mhe47880.onlineshopapp.ui.components.CategoryCard
import ir.mhe47880.onlineshopapp.ui.components.CustomTextField
import ir.mhe47880.onlineshopapp.ui.theme.Black
import ir.mhe47880.onlineshopapp.ui.theme.Gray
import ir.mhe47880.onlineshopapp.ui.theme.Orange
import ir.mhe47880.onlineshopapp.ui.theme.hamisheh
import ir.mhe47880.onlineshopapp.ui.utils.DoubleBackToExit

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun HomeScreen(paddingValues: PaddingValues = PaddingValues()) {

    val focus = LocalFocusManager.current

    DoubleBackToExit()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues)
            .verticalScroll(rememberScrollState())
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null
            ) { focus.clearFocus() }
    ) {

        Banner(
            modifier = Modifier
                .fillMaxWidth()
                .height(220.dp)
                .padding(horizontal = 24.dp, vertical = 32.dp),
            image = painterResource(R.drawable.banner),
            contentBoxText = stringResource(R.string.discount),
            onNextButtonClick = { /*TODO*/ },
            onPreviousButtonClick = { /*TODO*/ }
        )

        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp),
            text = stringResource(R.string.buy_with_one_click),
            style = TextStyle(
                color = Black,
                textDirection = TextDirection.Rtl,
                fontFamily = hamisheh,
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp
            )
        )

        Spacer(modifier = Modifier.height(12.dp))

        CustomTextField(
            modifier = Modifier
                .fillMaxWidth()
                .height(55.dp)
                .padding(horizontal = 24.dp),
            //TODO : set the value with state
            value = "",
            onValueChange = {},
            textStyle = TextStyle(textDirection = TextDirection.Rtl),
            placeholder = {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "هر چی میخوای جستجو کن ...",
                    style = TextStyle(
                        color = Gray,
                        textDirection = TextDirection.Rtl,
                        fontFamily = hamisheh,
                        fontWeight = FontWeight.Normal,
                        fontSize = 14.sp
                    )
                )
            },
            trailingIcon = {
                Icon(
                    modifier = Modifier
                        .fillMaxHeight()
                        .width(25.dp),
                    painter = painterResource(R.drawable.ic_search),
                    contentDescription = null,
                    tint = Orange
                )
            }
        )

        Spacer(modifier = Modifier.height(12.dp))

        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 24.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            reverseLayout = true
            ) {

            items(count = 10) {
                CategoryCard(
                    modifier = Modifier.size(width = 100.dp, height = 130.dp),
                    image = painterResource(R.drawable.logo)
                )
                
            }

        }

    }

}