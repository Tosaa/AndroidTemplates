package open.source.template.exampleapplication.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.ActivityNavigator
import androidx.navigation.dynamicfeatures.DynamicActivityNavigator
import androidx.navigation.fragment.FragmentNavigator
import androidx.navigation.fragment.NavHostFragment
import open.source.template.exampleapplication.R
import open.source.template.exampleapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(
            this,
            R.layout.activity_main
        )
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController

        binding.menuBar.setNavigationOnClickListener {
            navController.popBackStack(R.id.mainFragment,false)
        }
        binding.menuBar.setOnMenuItemClickListener {
            when (it.title.toString()) {
                "about" -> {
                    navController.popBackStack(R.id.mainFragment, false)
                    navController.navigate(R.id.aboutFragment)
                    true
                }
                "settings" -> {
                    navController.popBackStack(R.id.mainFragment, false)
                    navController.navigate(R.id.settingsFragment)
                    true
                }
                else -> {
                    false
                }
            }

        }


    }
}