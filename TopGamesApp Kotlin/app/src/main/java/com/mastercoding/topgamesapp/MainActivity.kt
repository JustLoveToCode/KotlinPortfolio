package com.mastercoding.topgamesapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1-Adapter View: Recycler(CardView)
        val recyclerView: RecyclerView =findViewById(R.id.recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL,
            false
            )

        // 2- Data Source: List Of Games Objects:
        var gamesList: ArrayList<GameModel> = ArrayList()

        // Creating the Games Here:
        val g1 = GameModel(R.drawable.card ,"Game 1")
        var g2 = GameModel(R.drawable.card, "Game 2")
        var g3 = GameModel(R.drawable.card,"Game 3")
        var g4 = GameModel(R.drawable.card, "Game 4")
        var g5 = GameModel(R.drawable.card, "Game 5")
        var g6 = GameModel(R.drawable.card, "Game 6")
        var g7 = GameModel(R.drawable.card, "Game 7")
        var g8 = GameModel(R.drawable.card, "Game 8")
        // Adding the GameModel Object into the ArrayList which
        // is called the gamesList here:
        gamesList.add(g1)
        gamesList.add(g2)
        gamesList.add(g3)
        gamesList.add(g4)
        gamesList.add(g5)
        gamesList.add(g6)
        gamesList.add(g7)
        gamesList.add(g8)

        // Creating the Adapter Here:
        val adapter=GameAdapter(gamesList)
        recyclerView.adapter = adapter


    }
}

