package com.trip.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        String data = getIntent().getStringExtra("data");
        WebView about = findViewById(R.id.tripData);
        about.loadUrl(data);
    }
}