package com.example.esteh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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

        Button shareButton = findViewById(R.id.btnShare);
        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lakukan share data di sini
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, "Pesanan : " + nama + "\n" +
                        "Harga : " + harga);
                startActivity(Intent.createChooser(intent, "Bagikan"));
            }
        });
    }
}
