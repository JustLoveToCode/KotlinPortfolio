package com.mastercoding.vaccinesapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

// vaccinesList = [VaccineModel1, VaccineModel2, VaccineModel3]
class MyAdapter(val vaccinesList: ArrayList<VaccineModel> ): RecyclerView.Adapter<MyAdapter.MyViewHolder>()
{
    // ViewHolder: It is something that will hold the data in order to start filling
    // data with the correct data
    inner class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        lateinit var vaccineImage: ImageView
        lateinit var vaccineTitle: TextView

        init{
            vaccineImage = itemView.findViewById(R.id.imageView)
            vaccineTitle = itemView.findViewById(R.id.text1)

            itemView.setOnClickListener(){
                Toast.makeText(itemView.context,
                    "You chooose: ${vaccinesList[adapterPosition].name}",
                    Toast.LENGTH_SHORT).show()
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        // Create the View
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_item_layout,parent,false)
        return MyViewHolder(v)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.vaccineTitle.setText(vaccinesList[position].name)
        holder.vaccineImage.setImageResource(vaccinesList[position].img)
    }

    override fun getItemCount(): Int {
        // Using the size Property in Kotlin Programming
        // to get the numbers of items in the vaccinesList:
        return vaccinesList.size
    }


}