package com.example.tugas3_2018050;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Ayam_Bawang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayam_bawang);
    }
    public void activity_main(View view){
        Intent a = new Intent(Ayam_Bawang.this,
                MainActivity.class);
        startActivity(a);
    }
    public void rendang(View view){
        Intent b = new Intent(Ayam_Bawang.this,
                rendang.class);
        startActivity(b);
    }
    public void soto(View view){
        Intent c = new Intent(Ayam_Bawang.this,
                soto.class);
        startActivity(c);
    }
}