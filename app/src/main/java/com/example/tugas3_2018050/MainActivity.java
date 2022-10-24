package com.example.tugas3_2018050;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ayam_bawang(View view){
        Intent a = new Intent(MainActivity.this,
                Ayam_Bawang.class);
        startActivity(a);
    }
    public void rendang(View view){
        Intent b = new Intent(MainActivity.this,
                rendang.class);
        startActivity(b);
    }
    public void soto(View view){
        Intent c = new Intent(MainActivity.this,
                soto.class);
        startActivity(c);
    }
}