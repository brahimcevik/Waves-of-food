package com.ibrahim.wavesoffood

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.ibrahim.wavesoffood.databinding.ActivityChooseLocationBinding

class ChooseLocationActivity : AppCompatActivity() {
    private val binding:ActivityChooseLocationBinding by lazy {
        ActivityChooseLocationBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        val locationList= arrayOf("Van","Diyarbakır","Batman","Muş")
        val adapter =ArrayAdapter(this,android.R.layout.simple_list_item_1,locationList)
        val autoCompleteTextView =binding.listOfLocation
        autoCompleteTextView.setAdapter(adapter)

    }
}