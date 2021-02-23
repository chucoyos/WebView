package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tv2, tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.textView3);
        String name = getIntent().getStringExtra("name");
        String last = getIntent().getStringExtra("last");

        tv2.setText(name);
        tv3.setText(last);
    }

    public void backToMainActivity(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}