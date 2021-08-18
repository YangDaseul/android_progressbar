package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    View view;
    View view2;
    ProgressBar progressBar;
    Button button;
    TextView percent;

    int default1;
    int chargeQnt;
    int remain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view = findViewById(R.id.v_defualt_quant);
        view2 = findViewById(R.id.v_defualt_quant_2);
        progressBar = findViewById(R.id.p_charge_quant);
        button = findViewById(R.id.button);
        percent = findViewById(R.id.percent);

        initView();

        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                chargeQntView();
            }
        });
    }





    private void initView(){
        default1 = 20;
        chargeQnt = 40;
        remain = 100 - (default1 + chargeQnt);

        view.setLayoutParams(new LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.WRAP_CONTENT, default1));
        progressBar.setLayoutParams(new LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.WRAP_CONTENT, chargeQnt));
        view2.setLayoutParams(new LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.WRAP_CONTENT, remain));

        percent.setText(String.valueOf(default1));

    }

    private void chargeQntView(){
        // 전문 호출하여 현재 충전량 받아오기
        int data = 10;
        int value = default1 + data;

        progressBar.setProgress(data);
        percent.setText(String.valueOf(value));




    }
}