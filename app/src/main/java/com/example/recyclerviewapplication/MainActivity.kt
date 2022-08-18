package com.example.recyclerviewapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<DataModel>
    lateinit var stdName : Array<String>
    lateinit var stdRollNo : Array<String>
    lateinit var stdMarks : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerview)

        stdName = arrayOf(
            "Astha Singh",
            "Anjali Singh",
            "Neha Singh",
            "Sunita Singh",
            "Megha Singh",
            "Hema Singh",
            "Reema Singh",
            "Sneha Singh",
            "Suhana Singh",
        )
        stdRollNo = arrayOf(
            "101",
            "102",
            "103",
            "104",
            "105",
            "106",
            "107",
            "108",
            "109",
        )
        stdMarks = arrayOf(
            "60%",
            "70%",
            "80%",
            "90%",
            "65%",
            "75%",
            "85%",
            "55%",
            "65%",
        )

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<DataModel>()

        getUserData()
    }

    private fun getUserData() {

        for (i in stdName.indices){
            val data = DataModel(stdName[i],stdRollNo[i],stdMarks[i])
            newArrayList.add(data)
        }

        recyclerView.adapter = RecyclerViewAdapter(this,newArrayList)
    }
}