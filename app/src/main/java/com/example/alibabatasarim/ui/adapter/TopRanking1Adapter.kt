package com.example.alibabatasarim.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.alibabatasarim.data.entity.TopRanking
import com.example.alibabatasarim.databinding.TopRankingCardDesignBinding

class TopRanking1Adapter(var mContext: Context, var topRanking1List: List<TopRanking>) :
    RecyclerView.Adapter<TopRanking1Adapter.CardDesignHolder>() {

    inner class CardDesignHolder(var design: TopRankingCardDesignBinding) :
        RecyclerView.ViewHolder(design.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignHolder {
        val binding = TopRankingCardDesignBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CardDesignHolder(binding)
    }

    override fun onBindViewHolder(holder: CardDesignHolder, position: Int) {
        val topRanking1 = topRanking1List.get(position)
        val t = holder.design

        t.imageViewTopRanking.setImageResource(mContext.resources.getIdentifier(topRanking1.image,"drawable",mContext.packageName))
        t.textViewDescription.text = topRanking1.text
    }

    override fun getItemCount(): Int {
        return topRanking1List.size
    }
}