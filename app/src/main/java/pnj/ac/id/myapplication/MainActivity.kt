package pnj.ac.id.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.annotation.ColorRes
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

	lateinit var list:ListView
	lateinit var  btn:Button

    @SuppressLint("MissingInflatedId")
	override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


		list = findViewById(R.id.listViewAndroid)
		btn = findViewById(R.id.btn_id)

		val data = arrayOf("satu", "dua","tiga")
		val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,data)
		list.adapter = adapter

		supportActionBar!!.setDisplayShowHomeEnabled(true)




		btn.setOnClickListener {
			btn.setBackgroundColor(Color.RED)
			Toast.makeText(this, "TEST", Toast.LENGTH_SHORT).show()
		}
    }

	override fun onCreateOptionsMenu(menu: Menu?): Boolean {
		val inflater = menuInflater
		inflater.inflate(R.menu.menu, menu)
		return true
	}

	override fun onOptionsItemSelected(item: MenuItem): Boolean {

		when(item.itemId){
			R.id.menu1 -> {
				val pindah = Intent(this, Halaman1::class.java)
				startActivity(pindah)
			}
			R.id.menu2 -> {
				val pindah = Intent(this, Halaman2::class.java)
				startActivity(pindah)
			}
			R.id.menu3 -> {
				val pindah = Intent(this, Halaman3::class.java)
				startActivity(pindah)
			}
		}

		return true
	}
}
