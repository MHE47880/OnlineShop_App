package ir.mhe47880.onlineshopapp.ui.screens.bottomnav

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import ir.mhe47880.onlineshopapp.R
import ir.mhe47880.onlineshopapp.ui.components.Banner
import ir.mhe47880.onlineshopapp.ui.components.BoldHeaderText
import ir.mhe47880.onlineshopapp.ui.components.CategoryCard

@Composable
fun CategoriesScreen(paddingValues: PaddingValues = PaddingValues()) {

    //TODO Need to be responsive

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues)
            .verticalScroll(rememberScrollState())
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

        Spacer(modifier = Modifier.height(48.dp))

        BoldHeaderText(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp),
            text = stringResource(R.string.categories)
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            repeat(2) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    repeat(3) {
                        CategoryCard(
                            modifier = Modifier
                                .size(110.dp),
                            image = painterResource(R.drawable.logo)
                        )
                    }
                }
            }
        }
    }

}