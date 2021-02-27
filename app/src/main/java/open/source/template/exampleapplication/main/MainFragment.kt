package open.source.template.exampleapplication.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import open.source.template.exampleapplication.databinding.MainFragmentBinding

class MainFragment : Fragment() {

    //TODO: Use DI
    private lateinit var viewModel: MainViewModel
    private lateinit var binding: MainFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = MainViewModel()
        binding = MainFragmentBinding.inflate(layoutInflater, container, false)
        binding.lifecycleOwner = this
        binding.viewmodel = viewModel

        return binding.root
    }

}