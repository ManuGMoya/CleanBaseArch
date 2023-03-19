package es.manudev.presentation.ui.test

import android.util.Log
import android.view.View
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import es.manudev.domain.usecase.TestUseCase
import es.manudev.presentation.navigation.TestNavigator
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FirstTestFragmentViewModel @Inject constructor(
    private val testNavigator: TestNavigator,
    private val loginUseCase: TestUseCase
) : ViewModel() {

    fun navigateToSecondFragment(view: View) {
        testNavigator.navigateToSecondFragment(view)
    }

    fun testRetrofit() {
        viewModelScope.launch {
            val result = loginUseCase()
            if (result) {
                Log.d("TEST", "RESULT OK")
            } else {
                Log.d("TEST", "KO RESULT")
            }
        }
    }

}
