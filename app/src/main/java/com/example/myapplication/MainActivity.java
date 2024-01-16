package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //포장하기
        LinearLayout packedLayout = findViewById(R.id.packed);
        packedLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SelectDetailActivity.class);
                startActivity(intent);
            }
        });

        //매장식사
        LinearLayout eatLayout = findViewById(R.id.eat);
        eatLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SelectDetailActivity.class);
                startActivity(intent);
            }
        });

        //언어선택
        Button btnSelectLan = (Button) findViewById(R.id.btnSelectLan);
        btnSelectLan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SelectLanguageActivity.class);
                startActivity(intent);
            }
        });

        //직원 호출
        LinearLayout callEmpLayout = findViewById(R.id.callEmp);
        callEmpLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CallEmployeeActivity.class);
                startActivity(intent);
            }
        });
    }
}
