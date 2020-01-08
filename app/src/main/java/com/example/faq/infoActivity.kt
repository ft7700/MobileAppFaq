package com.example.faq

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_history.*
import kotlinx.android.synthetic.main.activity_info.*

class infoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        like3.setOnClickListener(){
            val snackbar = Snackbar.make(info,"The content is useful", Snackbar.LENGTH_INDEFINITE)
            snackbar.setAction("Close", View.OnClickListener {
                snackbar.dismiss()
            })

            snackbar.show()
        }

        dislike3.setOnClickListener(){
            val snackbar = Snackbar.make(info,"The content is not useful", Snackbar.LENGTH_INDEFINITE)
            snackbar.setAction("Close", View.OnClickListener {
                snackbar.dismiss()
            })
            snackbar.setActionTextColor(ContextCompat.getColor(this,R.color.colorPrimary))
            val view = snackbar.view
            val text = view.findViewById<TextView>(com.google.android.material.R.id.snackbar_text)
            text.setTextColor(ContextCompat.getColor(this,R.color.colorPrimary))
            snackbar.show()
        }
    }
}