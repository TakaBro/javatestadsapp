package com.example.cleveradsapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class BannerActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.Q)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner);
        this.registerActivityLifecycleCallbacks(ActivityHolder.getInstance());
    }

    public void goToAnotherBannerActivity(View view) {
        Intent intent = new Intent(this, AnotherBannerActivity.class);
        startActivity(intent);
    }
}
