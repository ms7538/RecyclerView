package com.poloapps.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"OnCreate: started.");
        initImageBitmaps();
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps");

        mImageUrls.add("https://i.redd.it/unn7o53rfbh41.jpg");
        mNames.add("Paris");

        mImageUrls.add("https://i.redd.it/s600caq7bah41.jpg");
        mNames.add("Switzerland");

        mImageUrls.add("https://i.redd.it/p30wjly28ch41.jpg");
        mNames.add("Seattle");

        mImageUrls.add("https://i.redd.it/eeoea6kb1bh41.jpg");
        mNames.add("Chicago");

        mImageUrls.add("https://i.redd.it/m4v5ila1rbh41.jpg");
        mNames.add("Oregon");

        mImageUrls.add("https://i.redd.it/gxn7zqefy6h41.jpg");
        mNames.add("Canada");

        mImageUrls.add("https://i.redd.it/ag8ikoqu6ah41.jpg");
        mNames.add("Quebec");

        mImageUrls.add("https://i.redd.it/yfxdgwf9oah41.jpg");
        mNames.add("Mt. Rainier");

        mImageUrls.add("https://i.redd.it/g5apeytph9h41.jpg");
        mNames.add("Mammoth Lakes");

        mImageUrls.add("https://i.redd.it/xotq7oco7bh41.jpg");
        mNames.add("Plitvice");

        mImageUrls.add("https://i.redd.it/afhggesddch41.jpg");
        mNames.add("Moldova");

        mImageUrls.add("https://i.redd.it/vj4djfti8ch41.jpg");
        mNames.add(" Gatlinburg, TN");

        mImageUrls.add("https://i.redd.it/rshgdv562bh41.jpg");
        mNames.add("Alps");

        mImageUrls.add("https://i.redd.it/mqmmwmki3ch41.jpg");
        mNames.add("London");

        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview. ");
        RecyclerView recyclerView = findViewById((R.id.recycler_view));
        RecyclerViewAdapter adapter = new RecyclerViewAdapter( mNames, mImageUrls, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
