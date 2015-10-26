package com.example.youtek.lessionparsequery;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    ListView lv;

    ArrayList<String> mang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.listViewSinhVien);
        mang = new ArrayList<String>();

        ParseQuery<ParseObject> query = ParseQuery.getQuery("SinhVien");
        query.findInBackground(new FindCallback<ParseObject>() {
            public void done(List<ParseObject> SinhViens, ParseException e) {
                if (e == null) {
                    for (int i = 0; i < SinhViens.size(); i++){
                        ParseObject dong = SinhViens.get(i);
                        mang.add(dong.getString("HoTen"));
                    }
                    ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                            getApplicationContext(),
                            android.R.layout.simple_list_item_1,
                            mang
                    );
                    lv.setAdapter(adapter);
                } else {
                    Log.d("HoTen", "Error: " + e.getMessage());
                }
            }
        });
    }
}
