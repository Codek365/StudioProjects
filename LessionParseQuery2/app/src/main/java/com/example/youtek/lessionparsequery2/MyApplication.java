package com.example.youtek.lessionparsequery2;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by youtek on 26/10/2015.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "aOCXoEedBWPNaY9R7hQyHCuPaHH0MHLpeRq62pVg", "YrskOJmmqkRcoNzsZ68sKprHUMFb7m9EyadQW05X");
    }
}
