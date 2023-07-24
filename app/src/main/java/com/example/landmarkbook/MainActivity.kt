package com.example.landmarkbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.landmarkbook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private lateinit var landmarklist: ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landmarklist = ArrayList<Landmark>()

        val pisa = Landmark("pisa", "italy", R.drawable.pisa)
        val colloseum = Landmark("colloseum", "italy", R.drawable.collasium)
        val eiffel = Landmark("eiffel", "fransa", R.drawable.eyfel)
        val londonbridge = Landmark("london bridge", "UK", R.drawable.bridge)

        landmarklist.add(pisa)
        landmarklist.add(colloseum)
        landmarklist.add(eiffel)
        landmarklist.add(londonbridge)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val landmarkadaptor = landmarkadaptor(landmarklist)
        binding.recyclerView.adapter = landmarkadaptor

        /*  var adapter = ArrayAdapter(
              this,
              android.R.layout.simple_list_item_1,
              landmarklist.map { landmark -> landmark.name })

          binding.listview.adapter = adapter

          binding.listview.onItemClickListener =
              AdapterView.OnItemClickListener { adapterView, view, i, l ->
                  var intent = Intent(MainActivity@ this, DetailsActivity::class.java)
                  intent.putExtra("landmark", landmarklist.get(i))
                  startActivity(intent)
              }*/
    }
}