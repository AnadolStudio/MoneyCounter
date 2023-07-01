package ru.anadol.studio.moneycounter

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.anadolstudio.core.common_util.throttleClick
import com.anadolstudio.core.fragment.CoreBaseFragment
import com.anadolstudio.core.viewbinding.viewBinding
import com.google.android.material.snackbar.Snackbar
import ru.anadol.studio.moneycounter.databinding.FragmentFirstBinding

class FirstFragment : CoreBaseFragment<Unit>(R.layout.fragment_first) {

    override fun render(state: Unit) {
        TODO("Not yet implemented")
    }

    private val binding: FragmentFirstBinding by viewBinding { FragmentFirstBinding.bind(requireView()) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.fab.throttleClick { }

        binding.buttonFirst.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
    }

}
