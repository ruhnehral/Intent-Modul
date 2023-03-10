package com.example.myintentapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity : Button = findViewById(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener(this)

        val btnMoveActivityWithDataActivity : Button = findViewById(R.id.btn_move_activity_with_data)
        btnMoveActivityWithDataActivity.setOnClickListener(this);

        val btnDialIphone: Button = findViewById(R.id.btn_dial_number)
        btnDialIphone.setOnClickListener(this);
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_move_activity -> {
                val moveIntent = Intent(this@MainActivity, MoveActivity::class.java)
                startActivity(moveIntent) }

            R.id.btn_move_activity_with_data -> {
                    val moveWithDataIntent =
                        Intent(this@MainActivity, MoveWithDataActivity::class.java)
                    moveWithDataIntent.putExtra(
                        MoveWithDataActivity.EXTRA_NAME,
                        "DicodingAcademy Boy")
                    moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE, 5)
                    startActivity(moveWithDataIntent)}

            R.id.btn_dial_number -> {
                        val phoneNumber = "081559572770"
                        val dialIphoneIntent = Intent(Intent.ACTION_DIAL,)
                        Uri.parse("tel:$phoneNumber")
                        startActivity(dialIphoneIntent)
                    }
                }
            }
        }

