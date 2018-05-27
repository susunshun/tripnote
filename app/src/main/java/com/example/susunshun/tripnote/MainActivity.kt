package com.example.susunshun.tripnote

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), RecyclerViewHolder.ItemClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val hoges = listOf("aaa", "bbb", "CCC").toMutableList()
        mainRecyclerView.adapter = RecyclerAdapter(this, this, hoges)
        mainRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }

    override fun onItemClick(view: View, position: Int) {
        Toast.makeText(applicationContext, "position $position was tapped", Toast.LENGTH_SHORT).show()
    }
}
