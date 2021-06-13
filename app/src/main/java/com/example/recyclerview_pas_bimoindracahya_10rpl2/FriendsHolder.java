package com.example.recyclerview_pas_bimoindracahya_10rpl2;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FriendsHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


    TextView mNamaView, mAlamat, mNoHp;
    ItemClickListener itemClickListener;


    public FriendsHolder(@NonNull View itemView) {
        super(itemView);

        this.mNamaView = itemView.findViewById(R.id.txt_nama);
        this.mAlamat = itemView.findViewById(R.id.txt_alamat);
        this.mNoHp = itemView.findViewById(R.id.txt_noHp);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        this.itemClickListener.onItemClickListener(view, getLayoutPosition());
    }

    public void setItemClickListener(ItemClickListener ic) {
        this.itemClickListener = ic;
    }
}
