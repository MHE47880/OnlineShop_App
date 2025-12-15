package ir.mhe47880.onlineshopapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDirection
import androidx.compose.ui.unit.sp
import ir.mhe47880.onlineshopapp.R

val iranSans = FontFamily(
    Font(R.font.iran_sans_ultralight, FontWeight.ExtraLight),
    Font(R.font.iran_sans_light, FontWeight.Light),
    Font(R.font.iran_sans_thin, FontWeight.Thin),
    Font(R.font.iran_sans_regular, FontWeight.Normal),
    Font(R.font.iran_sans_medium, FontWeight.Medium),
    Font(R.font.iran_sans_semibold, FontWeight.SemiBold),
    Font(R.font.iran_sans_bold, FontWeight.Bold),
    Font(R.font.iran_sans_extrabold, FontWeight.ExtraBold)
)

val Typography = Typography(
    //used for gradient button
    displayLarge = TextStyle(
        color = Black,
        fontSize = 18.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.sp,
        fontFamily = iranSans,
        fontWeight = FontWeight.Bold,
        textDirection = TextDirection.Rtl
    ),
    /*
    * used for category card text
    * and for product card name '
    * and text field place holder
    */
    displayMedium = TextStyle(
        color = Black,
        fontSize = 14.sp,
        lineHeight = 25.sp,
        letterSpacing = 0.sp,
        fontFamily = iranSans,
        fontWeight = FontWeight.Bold,
        textDirection = TextDirection.Rtl
    ),
    //used for product card price
    displaySmall = TextStyle(
        color = Black,
        fontSize = 12.sp,
        lineHeight = 18.sp,
        letterSpacing = 0.sp,
        fontFamily = iranSans,
        fontWeight = FontWeight.Bold,
        textDirection = TextDirection.Rtl
    ),
    headlineLarge = TextStyle(
        color = Black,
        fontSize = 16.sp,
        lineHeight = 22.sp,
        letterSpacing = 0.sp,
        fontFamily = iranSans,
        fontWeight = FontWeight.SemiBold,
        textDirection = TextDirection.Rtl
    ),
    headlineMedium = TextStyle(
        color = Black,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.sp,
        fontFamily = iranSans,
        fontWeight = FontWeight.SemiBold,
        textDirection = TextDirection.Rtl
    ),
    headlineSmall = TextStyle(
        color = Black,
        fontSize = 12.sp,
        lineHeight = 18.sp,
        letterSpacing = 0.sp,
        fontFamily = iranSans,
        fontWeight = FontWeight.SemiBold,
        textDirection = TextDirection.Rtl
    ),
    //used for buy with one click text in home screen
    titleLarge = TextStyle(
        color = Black,
        fontSize = 24.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.sp,
        fontFamily = iranSans,
        fontWeight = FontWeight.Bold,
        textDirection = TextDirection.Rtl
    ),
    //used for most selling text in home screen
    titleMedium = TextStyle(
        color = Black,
        fontSize = 18.sp,
        lineHeight = 18.sp,
        letterSpacing = 0.sp,
        fontFamily = iranSans,
        fontWeight = FontWeight.Bold,
        textDirection = TextDirection.Rtl
    ),
    //used for see all text in home screen
    titleSmall = TextStyle(
        color = Black,
        fontSize = 13.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.sp,
        fontFamily = iranSans,
        fontWeight = FontWeight.Medium,
        textDirection = TextDirection.Rtl
    ),
    bodyLarge = TextStyle(
        color = Black,
        fontSize = 14.sp,
        lineHeight = 22.sp,
        letterSpacing = 0.sp,
        fontFamily = iranSans,
        fontWeight = FontWeight.Normal,
        textDirection = TextDirection.Rtl
    ),
    bodyMedium = TextStyle(
        color = Black,
        fontSize = 13.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.sp,
        fontFamily = iranSans,
        fontWeight = FontWeight.Normal,
        textDirection = TextDirection.Rtl
    ),
    bodySmall = TextStyle(
        color = Black,
        fontSize = 12.sp,
        lineHeight = 18.sp,
        letterSpacing = 0.sp,
        fontFamily = iranSans,
        fontWeight = FontWeight.Normal,
        textDirection = TextDirection.Rtl
    ),
    labelLarge = TextStyle(
        color = Black,
        fontSize = 15.sp,
        lineHeight = 18.sp,
        letterSpacing = 0.sp,
        fontFamily = iranSans,
        fontWeight = FontWeight.Bold,
        textDirection = TextDirection.Rtl
    ),
    labelMedium = TextStyle(
        color = Black,
        fontSize = 14.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.sp,
        fontFamily = iranSans,
        fontWeight = FontWeight.Medium,
        textDirection = TextDirection.Rtl
    ),
    //used for discount box in product card
    labelSmall = TextStyle(
        color = Black,
        fontSize = 13.sp,
        lineHeight = 14.sp,
        letterSpacing = 0.sp,
        fontFamily = iranSans,
        fontWeight = FontWeight.Medium,
        textDirection = TextDirection.Rtl
    )
)