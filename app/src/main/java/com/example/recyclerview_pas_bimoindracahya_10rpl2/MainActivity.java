package com.example.recyclerview_pas_bimoindracahya_10rpl2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    RecyclerView mRecyclerView;
    FriendsAdapter mFriendsAdapter;
//    ArrayList<Model> friendsArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(layoutManager);

        mFriendsAdapter = new FriendsAdapter(this, getMyList());
        mRecyclerView.setAdapter(mFriendsAdapter);


    }




    private ArrayList<Model> getMyList() {

        ArrayList<Model> models = new ArrayList<>();

        Model m = new Model("Bimo", "Jl.Padatkarya 15, nirwana curug, 02/02", "+62 877789548");
        models.add(m);

        m = new Model("Kizu", "385-1206, Motomachi", "+81 82475245");
        models.add(m);

        m = new Model("Sano", "467-1148, Minamitanaka Nakamurai", "+81 8754695214");
        models.add(m);

        m = new Model("Johan", "Jl.Bojonegoro", "+81 82475245");
        models.add(m);

        m = new Model("Shiro", "248-1272, Horyumachi Minamikuromaru", "+81 8754963215");
        models.add(m);

        m = new Model("Roger", "123-231, New York", "+1 578246856");
        models.add(m);

        m = new Model("Shiro", "248-1272, Horyumachi Minamikuromaru", "+81 8796325412");
        models.add(m);

        m = new Model("Sukadi", "847-868 Hokkaido", "+81 879652354");
        models.add(m);

        return models;
    }
}