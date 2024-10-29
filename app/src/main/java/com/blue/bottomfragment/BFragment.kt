package com.blue.bottomfragment

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.blue.bottomfragment.databinding.FragmentBBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class BFragment : BottomSheetDialogFragment() {

    private var _binding: FragmentBBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_b, container, false)

        // 루트 뷰의 레이아웃 높이를 화면의 절반으로 설정
        view.viewTreeObserver.addOnGlobalLayoutListener {
            val bottomSheet = view.parent as View
            val params = bottomSheet.layoutParams
            params.height = (resources.displayMetrics.heightPixels)
            bottomSheet.layoutParams = params
        }
        return view
    }

//    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
//        val dialog = super.onCreateDialog(savedInstanceState) as BottomSheetDialog
//        dialog.setOnShowListener { dialogInterface ->
//            val bottomSheetDialog = dialogInterface as BottomSheetDialog
//            val bottomSheet = bottomSheetDialog.findViewById<View>(com.google.android.material.R.id.design_bottom_sheet)
//            bottomSheet?.let {
//                val behavior = BottomSheetBehavior.from(it)
//
//                // 화면 높이의 절반으로 peekHeight 설정
//                behavior.peekHeight = (resources.displayMetrics.heightPixels).toInt()
//                behavior.state = BottomSheetBehavior.STATE_COLLAPSED
//            }
//        }
//        return dialog
//    }

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        binding.buttonB.setOnClickListener {
//            findNavController().navigate(R.id.AFragment)
//        }
//    }

}