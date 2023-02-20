package my.edu.tarc.helloskt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

// Instance Name : Type / Class Name
class MainActivity : AppCompatActivity() {
    // onCreate = main function
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Load UI to memory
        setContentView(R.layout.activity_main) // R = Resources

        // linking UI to program code
        val imageQR: ImageView = findViewById(R.id.imageView)
        val nameText: TextView = findViewById(R.id.myName)
        val showBtn: Button = findViewById(R.id.buttonShow)
        val hideBtn: Button = findViewById(R.id.buttonHide)

        showBtn.setOnClickListener {
            imageQR.visibility = View.VISIBLE
            nameText.visibility = View.VISIBLE
        }

        hideBtn.setOnClickListener {
            imageQR.visibility = View.INVISIBLE
            nameText.visibility = View.INVISIBLE
        }
    }
}
