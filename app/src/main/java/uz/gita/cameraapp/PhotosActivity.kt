package uz.gita.cameraapp

import android.annotation.SuppressLint
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class PhotosActivity : AppCompatActivity() {
    private val intent = getIntent()
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photos)

        val extras = getIntent().extras
        if (extras != null && extras.containsKey("Uri")) {
            val uri = extras.getString("Uri")

            findViewById<ImageView>(R.id.image).setImageURI(Uri.parse(uri))
        }
        else{
            Log.d("TTT", "empty")
        }


//        val uri = intent.extras!!.get("Uri") as Uri
//        findViewById<ImageView>(R.id.image).setImageURI(uri)
    }
}