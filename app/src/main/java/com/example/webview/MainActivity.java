package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText, et2;
    TextView textView;
    Button button, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.et1);
        button = findViewById(R.id.button);
        button3 = findViewById(R.id.button3);
        et2 = findViewById(R.id.et2);
    }

    public void LaunchDetailActivity(View view){
        String name = editText.getText().toString();
        String last = et2.getText().toString();

        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("name", name);
        intent.putExtra("last", last);
        startActivity(intent);
    }

    public void searchTheWeb(View view){
        Intent intent = new Intent(this, WebSearch.class);
        startActivity(intent);
    }
}