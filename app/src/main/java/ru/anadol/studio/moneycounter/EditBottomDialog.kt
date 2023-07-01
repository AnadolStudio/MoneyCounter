package ru.anadol.studio.moneycounter

import android.os.Bundle
import android.view.View
import androidx.fragment.app.DialogFragment
import androidx.navigation.fragment.findNavController
import com.anadolstudio.core.dialogs.CoreBottomSheetDialog
import com.anadolstudio.core.viewbinding.viewBinding
import ru.anadol.studio.moneycounter.databinding.FragmentBottomDialogEditBinding

class EditBottomDialog : CoreBottomSheetDialog(R.layout.fragment_bottom_dialog_edit) {

    override fun getDialogTag(): String {
        TODO("Not yet implemented")
    }

    override fun setStyle() {
        setStyle(DialogFragment.STYLE_NORMAL, com.anadolstudio.core.R.style.RoundCornerBottomSheetTheme)
    }

    private val binding by viewBinding(FragmentBottomDialogEditBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonSecond.setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }
    }

}
