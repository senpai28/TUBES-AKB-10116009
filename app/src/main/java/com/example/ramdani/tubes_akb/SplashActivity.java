package com.example.ramdani.tubes_akb;
/*
  Nama                  : Muhamad Ramdani
  NIM                   : 10116009
  Kelas                 : IF-1/AKB-1
  Tanggal pengerjaan    : 12-08-2019
*/

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this,MainActivity.class));
                finish();
            }
        },2000);
    }
}
