package ir.mhe47880.onlineshopapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import ir.mhe47880.onlineshopapp.R
import ir.mhe47880.onlineshopapp.ui.theme.Light_Creamy
import ir.mhe47880.onlineshopapp.ui.theme.LocalExtendedColors
import ir.mhe47880.onlineshopapp.ui.theme.White

@Composable
fun Banner(
    modifier: Modifier = Modifier,
    image: Painter,
    contentBoxText: String,
    onNextButtonClick: () -> Unit = {},
    onPreviousButtonClick: () -> Unit = {}
) {

    ConstraintLayout(
        modifier = modifier
    ) {

        val (banner, nextButton, previousButton, contentBox) = createRefs()

        Image(
            modifier = Modifier
                .fillMaxSize()
                .constrainAs(banner) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                },
            painter = image,
            contentDescription = "Banner",
            contentScale = ContentScale.FillBounds
        )

        IconButton(
            modifier = Modifier
                .width(25.dp)
                .height(60.dp)
                .constrainAs(nextButton) {
                    top.linkTo(banner.top)
                    bottom.linkTo(banner.bottom)
                    start.linkTo(banner.end)
                    end.linkTo(banner.end)
                },
            colors = IconButtonDefaults.iconButtonColors(containerColor = Light_Creamy),
            onClick = onNextButtonClick
        ) {
            Icon(
                painter = painterResource(R.drawable.ic_arrow_right),
                contentDescription = null
            )
        }

        IconButton(
            modifier = Modifier
                .width(25.dp)
                .height(60.dp)
                .constrainAs(previousButton) {
                    top.linkTo(banner.top)
                    bottom.linkTo(banner.bottom)
                    start.linkTo(banner.start)
                    end.linkTo(banner.start)
                },
            colors = IconButtonDefaults.iconButtonColors(containerColor = Light_Creamy),
            onClick = onPreviousButtonClick
        ) {
            Icon(
                painter = painterResource(R.drawable.ic_arrow_left),
                contentDescription = null
            )
        }

        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(percent = 50))
                .background(
                    Brush.horizontalGradient(
                        colors = listOf(
                            LocalExtendedColors.current.gradientStart,
                            LocalExtendedColors.current.gradientEnd
                        )
                    )
                )
                .constrainAs(contentBox) {
                    top.linkTo(banner.top)
                    bottom.linkTo(banner.top)
                    start.linkTo(banner.start)
                    end.linkTo(banner.end)
                    horizontalBias = 0.075f
                }
        ) {
            Text(
                modifier = Modifier
                    .padding(horizontal = 8.dp, vertical = 1.dp),
                text = contentBoxText,
                color = White,
                style = MaterialTheme.typography.labelSmall
            )
        }
    }
}