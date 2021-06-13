package com.example.recyclerview_pas_bimoindracahya_10rpl2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {


    TextView mNamaView, mAlamatView, mNoHpView;
    Button buttonCall, buttonEmail, buttonVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        ActionBar actionBar = getSupportActionBar();


        this.mNamaView = findViewById(R.id.txt_nama);
        this.mAlamatView = findViewById(R.id.txt_alamat);
        this.mNoHpView = findViewById(R.id.txt_noHp);


        Intent intent  = getIntent();

        String mNama = intent.getStringExtra("iNama");
        String mAlamat = intent.getStringExtra("iAlamat");
        String mNoHp = intent.getStringExtra("iNoHp");

        actionBar.setTitle(mNama);//switch tittle sesuai nama

        mNamaView.setText(mNama);
        mAlamatView.setText(mAlamat);
        mNoHpView.setText(mNoHp);

    }
}