package com.example.myapplication;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AccumulationStatusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.accumulation_status);

        //적립없이 결제하기
        Button btnSelectPay = (Button) findViewById(R.id.btnCreditCard);
        btnSelectPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SelectPaymentActivity.class);
                startActivity(intent);
            }
        });

        //포인트 적립하기
        Button btnEarnPoint = (Button) findViewById(R.id.btnEarnPoint);
        btnEarnPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), EarnPointsActivity.class);
                startActivity(intent);
            }
        });

        //뒤로가기
        Button btnBack3 = (Button) findViewById(R.id.btnBack3);
        btnBack3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OrderCheckActivity.class);
                startActivity(intent);
            }
        });

    }
}
