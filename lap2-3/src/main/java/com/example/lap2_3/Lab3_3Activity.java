package com.example.lap2_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Lab3_3Activity extends AppCompatActivity implements View.OnClickListener{

    Button trueBtn;
    TextView targetTxteView;
    Button fasleBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3_3);

        trueBtn=findViewById(R.id.btn_visible_true);
        targetTxteView=findViewById(R.id.text_visible_target);
        fasleBtn=findViewById(R.id.btn_visible_false);

        trueBtn.setOnClickListener(this);
        fasleBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        if ( v == trueBtn)
        {
            targetTxteView.setVisibility(View.VISIBLE);
        }
        else if ( v == fasleBtn)
        {
            targetTxteView.setVisibility(View.INVISIBLE);
        }
    }
}