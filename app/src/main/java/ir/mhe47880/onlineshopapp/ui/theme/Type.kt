package ir.mhe47880.onlineshopapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDirection
import androidx.compose.ui.unit.sp
import ir.mhe47880.onlineshopapp.R

val iran_rounded = FontFamily(
    Font(R.font.hamisheh_regular, FontWeight.Normal),
    Font(R.font.hamisheh_bold, FontWeight.Bold)
)

val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    labelLarge = TextStyle(
        fontFamily = iran_rounded,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
        color = White,
        textDirection = TextDirection.Rtl
    )
)