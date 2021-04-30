package com.example.donutcake;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CakeAdapter
        extends RecyclerView.Adapter<CakeAdapter.ThingViewHolder> {
    private Context context;
    private LayoutInflater layoutInflater;
    private ArrayList<Cake> cakes;

    public CakeAdapter(Context context, ArrayList<Cake> cakes) {
        layoutInflater = LayoutInflater.from(context);
        this.cakes = cakes;
        this.context = context;
    }

    @NonNull
    @Override
    public CakeAdapter.ThingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.item_cake,parent,false);

        return new ThingViewHolder(view );
    }
    public void onBindViewHolder(@NonNull CakeAdapter.ThingViewHolder holder, int position) {

        Cake cake = cakes.get(position);

        holder.tvTitle.setText(cake.getTitle());
        holder.tvDescription.setText(cake.getDescription());
        holder.tvPrice.setText(cake.getPrice());
        holder.imgThing.setImageResource(cake.getImg());
        holder.imgThing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,CakeDetail.class);
                intent.putExtra("img",cakes.get(position).getImg());
                intent.putExtra("title",cakes.get(position).getTitle());
                intent.putExtra("des",cakes.get(position).getDescription());
                intent.putExtra("price",cakes.get(position).getPrice());

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return cakes.size();
    }

    public class ThingViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle,tvPrice,tvDescription;
        ImageView imgThing;

        CakeAdapter cakeAdapter;


        public ThingViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tenbanh);
            tvPrice = itemView.findViewById(R.id.price);
            tvDescription = itemView.findViewById(R.id.description);
            imgThing = itemView.findViewById(R.id.donut);
//            this.cakeAdapter = adapter;
        }

    }
}
