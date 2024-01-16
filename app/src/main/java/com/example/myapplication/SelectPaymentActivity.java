package com.example.myapplication;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SelectPaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_payment);

        //신용카드
        Button btnCreditCard = (Button) findViewById(R.id.btnCreditCard);
        btnCreditCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PaymentProgressActivity.class);
                startActivity(intent);
            }
        });

        //뒤로가기
        Button btnBack5 = (Button) findViewById(R.id.btnBack5);
        btnBack5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AccumulationStatusActivity.class);
                startActivity(intent);
            }
        });

    }
}
