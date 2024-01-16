package com.example.myapplication;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class AccumulateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.accumulate);

        //결제수단 선택화면으로 넘어가기(미정: 버튼없음)
        ConstraintLayout none = (ConstraintLayout) findViewById(R.id.none);
        none.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SelectPaymentActivity.class);
                startActivity(intent);
            }
        });

    }
}
