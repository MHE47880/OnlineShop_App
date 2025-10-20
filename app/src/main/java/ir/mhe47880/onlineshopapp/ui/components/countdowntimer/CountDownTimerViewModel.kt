package ir.mhe47880.onlineshopapp.ui.components.countdowntimer

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CountDownTimerViewModel @Inject constructor() : ViewModel() {

    private val _totalSeconds = MutableStateFlow(0)
    val totalSeconds = _totalSeconds.asStateFlow()

    fun startTimer(minutes: Int) {

        _totalSeconds.value = minutes * 60

        viewModelScope.launch(Dispatchers.Default) {
            while (_totalSeconds.value > 0) {
                delay(1000L)
                _totalSeconds.value--
            }
        }

    }
}