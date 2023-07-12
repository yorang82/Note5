package com.example.part2_challenge;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bnt=(Button) findViewById(R.id.Bnt_ok);
        bnt.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast toast=Toast.makeText(this,"OK button click~~  ", Toast.LENGTH_SHORT);
        toast.show();
    }
}