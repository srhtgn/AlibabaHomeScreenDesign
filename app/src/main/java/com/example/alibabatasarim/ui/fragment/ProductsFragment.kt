package com.example.alibabatasarim.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.alibabatasarim.data.entity.Services
import com.example.alibabatasarim.data.entity.TopRanking
import com.example.alibabatasarim.databinding.FragmentProductsBinding
import com.example.alibabatasarim.ui.adapter.ServicesAdapter
import com.example.alibabatasarim.ui.adapter.TopRanking1Adapter
import com.example.alibabatasarim.ui.adapter.TopRanking2Adapter

class ProductsFragment : Fragment() {
    private lateinit var binding: FragmentProductsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProductsBinding.inflate(inflater, container, false)

        binding.recyclerViewServices.layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)
        binding.recyclerViewTopRanking1.layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)
        binding.recyclerViewTopRanking2.layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)

        val serviceList = ArrayList<Services>()
        val s1 = Services(1,"all_categories")
        val s2 = Services(2,"alibaba_membership")
        val s3 = Services(3,"request_for_quotation")
        val s4 = Services(4,"logistics_services")
        val s5 = Services(5,"ready_to_ship")
        val s6 = Services(6,"special_global_picks")
        val s7 = Services(7,"drop_shipping")
        serviceList.add(s1)
        serviceList.add(s2)
        serviceList.add(s3)
        serviceList.add(s4)
        serviceList.add(s5)
        serviceList.add(s6)
        serviceList.add(s7)

        val topRanking1List = ArrayList<TopRanking>()
        val tR11 = TopRanking(1,"Limited Edition Quartz Watches", "curren_watch")
        val tR12 = TopRanking(2,"Sport Smart Watches","smart_watch")
        val tR13 = TopRanking(3,"Training Shoes","training_shoes")
        val tR14 = TopRanking(4,"Walking Shoes","walking_shoes")
        topRanking1List.add(tR11)
        topRanking1List.add(tR12)
        topRanking1List.add(tR13)
        topRanking1List.add(tR14)

        val topRanking2List = ArrayList<TopRanking>()
        val tR21 = TopRanking(1,"TRY 1324.32 - TRY 1442.61", "phone")
        val tR22 = TopRanking(2,"TRY 165.23 - TRY 173.46","parfume")
        val tR23 = TopRanking(3,"TRY 120.05 - TRY 156.76","bag")
        val tR24 = TopRanking(4,"TRY 765.98 - TRY 823.54","headset")
        topRanking2List.add(tR21)
        topRanking2List.add(tR22)
        topRanking2List.add(tR23)
        topRanking2List.add(tR24)

        val adapterService = ServicesAdapter(requireContext(), serviceList)
        val adapterTopRanking1 = TopRanking1Adapter(requireContext(), topRanking1List)
        val adapterTopRanking2 = TopRanking2Adapter(requireContext(), topRanking2List)

        binding.recyclerViewServices.adapter = adapterService
        binding.recyclerViewTopRanking1.adapter = adapterTopRanking1
        binding.recyclerViewTopRanking2.adapter = adapterTopRanking2

        return binding.root
    }
}