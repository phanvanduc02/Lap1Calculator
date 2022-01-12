package rango1.vku.lap1calculator

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btncong.setOnClickListener{
            val result: Double = (num1.text.toString()).toDouble() + (num2.text.toString()).toDouble()
            Result.text = result.toString()
        }
        btntru.setOnClickListener{
            val result: Double = (num1.text.toString()).toDouble() - (num2.text.toString()).toDouble()
            Result.text = result.toString()
        }
        btnnhan.setOnClickListener{
            val result: Double = (num1.text.toString()).toDouble() * (num2.text.toString()).toDouble()
            Result.text = result.toString()
        }
        btnchia.setOnClickListener{
            val result: Double = (num1.text.toString()).toDouble() / (num2.text.toString()).toDouble()
            Result.text = result.toString()
        }
    }
}