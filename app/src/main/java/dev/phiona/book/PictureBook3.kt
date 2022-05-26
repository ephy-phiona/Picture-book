package dev.phiona.book

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PictureBook3 : AppCompatActivity() {
    lateinit var btnBacck3:Button
    lateinit var btnNexttt3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_book3)
        btnBacck3=findViewById(R.id.btnBackkk3)
        btnBacck3.setOnClickListener {
            val intent= Intent(this,PictureBook2::class.java)
            startActivity(intent)
        }
        btnNexttt3=findViewById(R.id.btnNextt3)
        btnNexttt3.setOnClickListener {
            val intent= Intent(this,Picturebook4::class.java)
            startActivity(intent)
        }
    }
}