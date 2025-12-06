package ir.mhe47880.onlineshopapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import ir.mhe47880.onlineshopapp.ui.theme.LocalExtendedColors
import ir.mhe47880.onlineshopapp.ui.theme.White

@Composable
fun GradientButton(
    modifier: Modifier,
    buttonText: String,
    textStyle: TextStyle = MaterialTheme.typography.displayLarge,
    textColor: Color = White,
    gradientColors: List<Color> = listOf(
        LocalExtendedColors.current.gradientStart,
        LocalExtendedColors.current.gradientEnd
    ),
    buttonShape: Shape = RoundedCornerShape(12.dp),
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent
        ),
        shape = buttonShape,
        contentPadding = PaddingValues()
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.horizontalGradient(gradientColors),
                    shape = buttonShape
                ),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = buttonText,
                color = textColor,
                style = textStyle
            )
        }
    }
}