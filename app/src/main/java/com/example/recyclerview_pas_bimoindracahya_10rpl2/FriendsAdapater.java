package com.example.recyclerview_pas_bimoindracahya_10rpl2;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FriendsAdapater extends RecyclerView.Adapter<FriendsHolder> {

    Context c;
    ArrayList<Model> models; //membuat list dimana parameter di definisikan di dalam model class

    public FriendsAdapater(Context c, ArrayList<Model> models) {
        this.c = c;
        this.models = models;
    }

    @NonNull
    @Override
    public FriendsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, null);

        return new FriendsHolder(view); //akan mereturn view kita kepada holder class
    }

    @Override
    public void onBindViewHolder(@NonNull FriendsHolder holder, int position) {

        holder.mNamaView.setText(models.get(position).getNama());
        holder.mAlamat.setText(models.get(position).getAlamat());
        holder.mNoHp.setText(models.get(position).getNoHp()); //
    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}