package es.manudev.presentation.ui.test

import android.view.View
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import es.manudev.presentation.navigation.TestNavigator
import javax.inject.Inject

@HiltViewModel
class FirstTestFragmentViewModel @Inject constructor(
    private val testNavigator: TestNavigator
) : ViewModel() {

    fun navigateToSecondFragment(view: View) {
        testNavigator.navigateToSecondFragment(view)
    }

}
