package com.mastercoding.worldcupapp

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast


class MyAdapter(private var activity: Activity, private var items:ArrayList<CountryModel>) : BaseAdapter() {
    override fun getCount(): Int {
        return items.size
    }

    override fun getItem(p0:Int):CountryModel{
        return items[p0]
    }

    override fun getItemId(p0:Int): Long {
        return p0.toLong()
    }
    // ViewGroup is referring to the Group of the View:
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        // Variable view is of the type View
        val view:View?
        // Variable viewHolder is of the type ViewHolder
        // ViewHolder describe the Item View and MetaData within the RecyclerView
        // ViewHolder belong to the Adapter:
        // It is used to Cache References to the View inside each item of the List:
        val viewHolder: ViewHolder
        // If the App is switched on for the first time:
        if(convertView == null){
        // LAYOUT_INFLATER_SERVICE is used to get the Layout into View:
        // when convertView is actually null:
        // This is getting the LayoutInflater Service from the Activity:
        // This is to extract the inflater method here:
        // This is used to create an Instance of the LayoutInflater:
            val inflater= activity?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        // This is used for inflating the Layout Resources into the View Object:
        // The inflate method is then called on the Instance of the inflater
        // to actually create a View Object out of it:
        // Resulting view can then be used and stored in the ViewHolder:
            view = inflater.inflate(R.layout.list_item_layout, null)
            viewHolder = ViewHolder(view)
            view?.tag = viewHolder
        } else{
        // Reusing the convertView here when it is 'out of view'
        // If only 10 items is required to be displayed
        // When user scroll upward, the item 1 become the last item
            view = convertView
            viewHolder = view.tag as ViewHolder
        }
        var countries =items[position]
        viewHolder.txtName?.text = countries.name
        viewHolder.txtCupWin?.text = countries.cupWins
        viewHolder.flagImg?.setImageResource(countries.flag_img)

        view?.setOnClickListener(){
            Toast.makeText(activity,
                "You Choose:${countries.name}",
                Toast.LENGTH_SHORT).show()
        }


        return view as View

    }
    private class ViewHolder(row: View?){
        var txtName: TextView? = null
        var txtCupWin:TextView? = null
        var flagImg: ImageView? = null

        init {
            this.txtName = row?.findViewById(R.id.countryName)
            this.txtCupWin=row?.findViewById(R.id.cupWinsTxt)
            this.flagImg = row?.findViewById(R.id.imageView)
        }

    }

}