package com.example.youtek.lessionparsequery;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by youtek on 26/10/2015.
 */
public class MyApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "BBC1UrZKusRiLMbiKdLDwJq1dUzpsx78gbLGYUhC", "RbvKDDs39nGN4VqYYmsNFG1z4B4yokvwgYqEH2H2");
    }
}
