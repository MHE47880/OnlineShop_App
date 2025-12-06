package ir.mhe47880.onlineshopapp.ui.components.productcard

import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import ir.mhe47880.onlineshopapp.ui.theme.Gray

/**
 * Applies a **diagonal slash overlay** across the composable’s drawing layer while preserving
 * its original content.
 *
 * This modifier is ideal for UI elements that require a **visual emphasis** or a
 * “crossed-out” / “sale-like” look without using a traditional strikethrough text style.
 * Unlike text decoration, this effect works on **any** composable — text, icons, images,
 * cards, or even custom layouts.
 *
 * ### ✨ Features
 * - Draws a clean diagonal line from bottom-left to top-right
 * - Works seamlessly with any size or layout
 * - Keeps the underlying content fully visible
 * - Highly customizable (color, thickness, angle)
 *
 * ### 📌 Usage Example
 * ```
 * Text(
 *     text = "3,850,000",
 *     modifier = Modifier.diagonalLine(
 *         color = Gray,
 *         strokeWidth = 3f,
 *         paddingRatio = 0.4f
 *     ),
 *     style = MaterialTheme.typography.displaySmall
 * )
 * ```
 *
 * ### 🔧 Parameters
 * @param color The color used to draw the diagonal slash.
 * @param strokeWidth Thickness of the line in pixels.
 * @param paddingRatio A value between `0f` and `1f` determining how steep the angle appears.
 * Larger values make the line more horizontal; smaller values make it sharper.
 *
 * ### 🎯 Returns
 * A [Modifier] that renders a diagonal line over the composable without affecting its layout.
 *
 * ### 📎 Notes
 * - This drawing happens in the `drawWithContent` phase, ensuring the slash appears **on top**
 *   of the original content.
 * - The line automatically adapts to the measured size of the composable.
 *
 * @receiver The original [Modifier] to which this effect will be added.
 */

fun Modifier.diagonalLine(
    color: Color = Gray,
    strokeWidth: Float = 3f,
    paddingRatio: Float = 0.4f
) = this.drawWithContent {
    drawContent()

    val paddingVertical = size.height * paddingRatio

    drawLine(
        color = color,
        start = Offset(0f, size.height - paddingVertical),
        end = Offset(size.width, paddingVertical),
        strokeWidth = strokeWidth
    )
}