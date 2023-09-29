package com.example.alibabatasarim.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.alibabatasarim.data.entity.Services
import com.example.alibabatasarim.databinding.ServiceCardDesignBinding

class ServicesAdapter(var mContext: Context, var serviceList: List<Services>) :
    RecyclerView.Adapter<ServicesAdapter.CardDesignHolder>() {

    inner class CardDesignHolder(var design: ServiceCardDesignBinding) :
        RecyclerView.ViewHolder(design.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignHolder {
        val binding = ServiceCardDesignBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CardDesignHolder(binding)
    }

    override fun onBindViewHolder(holder: CardDesignHolder, position: Int) {
        val services = serviceList.get(position)
        val t = holder.design

        t.imageViewServices.setImageResource(mContext.resources.getIdentifier(services.image,"drawable",mContext.packageName))

//        t.cardViewFilm.setOnClickListener{
//        }
    }

    override fun getItemCount(): Int {
        return serviceList.size
    }
}