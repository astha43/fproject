package com.example.recyclerviewapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(var context:Context,private val dataList : ArrayList<DataModel>) :
    RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> (){

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

        val studentName = itemView.findViewById<TextView>(R.id.tvName)
        val studentRollNo = itemView.findViewById<TextView>(R.id.tvRollNo)
        val studentMarks = itemView.findViewById<TextView>(R.id.tvMarks)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val currentItem = dataList[position]
        holder.studentName.text = currentItem.name
        holder.studentRollNo.text = currentItem.rollNo
        holder.studentMarks.text = currentItem.marks
        holder.itemView.setOnClickListener {
            Toast.makeText(context,"Item Position"+position,Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return 2
    }
}