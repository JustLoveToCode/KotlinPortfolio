package com.mastercoding.contactmanagerapp.viewUI

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.mastercoding.contactmanagerapp.R
import com.mastercoding.contactmanagerapp.databinding.CardItemBinding
import com.mastercoding.contactmanagerapp.room.User

class MyRecyclerViewAdapter(private val usersList:List<User>,
    private val clickListener:(User)->Unit): RecyclerView.Adapter<MyViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType:Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding: CardItemBinding = DataBindingUtil.inflate(
            layoutInflater, R.layout.card_item,
            parent, false
        )
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return usersList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(usersList[position], clickListener)
    }


}

class MyViewHolder(val binding: CardItemBinding):RecyclerView.ViewHolder(binding.root){
    // This is the Singleton Value
    fun bind(user:User,clickListener: (User)->Unit){
        binding.nameTextview.text = user.name
        binding.emailTextView.text = user.email

        binding.listItemLayout.setOnClickListener {
            clickListener(user)
        }

    }

}