package com.amikom.apkitc2020

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    // Deklarasi Variabel
    private lateinit var nama : EditText
    private lateinit var prodi : EditText
    private lateinit var kirim : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // inisialisasi variabel dengan id
        nama = findViewById(R.id.et_nama)
        prodi = findViewById(R.id.et_prodi)
        kirim = findViewById(R.id.bt_send)

        // Event pada Button
        kirim.setOnClickListener {
            send()
        }
    }

    private fun send() {
        // Deklarasi Variabel
        val namaMahasiswa = nama.text.toString()
        val prodiMahasiswa = nama.text.toString()

        if (namaMahasiswa.isEmpty() || prodiMahasiswa.isEmpty()) {
            // Popup
            Toast.makeText(this, "Silahkan lengkapi nama dan prodi anda", Toast.LENGTH_SHORT).show()
        } else {
            val intentSend = Intent(this, MainActivityDua ::class.java)
            intentSend.putExtra("nama", namaMahasiswa)
            intentSend.putExtra("prodi", prodiMahasiswa)

            startActivity(intentSend)
        }
    }
}