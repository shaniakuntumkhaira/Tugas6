package com.example.esteh;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Mendapatkan data dari Intent
        String nama = getIntent().getStringExtra("nama");
        String deskripsi = getIntent().getStringExtra("deskripsi");
        int harga = getIntent().getIntExtra("harga", 0);
        int gambarResId = getIntent().getIntExtra("gambar", 0);

        // Menampilkan data di layout detail
        TextView namaTextView = findViewById(R.id.nama_produk);
        TextView deskripsiTextView = findViewById(R.id.deskripsi_produk);
        TextView hargaTextView = findViewById(R.id.harga_produk);
        ImageView gambarImageView = findViewById(R.id.gambar_produk);

        namaTextView.setText(nama);
        deskripsiTextView.setText(deskripsi);
        hargaTextView.setText("Harga: Rp " + harga);
        gambarImageView.setImageResource(gambarResId);
    }
}
