package ir.mhe47880.onlineshopapp.ui.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle

@Composable
fun BoldHeaderText(
    modifier: Modifier = Modifier,
    text: String = "",
    style: TextStyle = MaterialTheme.typography.titleLarge
) {
    Text(
        modifier = modifier,
        text = text,
        style = style
    )
}