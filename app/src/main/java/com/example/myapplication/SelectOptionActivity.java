package com.example.myapplication;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SelectOptionActivity extends AppCompatActivity {

    private boolean btnContainClicked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_option);

        LinearLayout option1A = (LinearLayout)findViewById(R.id.option1A);
        LinearLayout option1B = (LinearLayout)findViewById(R.id.option1B);
        LinearLayout option1C = (LinearLayout)findViewById(R.id.option1C);
        LinearLayout option1D = (LinearLayout)findViewById(R.id.option1D);

        LinearLayout option2A = (LinearLayout)findViewById(R.id.option2A);
        LinearLayout option2B = (LinearLayout)findViewById(R.id.option2B);
        LinearLayout option2C = (LinearLayout)findViewById(R.id.option2C);
        LinearLayout option2D = (LinearLayout)findViewById(R.id.option2D);


        // 옵션1의 LinearLayout을 찾아서 클릭 이벤트 처리
        option1A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeOptionImageBackground(R.id.optionImage1A);
                backOptionImageBackground(R.id.optionImage1B);
                backOptionImageBackground(R.id.optionImage1C);
                backOptionImageBackground(R.id.optionImage1D);
            }
        });
        option1B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeOptionImageBackground(R.id.optionImage1B);
                backOptionImageBackground(R.id.optionImage1A);
                backOptionImageBackground(R.id.optionImage1C);
                backOptionImageBackground(R.id.optionImage1D);
            }
        });
        option1C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeOptionImageBackground(R.id.optionImage1C);
                backOptionImageBackground(R.id.optionImage1A);
                backOptionImageBackground(R.id.optionImage1B);
                backOptionImageBackground(R.id.optionImage1D);
            }
        });
        option1D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeOptionImageBackground(R.id.optionImage1D);
                backOptionImageBackground(R.id.optionImage1A);
                backOptionImageBackground(R.id.optionImage1B);
                backOptionImageBackground(R.id.optionImage1C);
            }
        });

        // 옵션2의 LinearLayout을 찾아서 클릭 이벤트 처리
        option2A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeOptionImageBackground(R.id.optionImage2A);
                backOptionImageBackground(R.id.optionImage2B);
                backOptionImageBackground(R.id.optionImage2C);
                backOptionImageBackground(R.id.optionImage2D);
            }
        });
        option2B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeOptionImageBackground(R.id.optionImage2B);
                backOptionImageBackground(R.id.optionImage2A);
                backOptionImageBackground(R.id.optionImage2C);
                backOptionImageBackground(R.id.optionImage2D);
            }
        });
        option2C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeOptionImageBackground(R.id.optionImage2C);
                backOptionImageBackground(R.id.optionImage2A);
                backOptionImageBackground(R.id.optionImage2B);
                backOptionImageBackground(R.id.optionImage2D);
            }
        });
        option2D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeOptionImageBackground(R.id.optionImage2D);
                backOptionImageBackground(R.id.optionImage2A);
                backOptionImageBackground(R.id.optionImage2B);
                backOptionImageBackground(R.id.optionImage2C);
            }
        });

        //기본값 버튼
        Button btnDefault = findViewById(R.id.btn_default);
        btnDefault.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //옵션1
                changeOptionImageBackground(R.id.optionImage1A);
                backOptionImageBackground(R.id.optionImage1B);
                backOptionImageBackground(R.id.optionImage1C);
                backOptionImageBackground(R.id.optionImage1D);
                //옵션2
                changeOptionImageBackground(R.id.optionImage2A);
                backOptionImageBackground(R.id.optionImage2B);
                backOptionImageBackground(R.id.optionImage2C);
                backOptionImageBackground(R.id.optionImage2D);
            }
        });

        //장바구니 버튼 감지
        Button btnContain = findViewById(R.id.btnContain);

        btnContain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // btnContain이 클릭되었음을 플래그로 표시
                Intent intent = new Intent(SelectOptionActivity.this, SelectDetailActivity.class);
                intent.putExtra("btnContainClicked", true);
                startActivity(intent);
            }
        });

        //취소 버튼
        Button btnCancle = findViewById(R.id.btnCancle);
        btnCancle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });



    }
    // getter 메서드 추가
    public boolean isBtnContainClicked() {
        return btnContainClicked;
    }
    // 플래그 초기화 함수
    public void resetBtnContainClicked() {
        btnContainClicked = false;
    }
    // 옵션Image의 배경 색을 변경하는 메서드
    private void changeOptionImageBackground(int selectedOptionId) {
        // 선택한 옵션Image의 Drawable 가져오기
        Drawable selectedOptionDrawable = getResources().getDrawable(R.drawable.option_select);

        // 선택한 옵션Image의 배경 색 변경
        TextView selectedOptionText = findViewById(selectedOptionId);
        selectedOptionText.setBackground(selectedOptionDrawable);
    }
    private void backOptionImageBackground(int unselectedOptionId) {
        // 선택한 옵션Image의 Drawable 가져오기
        Drawable unselectedOptionDrawable = getResources().getDrawable(R.drawable.card_);

        // 선택한 옵션Image의 배경 색 변경
        TextView selectedOptionText = findViewById(unselectedOptionId);
        selectedOptionText.setBackground(unselectedOptionDrawable);
    }
}