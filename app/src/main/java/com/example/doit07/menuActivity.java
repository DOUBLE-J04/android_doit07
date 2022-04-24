package com.example.doit07;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class menuActivity extends AppCompatActivity {
    public static final int RESPONSE_CODE_OK = 200;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // process received intent
        Intent receivedIntent = getIntent();

        Button menu01Button = findViewById(R.id.button1);
        menu01Button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent resultIntent = new Intent();
                resultIntent.putExtra("menu", "고객관리 메뉴");

                setResult(Activity.RESULT_OK, resultIntent);
                finish();
            }
        });

        Button menu02Button = findViewById(R.id.button2);
        menu02Button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent resultIntent = new Intent();
                resultIntent.putExtra("menu", "매출관리 메뉴");

                setResult(Activity.RESULT_OK, resultIntent);
                finish();
            }
        });

        Button menu03Button = findViewById(R.id.button3);
        menu03Button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent resultIntent = new Intent();
                resultIntent.putExtra("menu", "상품관리 메뉴");

                setResult(Activity.RESULT_OK, resultIntent);
                finish();
            }
        });

    }
}