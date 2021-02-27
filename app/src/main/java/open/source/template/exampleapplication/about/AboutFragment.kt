package open.source.template.exampleapplication.about

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.preference.PreferenceManager
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

        val isOn = PreferenceManager.getDefaultSharedPreferences(requireContext()).getBoolean("example",false)
        binding.examplePreferenceStatus.text = "preference status: $isOn"
        return binding.root
    }


}