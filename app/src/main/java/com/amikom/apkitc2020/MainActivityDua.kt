package com.amikom.apkitc2020

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast

class MainActivityDua : AppCompatActivity() {

    // Deklarasi Variabel
    private lateinit var namaMahasiswa : TextView
    private lateinit var prodiMahasiswa : TextView
    private  lateinit var btnLike : ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_dua)

        namaMahasiswa = findViewById(R.id.tv_namamahsiswa_activity2)
        prodiMahasiswa = findViewById(R.id.tv_prodimahasiswa_activity2)

        namaMahasiswa.text = intent.getStringExtra("nama")
        prodiMahasiswa.text = intent.getStringExtra("prodi")

        btnLike.setOnClickListener {
            Toast.makeText(this, "Anda Menyukai Halaman Ini", Toast.LENGTH_SHORT).show()
        }
    }
}