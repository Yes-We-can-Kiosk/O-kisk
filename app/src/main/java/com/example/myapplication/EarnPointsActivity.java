package com.example.myapplication;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class EarnPointsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earn_points);

        //뒤로가기
        Button btnBack4 = (Button) findViewById(R.id.btnBack4);
        btnBack4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AccumulationStatusActivity.class);
                startActivity(intent);
            }
        });

        //적립없이 결제하기
        Button btnSelectPay2 = (Button) findViewById(R.id.btnSelectPay2);
        btnSelectPay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SelectPaymentActivity.class);
                startActivity(intent);
            }
        });

        //적립완료 화면으로 넘어가기(미정: 버튼없음)
        ImageView viewAccumulate = (ImageView) findViewById(R.id.viewAccumulate);
        viewAccumulate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AccumulateActivity.class);
                startActivity(intent);
            }
        });

    }
}
