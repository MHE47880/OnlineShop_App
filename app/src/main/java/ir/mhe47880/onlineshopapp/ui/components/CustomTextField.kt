package ir.mhe47880.onlineshopapp.ui.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import ir.mhe47880.onlineshopapp.ui.theme.White

@Composable
fun CustomTextField(
    modifier: Modifier,
    value: String,
    isSingleLine: Boolean = true,
    shape: Shape = RoundedCornerShape(12.dp),
    colors: TextFieldColors = TextFieldDefaults.colors(
        unfocusedContainerColor = White,
        focusedContainerColor = White,
        disabledContainerColor = White,
        errorContainerColor = White,
        focusedIndicatorColor = Color.Transparent,
        unfocusedIndicatorColor = Color.Transparent,
        disabledIndicatorColor = Color.Transparent,
        errorIndicatorColor = Color.Transparent
    ),
    textStyle : TextStyle,

    placeholder : @Composable (() -> Unit),
    leadingIcon: @Composable (() -> Unit) = {},
    onValueChange: (String) -> Unit
) {
    TextField(
        modifier = modifier,
        value = value,
        onValueChange = onValueChange,
        singleLine = isSingleLine,
        shape = shape,
        colors = colors,
        textStyle = textStyle,
        placeholder = placeholder,
        leadingIcon = leadingIcon
    )
}