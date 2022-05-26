package dev.phiona.book

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PictureBook3 : AppCompatActivity() {
    lateinit var btnBackkk3:Button
    lateinit var btnNextt3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_book3)
        btnBackkk3=findViewById(R.id.btnBackkk3)
        btnBackkk3.setOnClickListener {
            val intent= Intent(this,PictureBook2::class.java)
            startActivity(intent)
        }
        btnNextt3=findViewById(R.id.btnNextt3)
        btnNextt3.setOnClickListener {
            val intent= Intent(this,Picturebook4::class.java)
            startActivity(intent)
        }
    }
}