package com.bookofbrains.shareapp.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.bookofbrains.shareapp.adapters.HobbiesAdapter
import com.bookofbrains.shareapp.R
import com.bookofbrains.shareapp.models.Supplier
import kotlinx.android.synthetic.main.activity_hobbies.*

class HobbiesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobbies)

        setupRecycleView()
    }

    private fun setupRecycleView() {
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recycleView.layoutManager = layoutManager

        val adapter = HobbiesAdapter(this, Supplier.hobbies)
        recycleView.adapter = adapter
    }
}
