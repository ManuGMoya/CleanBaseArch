package es.manudev.presentation.navigation

import android.view.View
import androidx.navigation.Navigation
import es.manudev.presentation.R
import javax.inject.Inject

class TestNavigator @Inject constructor() {

    fun navigateToSecondFragment(view: View) {
        Navigation.findNavController(view).navigate(R.id.secondTestFragment)
    }
}
