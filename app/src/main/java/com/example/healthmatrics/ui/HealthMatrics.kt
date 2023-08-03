package com.example.healthmatrics.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.healthmatrics.MainActivity
import com.example.healthmatrics.R
import com.example.healthmatrics.databinding.FragmentHealthMatricsBinding

class HealthMatrics : Fragment() {
    private var _binding: FragmentHealthMatricsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHealthMatricsBinding.inflate(inflater, container, false)
        val view = binding.root
        val buttonNavigate = (activity as? MainActivity)?.findViewById<Button>(R.id.button)
        buttonNavigate?.visibility = View.GONE

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
