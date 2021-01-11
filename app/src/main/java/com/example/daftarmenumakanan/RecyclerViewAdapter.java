package com.example.menumakanan;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<String> FotoMakanan= new ArrayList<>();
    private ArrayList<String> NamaMakanan = new ArrayList<>();
    private ArrayList<String> InfoMakanan = new ArrayList<>();
    private ArrayList<String> HargaMakanan = new ArrayList<>();
    private Context context;

    public RecyclerViewAdapter(ArrayList<String> FotoMakanan, ArrayList<String> NamaMakanan, ArrayList<String> InfoMakanan, ArrayList<String> HargaMakanan, Context context) {
        this.FotoMakanan = FotoMakanan;
        this.NamaMakanan = NamaMakanan;
        this.InfoMakanan = InfoMakanan;
        this.HargaMakanan = HargaMakanan;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.design_layout_adapter, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Glide.with(context).asBitmap().load(FotoMakanan.get(position)).into(holder.imageViewFotoMakanan);

        holder.textViewNamaMakanan.setText(NamaMakanan.get(position));

        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Toast.makeText(context, NamaMakanan.get(position), Toast.LENGTH_LONG).show();
                Intent intent = new Intent(context, DetailActivity.class);

                intent.putExtra("foto_makanan", FotoMakanan.get(position));
                intent.putExtra("nama_makanan", NamaMakanan.get(position));
                intent.putExtra("info_makanan", InfoMakanan.get(position));
                intent.putExtra("harga_makanan", HargaMakanan.get(position));

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return NamaMakanan.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imageViewFotoMakanan;
        TextView textViewNamaMakanan;
        ConstraintLayout constraintLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewFotoMakanan = itemView.findViewById(R.id.imageViewFotoMakanan);
            textViewNamaMakanan = itemView.findViewById(R.id.textViewNamaMakanan);
            constraintLayout = itemView.findViewById(R.id.constraintLayout);
        }
    }
}
