package ru.anadol.studio.moneycounter

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.anadolstudio.core.common_util.throttleClick
import com.anadolstudio.core.fragment.CoreContentBaseFragment
import com.anadolstudio.core.viewbinding.viewBinding
import ru.anadol.studio.moneycounter.databinding.FragmentFirstBinding

class FirstFragment : CoreContentBaseFragment<Unit>(R.layout.fragment_first) {

    private val binding: FragmentFirstBinding by viewBinding { FragmentFirstBinding.bind(requireView()) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.fab.throttleClick { }

        binding.buttonFirst.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
    }

}
