package com.example.recyclerview_pas_bimoindracahya_10rpl2;

import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FriendsHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {


    TextView mNamaView, mAlamat, mNoHp;
    ItemClickListener itemClickListener;
    Button buttonDelete;


    public FriendsHolder(@NonNull View itemView) {
        super(itemView);

        mNamaView = itemView.findViewById(R.id.txt_nama);
        mAlamat = itemView.findViewById(R.id.txt_alamat);
        mNoHp = itemView.findViewById(R.id.txt_noHp);
//        buttonDelete = itemView.findViewById(R.id.button_delete);
        itemView.setOnClickListener(this);
        itemView.setOnCreateContextMenuListener(this);


    }

    @Override
    public void onClick(View view) {
        this.itemClickListener.onItemClickListener(view, getLayoutPosition());
    }

    public void setItemClickListener(ItemClickListener ic) {
        this.itemClickListener = ic;
    }


    @Override
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(R.menu.menu, R.id.delete, 1, "Delete").setOnMenuItemClickListener(this);
    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.delete:
                itemClickListener.onDeleteClick(getAdapterPosition());
                break;
        }
        return false;
    }
}
