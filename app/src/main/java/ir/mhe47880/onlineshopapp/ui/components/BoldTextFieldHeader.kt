package ir.mhe47880.onlineshopapp.ui.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDirection
import androidx.compose.ui.unit.sp
import ir.mhe47880.onlineshopapp.ui.theme.Black
import ir.mhe47880.onlineshopapp.ui.theme.iran_rounded

@Composable
fun BoldTextFieldHeader(
    modifier: Modifier,
    text: String,
    style: TextStyle = TextStyle(
        color = Black,
        textDirection = TextDirection.Rtl,
        fontFamily = iran_rounded,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp
    )
){

    Text(
        modifier = modifier,
        text = text,
        style = style
    )

}