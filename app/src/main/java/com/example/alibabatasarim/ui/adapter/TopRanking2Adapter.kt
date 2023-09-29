package com.example.alibabatasarim.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.alibabatasarim.data.entity.TopRanking
import com.example.alibabatasarim.databinding.TopRankingCardDesignBinding

class TopRanking2Adapter(var mContext: Context, var topRanking2List: List<TopRanking>) :
    RecyclerView.Adapter<TopRanking2Adapter.CardDesignHolder>() {

    inner class CardDesignHolder(var design: TopRankingCardDesignBinding) :
        RecyclerView.ViewHolder(design.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignHolder {
        val binding = TopRankingCardDesignBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CardDesignHolder(binding)
    }

    override fun onBindViewHolder(holder: CardDesignHolder, position: Int) {
        val topRanking2 = topRanking2List.get(position)
        val t = holder.design

        t.imageViewTopRanking.setImageResource(mContext.resources.getIdentifier(topRanking2.image,"drawable",mContext.packageName))
        t.textViewDescription.text = topRanking2.text
    }

    override fun getItemCount(): Int {
        return topRanking2List.size
    }
}