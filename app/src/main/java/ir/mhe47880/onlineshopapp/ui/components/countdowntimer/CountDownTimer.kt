package ir.mhe47880.onlineshopapp.ui.components.countdowntimer

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun CountDownTimer(
    modifier: Modifier = Modifier,
    minutes: Int,
    textStyle: TextStyle = MaterialTheme.typography.labelSmall,
    viewModel: CountDownTimerViewModel = hiltViewModel(),
    onFinished: () -> Unit = {}
) {

    val totalSeconds by viewModel.totalSeconds.collectAsState()

    LaunchedEffect(Unit) {
        viewModel.startTimer(minutes = minutes)
        onFinished()
    }

    val mins = totalSeconds / 60
    val secs = totalSeconds % 60

    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        AnimatedDigit(value = mins / 10, label = "mTens", textStyle = textStyle)
        AnimatedDigit(value = mins % 10, label = "mOnes", textStyle = textStyle)
        Text(text = ":", modifier = Modifier.padding(horizontal = 2.dp), style = textStyle)
        AnimatedDigit(value = secs / 10, label = "sTens", textStyle = textStyle)
        AnimatedDigit(value = secs % 10, label = "sOnes", textStyle = textStyle)
    }
}

@OptIn(ExperimentalAnimationApi::class)
@Composable
private fun AnimatedDigit(
    textStyle: TextStyle,
    value: Int,
    label: String
) {
    AnimatedContent(
        targetState = value,
        transitionSpec = {
            (slideInVertically { -it } + fadeIn(tween(250)))
                .togetherWith(slideOutVertically { it } + fadeOut(
                    tween(250)
                ))
        },
        label = label
    ) { target ->

        Text(
            modifier = Modifier.padding(horizontal = 1.dp),
            style = textStyle,
            text = target.toString()
        )

    }
}