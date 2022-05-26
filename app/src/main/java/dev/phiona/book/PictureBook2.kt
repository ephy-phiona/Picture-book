package dev.phiona.book

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PictureBook2 : AppCompatActivity() {
    lateinit var btnBack2:Button
    lateinit var btnNext2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_book2)
        btnBack2=findViewById(R.id.btnBack2)
        btnBack2.setOnClickListener {
            val intent=Intent(this,picBook::class.java)
            startActivity(intent)
        }
        btnNext2=findViewById(R.id.btnNext2)
        btnNext2.setOnClickListener{
            val intent=Intent(this,PictureBook3::class.java)
            startActivity(intent)
        }
    }
}