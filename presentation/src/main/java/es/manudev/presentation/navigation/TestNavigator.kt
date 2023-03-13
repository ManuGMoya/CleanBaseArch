package es.manudev.presentation.navigation

import android.view.View
import androidx.navigation.Navigation
import es.manudev.presentation.ui.test.FirstTestFragmentDirections
import javax.inject.Inject

class TestNavigator @Inject constructor() {

    fun navigateToSecondFragment(view: View) {
        val action = FirstTestFragmentDirections.actionFirstTestFragmentToSecondTestFragment()
        Navigation.findNavController(view).navigate(action)
    }
}
