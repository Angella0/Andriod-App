package com.example.assessment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CalculatorRVAdapter (var CalculatorList: List<Calculator>):RecyclerView.Adapter<PostViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return postList.size
    }
}

    class PostViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var btnSubtraction = itemView.findViewById<Button>(R.id.btnSubtraction)
        var btnAddition = itemView.findViewById<Button>(R.id.btnAddition)
}