package com.example.esteh;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class EsTehAdapter extends RecyclerView.Adapter<EsTehAdapter.ViewHolder> {
    private ArrayList<EsTehModel> esTehModel;

    public EsTehAdapter(ArrayList<EsTehModel> esTehModel) {
        this.esTehModel = esTehModel;
    }

    @NonNull
    @Override
    public EsTehAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_esteh, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EsTehAdapter.ViewHolder holder, int position) {
        EsTehModel currentItem = esTehModel.get(position);

        holder.namaEsTeh.setText(currentItem.getNamaEsTeh());
        holder.deskripsiEsTeh.setText(currentItem.getDeskripsiEsTeh());
        holder.hargaEsTeh.setText("Harga: Rp " + currentItem.getHargaEsTeh());
        holder.gambarEsTeh.setImageResource(currentItem.getGambarEsTeh());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle item click here
                // You can navigate to detail activity or fragment
                Intent intent = new Intent(v.getContext(), DetailActivity.class);
                intent.putExtra("nama", currentItem.getNamaEsTeh());
                intent.putExtra("deskripsi", currentItem.getDeskripsiEsTeh());
                intent.putExtra("harga", currentItem.getHargaEsTeh());
                intent.putExtra("gambar", currentItem.getGambarEsTeh());
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return esTehModel.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView namaEsTeh;
        TextView deskripsiEsTeh;
        TextView hargaEsTeh;
        ImageView gambarEsTeh;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            namaEsTeh = itemView.findViewById(R.id.tv_esteh);
            gambarEsTeh = itemView.findViewById(R.id.iv_esteh);
            hargaEsTeh = itemView.findViewById(R.id.tv_esteh2);
            deskripsiEsTeh = itemView.findViewById(R.id.tv_esteh3);
        }
    }
}
