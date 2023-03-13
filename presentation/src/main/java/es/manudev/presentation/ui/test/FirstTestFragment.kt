package es.manudev.presentation.ui.test

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import es.manudev.presentation.databinding.FirstTestFragmentBinding


@AndroidEntryPoint
class FirstTestFragment : Fragment() {

    private var _binding: FirstTestFragmentBinding? = null
    private val binding: FirstTestFragmentBinding get() = _binding!!

    private val viewModel: FirstTestFragmentViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FirstTestFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setListeners()
    }

    private fun setListeners() {
        with(binding) {
            btnNavigate.setOnClickListener { view ->
                viewModel.navigateToSecondFragment(view)
            }
        }
    }

}
