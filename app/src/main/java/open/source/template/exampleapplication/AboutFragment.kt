package open.source.template.exampleapplication

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import open.source.template.exampleapplication.databinding.AboutFragmentBinding

class AboutFragment : Fragment() {

    // TODO: Add DI
    private lateinit var viewModel: AboutViewModel
    private lateinit var binding: AboutFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = AboutFragmentBinding.inflate(layoutInflater, container, false)
        binding.lifecycleOwner = this
        viewModel = AboutViewModel()
        return binding.root
    }


}