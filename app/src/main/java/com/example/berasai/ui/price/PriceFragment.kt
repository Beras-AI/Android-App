package com.example.berasai.ui.price

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.berasai.databinding.FragmentPriceBinding
import com.example.berasai.ui.home.HomeViewModel

class PriceFragment : Fragment() {

    private var _binding: FragmentPriceBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val priceViewModel =
            ViewModelProvider(this).get(PriceViewModel::class.java)

        _binding = FragmentPriceBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textPrice
        priceViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}