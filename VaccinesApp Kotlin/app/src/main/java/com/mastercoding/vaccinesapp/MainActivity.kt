package com.mastercoding.vaccinesapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Using the setContentView(R.layout.activity_main):
        setContentView(R.layout.activity_main)

        //1- AdapterView:RecyclerView
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL,
            false
            )

        //2-Data Source: This is the ArrayList of the VaccineModel Objects:
        var vaccinesList:ArrayList<VaccineModel> = ArrayList()

        // Each line of code create the new VaccineModel Instances
        // with the name of type Text String and the Resource Identifier
        // of the image:
        val v1 = VaccineModel("Vaccine 1",R.drawable.medicine)
        val v2 = VaccineModel("Vaccine 2",R.drawable.medicine)
        val v3 = VaccineModel("Vaccine 3",R.drawable.medicine)
        val v4 = VaccineModel("Vaccine 4",R.drawable.medicine)
        val v5 = VaccineModel("Vaccine 5",R.drawable.medicine)
        val v6 = VaccineModel("Vaccine 6",R.drawable.medicine)
        val v7 = VaccineModel("Vaccine 7",R.drawable.medicine)
        val v8 = VaccineModel("Vaccine 8",R.drawable.medicine)
        val v9 = VaccineModel("Vaccine 9",R.drawable.medicine)
        // Adding the Object VaccineModel to the vaccinesList
        // using the add method to the ArrayList:
        vaccinesList.add(v1)
        vaccinesList.add(v2)
        vaccinesList.add(v3)
        vaccinesList.add(v4)
        vaccinesList.add(v5)
        vaccinesList.add(v6)
        vaccinesList.add(v7)
        vaccinesList.add(v8)
        vaccinesList.add(v9)

        //3-Adapter
        val adapter = MyAdapter(vaccinesList)
        // This will Connect the Data with the Adapter:
        recyclerView.adapter = adapter

    }



}
