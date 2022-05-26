package dev.phiona.book

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Picturebook4 : AppCompatActivity() {
    lateinit var btnBack4:Button
    lateinit var btnNext4:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picturebook4)
        btnBack4=findViewById(R.id.btnBack4)
        btnBack4.setOnClickListener {
            val intent= Intent(this,PictureBook3::class.java)
            startActivity(intent)
        }
        btnNext4=findViewById(R.id.btnBack4)
        btnNext4.setOnClickListener {
            val intent= Intent(this,PictureBook5::class.java)
            startActivity(intent)
        }
    }
}