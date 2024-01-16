package com.example.myapplication;
import static com.example.myapplication.R.color.transparent;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SelectDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_detail);

        //뒤로가기
        Button btnBack = (Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        //주문하기
        Button btnOrder = (Button) findViewById(R.id.btnOrder);

        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OrderCheckActivity.class);
                intent.putExtra("cartItemListLayout", true);
                startActivity(intent);
            }
        });

        //메뉴1번
        LinearLayout menuList1 = findViewById(R.id.menuList1);
        menuList1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SelectOptionActivity.class);
                startActivity(intent);

                /*LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                LinearLayout selectoption = (LinearLayout) inflater.inflate(R.layout.select_option, null);
                selectoption.setBackgroundColor(Color.parseColor("#99000000"));
                LinearLayout.LayoutParams paramll = new LinearLayout.LayoutParams
                        (LinearLayout.LayoutParams.FILL_PARENT,LinearLayout.LayoutParams.FILL_PARENT);

                addContentView(selectoption, paramll);

                selectoption.setOnClickListener(writeListener);*/

            }
        });



        // SelectOptionActivity에서 전달한 플래그 값을 얻어오기
        boolean btnContainClicked = getIntent().getBooleanExtra("btnContainClicked", false);
        LinearLayout cartItemListLayout = findViewById(R.id.cartItemListLayout);

        if (btnContainClicked) {
            // btnContain이 클릭되었으면 UI 동적 추가 수행
            View newItemView = LayoutInflater.from(this).inflate(R.layout.menu_item, null);
            cartItemListLayout.addView(newItemView);

            // SelectOptionActivity의 플래그 초기화 함수 호출
            SelectOptionActivity selectOptionActivity = new SelectOptionActivity();
            selectOptionActivity.resetBtnContainClicked();
        }


    }
}
