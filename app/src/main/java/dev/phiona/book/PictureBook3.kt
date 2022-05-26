package dev.phiona.book

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PictureBook3 : AppCompatActivity() {
    lateinit var btnBack3:Button
    lateinit var btnNext3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_book3)
        btnBack3=findViewById(R.id.btnBack3)
        btnBack3.setOnClickListener {
            val intent= Intent(this,PictureBook2::class.java)
            startActivity(intent)
        }
        btnNext3=findViewById(R.id.btnNext3)
        btnNext3.setOnClickListener {
            val intent= Intent(this,Picturebook4::class.java)
            startActivity(intent)
        }
    }
}