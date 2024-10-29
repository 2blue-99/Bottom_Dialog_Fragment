package com.blue.bottomfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.WindowCompat
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class MainActivity : AppCompatActivity() {

    private var bottomSheet: BottomFragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        WindowCompat.setDecorFitsSystemWindows(window, false)
    }

    fun showBottomFragment() {
        if (bottomSheet == null || bottomSheet?.isAdded != true) {
            bottomSheet = BottomFragment().apply {
                setStyle(
                    BottomSheetDialogFragment.STYLE_NORMAL,
                    R.style.TransparentAppBottomSheetDialogTheme
                )
            }
            bottomSheet!!.show(supportFragmentManager, bottomSheet!!.tag)
        }
    }

    fun showAlertDialog() {
        MaterialAlertDialogBuilder(this)
            .setMessage("hello")
            .show()
    }
}