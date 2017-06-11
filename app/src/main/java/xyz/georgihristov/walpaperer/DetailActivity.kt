package xyz.georgihristov.walpaperer

import android.app.WallpaperManager
import android.graphics.Bitmap
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.widget.ImageView
import android.widget.Toast
import com.squareup.picasso.Picasso
import model.Photo

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true);
        val imageView = findViewById(R.id.imageView) as ImageView
        val photo = intent.getSerializableExtra(PHOTO) as Photo?
        photo?.webformatURL.let {
            Picasso.with(this).load(photo?.webformatURL)
                    .into(imageView)
        }
        imageView.setOnClickListener {

            imageView.buildDrawingCache()
            val bitMap : Bitmap = imageView.getDrawingCache()
            val wallpaperManager = WallpaperManager.getInstance(this)
            wallpaperManager.setBitmap(bitMap)
            // finish()

        }
    }

    companion object {
        val PHOTO = "PHOTO"
    }
}