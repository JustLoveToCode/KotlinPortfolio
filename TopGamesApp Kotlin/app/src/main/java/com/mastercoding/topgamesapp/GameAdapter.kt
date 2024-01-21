package com.mastercoding.topgamesapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class GameAdapter(val gamesList:ArrayList<GameModel>): RecyclerView.Adapter<GameAdapter.MyViewHolder>() {
    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        // gameImg is of the type ImageView
        var gameImg: ImageView
        // gameTitle is of the type TextView
        var gameTitle:TextView
        // Creation and Initialization of the View Here:
        init{
            gameImg = itemView.findViewById(R.id.cardviewImg)
            gameTitle=itemView.findViewById(R.id.cardviewTXT)


            // Using the setOnClickListener() on the itemView:

            itemView.setOnClickListener(){
                Toast.makeText(
                    itemView.context,
                    "You Choose: ${gamesList[adapterPosition].txtCard}",
                    Toast.LENGTH_SHORT
                ).show()
            }

        }



    }
    // This will create the View for us using the LayoutInflater:
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_item_layout,parent,false)
        return MyViewHolder(v)

    }
    // This will return how many items that is inside the List:
    override fun getItemCount(): Int {
        return gamesList.size
    }
    // This will use the View to set the Data inside them:
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.gameImg.setImageResource(gamesList[position].imgCard)
        holder.gameTitle.setText(gamesList[position].txtCard)
    }

}