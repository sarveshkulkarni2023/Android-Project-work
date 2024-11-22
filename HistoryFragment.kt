package com.sanjivani.shriparvatioilmill.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.sanjivani.shriparvatioilmill.R
import com.sanjivani.shriparvatioilmill.adapter.BuyAgainAdapter
import com.sanjivani.shriparvatioilmill.databinding.FragmentHistoryBinding

class HistoryFragment : Fragment() {
    private lateinit var binding: FragmentHistoryBinding
    private lateinit var buyAgainAdapter: BuyAgainAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHistoryBinding.inflate(layoutInflater,container,false)
        // Inflate the layout for this fragment
        setupRecyclerView()
        return binding.root
    }

    private fun setupRecyclerView(){
        val buyAgainItemName = arrayListOf("Food 1","Food 2","Food 3")
        val buyAgainItemPrice = arrayListOf("₹60","₹35","₹50")
        val buyAgainItemImage = arrayListOf(R.drawable.o1,R.drawable.o2,R.drawable.o3)
        buyAgainAdapter = BuyAgainAdapter(buyAgainItemName,buyAgainItemPrice,buyAgainItemImage)
        binding.BuyAgainRecyclerView.adapter = buyAgainAdapter
        binding.BuyAgainRecyclerView.layoutManager = LinearLayoutManager(requireContext())
    }

    companion object {

    }
}