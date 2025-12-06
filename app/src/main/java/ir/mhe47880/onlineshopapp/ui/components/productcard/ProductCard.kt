package ir.mhe47880.onlineshopapp.ui.components.productcard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import ir.mhe47880.onlineshopapp.R
import ir.mhe47880.onlineshopapp.ui.theme.Gray
import ir.mhe47880.onlineshopapp.ui.theme.Light_Gray
import ir.mhe47880.onlineshopapp.ui.theme.LocalExtendedColors
import ir.mhe47880.onlineshopapp.ui.theme.White

@Composable
fun ProductCard(
    modifier: Modifier = Modifier,
    image: Painter,
    cardColors: CardColors = CardDefaults.cardColors(containerColor = Light_Gray),
    cardShape: Shape = RoundedCornerShape(32.dp),
    isDiscounted: Boolean = false,
    discountInPercentage: Int = 0,
    discountSurfaceGradientColors: List<Color> = listOf(
        LocalExtendedColors.current.gradientStart,
        LocalExtendedColors.current.gradientEnd
    ),
    plusButtonGradientColors: List<Color> = listOf(
        LocalExtendedColors.current.gradientStart,
        LocalExtendedColors.current.gradientEnd
    ),
    priceSurfaceShape: Shape = RoundedCornerShape(16.dp),
    elevationDp: Dp = 2.dp
) {

    Card(
        modifier = modifier,
        colors = cardColors,
        shape = cardShape,
        elevation = CardDefaults.cardElevation(elevationDp)
    ) {

        ConstraintLayout(
            modifier = Modifier.fillMaxSize()
        ) {

            val (
                discountSurface,
                productImage,
                infoSurface,
                plusButton
            ) = createRefs()

            //region discount box
            if (isDiscounted)
                Box(
                    modifier = Modifier
                        .constrainAs(discountSurface) {
                            top.linkTo(parent.top)
                            bottom.linkTo(parent.bottom)
                            end.linkTo(parent.end)
                            verticalBias = 0.15f
                        }
                        .background(
                            brush = Brush.horizontalGradient(
                                colors = discountSurfaceGradientColors,
                                startX = Float.POSITIVE_INFINITY,
                                endX = 0.0f
                            ),
                            shape = RoundedCornerShape(
                                topStartPercent = 50,
                                bottomStartPercent = 50
                            )
                        )
                ) {
                    Text(
                        modifier = Modifier
                            .fillMaxWidth(0.15f)
                            .padding(2.dp),
                        text = "$discountInPercentage%",
                        color = White,
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.labelSmall
                    )
                }
            //endregion

            //region product image
            Image(
                modifier = Modifier
                    .constrainAs(productImage) {
                        top.linkTo(parent.top)
                        bottom.linkTo(parent.bottom)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                        verticalBias = 0.1f
                    }
                    .fillMaxWidth(0.8f)
                    .fillMaxHeight(0.5f),
                painter = image,
                contentScale = ContentScale.Crop,
                contentDescription = null
            )
            //endregion

            //region information surface
            Surface(
                modifier = Modifier
                    .constrainAs(infoSurface) {
                        top.linkTo(parent.top)
                        bottom.linkTo(parent.bottom)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                        verticalBias = 0.92f
                    }
                    .fillMaxWidth(0.8f)
                    .fillMaxHeight(0.32f),
                color = White,
                shape = priceSurfaceShape
            ) {

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(8.dp)
                ) {
                    //product name
                    Text(
                        modifier = Modifier
                            .align(Alignment.TopEnd)
                            .fillMaxWidth(0.8f),
                        text = "تی شرت مردانه مدل آلفا",
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis,
                        style = MaterialTheme.typography.displayMedium
                    )

                    //product price
                    Row(
                        modifier = Modifier
                            .align(Alignment.BottomCenter)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(6.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "تومان",
                            style = MaterialTheme.typography.displaySmall
                        )

                        Text(
                            text = "3،500،000",
                            style = MaterialTheme.typography.displaySmall
                        )

                        Text(
                            modifier = Modifier.diagonalLine(),
                            text = "3،850،000",
                            color = Gray,
                            style = MaterialTheme.typography.displaySmall
                        )
                    }
                }

            }
            //endregion

            //region plus button
            IconButton(
                modifier = Modifier
                    .scale(0.9f)
                    .constrainAs(plusButton) {
                        top.linkTo(infoSurface.top)
                        bottom.linkTo(infoSurface.bottom)
                        start.linkTo(infoSurface.start)
                        end.linkTo(infoSurface.start)
                    },
                colors = IconButtonDefaults.iconButtonColors(
                    containerColor = Color.Transparent
                ),
                onClick = { /*TODO*/ }
            ) {

                //background gradient
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(
                            brush = Brush.horizontalGradient(
                                colors = plusButtonGradientColors
                            ),
                            shape = CircleShape
                        )
                )

                Icon(
                    modifier = Modifier.fillMaxSize(0.35f),
                    painter = painterResource(R.drawable.ic_plus),
                    contentDescription = "add to shopping cart",
                    tint = White
                )
            }
            //endregion
        }
    }

}