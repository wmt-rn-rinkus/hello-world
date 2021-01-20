package com.example.testapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_student_adapter.view.*
import java.util.*
import kotlin.collections.ArrayList

class StudentAdapter(val context: Context, val list: ArrayList<StudentData>):RecyclerView.Adapter<ViewHolder>() {
    private val mRandom = Random()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_student_adapter, parent,false))


    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.itemView.image.layoutParams.height = getRandomIntInRange(250, 150)
        Glide.with(context).load(list[position].image).into(holder.itemView.image)


    }



    override fun getItemCount(): Int =list.size
    private fun getRandomIntInRange(max: Int, min: Int): Int {
        return mRandom.nextInt(max - min + min) + min
    }
}