package es.manudev.presentation.ui.test

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import es.manudev.presentation.databinding.SecondTestFragmentBinding


@AndroidEntryPoint
class SecondTestFragment : Fragment() {

    private var _binding: SecondTestFragmentBinding? = null
    private val binding: SecondTestFragmentBinding get() = _binding!!

    private val viewModel: FirstTestFragmentViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = SecondTestFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }
}
