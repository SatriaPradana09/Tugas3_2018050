package com.example.tugas3_2018050;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class rendang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rendang);
    }

    public void activity_main(View view){
        Intent a = new Intent(rendang.this,
                MainActivity.class);
        startActivity(a);
    }
    public void ayam_bawang(View view){
        Intent b = new Intent(rendang.this,
                Ayam_Bawang.class);
        startActivity(b);
    }
    public void soto(View view){
        Intent c = new Intent(rendang.this,
                soto.class);
        startActivity(c);
    }
}