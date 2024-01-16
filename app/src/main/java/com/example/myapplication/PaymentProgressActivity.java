package com.example.myapplication;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class PaymentProgressActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment_progress);

        //뒤로가기
        Button btnBack6 = (Button) findViewById(R.id.btnBack6);
        btnBack6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SelectPaymentActivity.class);
                startActivity(intent);
            }
        });

        //결제 진행화면으로 넘어가기(미정: 버튼없음)
        ConstraintLayout none2 = (ConstraintLayout) findViewById(R.id.none2);
        none2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PayingActivity.class);
                startActivity(intent);
            }
        });

    }
}
