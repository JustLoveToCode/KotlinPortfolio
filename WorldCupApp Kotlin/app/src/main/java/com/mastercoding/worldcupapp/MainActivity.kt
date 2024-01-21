package com.mastercoding.worldcupapp

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // AdapterView: ListView
        var listView = findViewById<ListView>(R.id.listview)

        // Adapter
        var adapter = MyAdapter(this,generateData())

        // Connecting the adapter to the listView:
        listView?.adapter = adapter
        adapter?.notifyDataSetChanged()

    }
    // 3- Getting the Data Source using the function
    // generateData() which will return the ArrayList
    // which is of the model type <CountryModel>
    fun generateData():ArrayList<CountryModel>{
        var countriesList = ArrayList<CountryModel>()

        var country1:CountryModel=CountryModel(
            "Brazil","5", R.drawable.brazil
        )
        var country2:CountryModel=CountryModel(
            "Germany", "3", R.drawable.germany
        )

        var country3:CountryModel=CountryModel(
            "France", "4", R.drawable.france
        )
        var country4:CountryModel=CountryModel(
            "SA", "1", R.drawable.sa
        )
        var country5:CountryModel=CountryModel(
            "Spain", "7", R.drawable.spain
        )
        var country6:CountryModel=CountryModel(
            "Japan", "4", R.drawable.japan
        )
        var country7:CountryModel=CountryModel(
            "Philippines", "8", R.drawable.ph
        )

        var country8:CountryModel=CountryModel(
            "Malaysia", "3", R.drawable.malaysia
        )

        var country9:CountryModel=CountryModel(
            "Indonesia", "4", R.drawable.indonesia
        )

        var country10:CountryModel=CountryModel(
            "Venezuela", "10", R.drawable.venezuela
        )
        // Using the add method to add into the ArrayList:
        countriesList.add(country1)
        countriesList.add(country2)
        countriesList.add(country3)
        countriesList.add(country4)
        countriesList.add(country5)
        countriesList.add(country6)
        countriesList.add(country7)
        countriesList.add(country8)
        countriesList.add(country9)
        countriesList.add(country10)
        // This is what you want to return
        // which is the countriesList:
        return countriesList

    }
}
