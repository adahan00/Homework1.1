package com.example.homework11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText gmail, message, themes;
    private Button button_send;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gmail = findViewById(R.id.et_gmail);
        message = findViewById(R.id.et_text);
        themes = findViewById(R.id.et_themes);
        button_send = findViewById(R.id.btn1);
        button_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("plain/text");
                intent.putExtra(Intent.EXTRA_EMAIL,new String[]{gmail.getText().toString()});
                intent.putExtra(Intent.EXTRA_SUBJECT,themes.getText().toString());
                intent.putExtra(Intent.EXTRA_TEXT, message.getText());
                startActivity(intent);
            }
        });
    }
}