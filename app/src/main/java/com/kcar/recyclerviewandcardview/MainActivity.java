package com.kcar.recyclerviewandcardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

//https://mommoo.tistory.com/1

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<MyData> myDataset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        myDataset = new ArrayList<>();
        mAdapter = new MyAdapter(myDataset);
        mRecyclerView.setAdapter(mAdapter);

        myDataset.add(new MyData("#jobs", R.drawable.jobs));
        myDataset.add(new MyData("#moonlight", R.drawable.moonlight));
        myDataset.add(new MyData("#mother", R.drawable.mother));
        myDataset.add(new MyData("#jobs", R.drawable.jobs));
        myDataset.add(new MyData("#moonlight", R.drawable.moonlight));
        myDataset.add(new MyData("#mother", R.drawable.mother));
        myDataset.add(new MyData("#jobs", R.drawable.jobs));
        myDataset.add(new MyData("#moonlight", R.drawable.moonlight));
        myDataset.add(new MyData("#mother", R.drawable.mother));

    }
}
