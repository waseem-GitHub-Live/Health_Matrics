package com.example.healthmatrics.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.healthmatrics.MainActivity
import com.example.healthmatrics.R
import com.example.healthmatrics.databinding.FragmentEditTargetRangeBinding
import com.example.healthmatrics.databinding.FragmentHealthMatricsBinding

class EditTargetRangeFragment : Fragment() {
    private var binding:FragmentEditTargetRangeBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentEditTargetRangeBinding.inflate(inflater, container, false)
        val view = binding?.root
        val buttonNavigate = (activity as? MainActivity)?.findViewById<Button>(R.id.button)
        buttonNavigate?.visibility = View.GONE
        return view
    }
}