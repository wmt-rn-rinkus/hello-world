package com.example.testapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val list=ArrayList<StudentData>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        intiView()
    }

    private fun intiView() {

        studentRecycler.layoutManager=StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        studentRecycler.adapter = StudentAdapter(this, list)
        addData()

    }

    private fun addData() {
list.add(StudentData(R.drawable.staggered_prac))
        list.add(StudentData(R.drawable.ic_action_name))
        list.add(StudentData(R.drawable.staggered_prac))
        list.add(StudentData(R.drawable.staggered_prac))
        list.add(StudentData(R.drawable.staggered_prac))
        list.add(StudentData(R.drawable.staggered_prac))
        list.add(StudentData(R.drawable.staggered_prac))
        list.add(StudentData(R.drawable.staggered_prac))





    }
}