package com.example.myapplication;
import static com.example.myapplication.R.color.lightgray;

import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import org.w3c.dom.Text;

public class OrderCheckActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_check);

        LinearLayout menu = (LinearLayout) findViewById(R.id.menu);
        Intent intent = getIntent();
        // 메뉴 동적생성
        //View newItemView = LayoutInflater.from(this).inflate(R.layout.menu_item, null);
        String text = intent.getExtras().getString("cartItemListLayout");
        View newItemView = LayoutInflater.from(this).inflate(R.layout.menu_item, null);
        menu.addView(newItemView);

        //뒤로가기
        Button btnBack2 = (Button) findViewById(R.id.btnBack2);
        btnBack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SelectDetailActivity.class);
                startActivity(intent);
            }
        });

        //주문
        Button btnOrder2 = (Button) findViewById(R.id.btnOrder2);
        btnOrder2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AccumulationStatusActivity.class);
                startActivity(intent);
            }
        });

        //X버튼
        LinearLayout btnDelete = (LinearLayout) findViewById(R.id.btn_delete);
        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu.removeAllViews();
            }
        });

        TextView txtQuantity = (TextView) findViewById(R.id.txt_quantity);
        final int[] quantity = {Integer.parseInt(txtQuantity.getText().toString())};
        //-버튼
        ImageButton btnMinus = (ImageButton) findViewById(R.id.btn_minus);
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (quantity[0] == 1) {
                    txtQuantity.setText(Integer.toString(quantity[0]));
                }
                else {
                    txtQuantity.setText(Integer.toString(quantity[0] -1));
                    quantity[0] = Integer.parseInt(txtQuantity.getText().toString());

                }
            }
        });

        //+버튼
        ImageButton btnPlus = (ImageButton) findViewById(R.id.btn_plus);
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtQuantity.setText(Integer.toString(quantity[0] +1));
                quantity[0] = Integer.parseInt(txtQuantity.getText().toString());
            }
        });


        //매장포장버튼
        Button btnPacked = (Button) findViewById(R.id.btn_packed);
        Button btnEat = (Button) findViewById(R.id.btn_eat);
        //매장버튼
        btnEat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnEat.setBackgroundColor(ContextCompat.getColor(OrderCheckActivity.this, R.color.shinee));
                btnPacked.setBackgroundColor(ContextCompat.getColor(OrderCheckActivity.this, R.color.lightgray));
            }
        });

        //포장버튼
        btnPacked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnEat.setBackgroundColor(ContextCompat.getColor(OrderCheckActivity.this, R.color.lightgray));
                btnPacked.setBackgroundColor(ContextCompat.getColor(OrderCheckActivity.this, R.color.shinee));
            }
        });

    }
}
