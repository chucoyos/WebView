package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class WebSearch extends AppCompatActivity {

    WebView webView;
    Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_search);

        webView = findViewById(R.id.webview);
        button4 = findViewById(R.id.button4);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.google.com/");
    }

    public void goHome(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}