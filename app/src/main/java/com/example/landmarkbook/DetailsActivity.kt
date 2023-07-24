package com.example.landmarkbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.landmarkbook.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {

    lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)

        var intent = intent
        var landmark = intent.getSerializableExtra("landmark") as Landmark
        binding.textView.text = landmark.name
        binding.textView2.text = landmark.country
        binding.imageView.setImageResource(landmark.image)


    }
}