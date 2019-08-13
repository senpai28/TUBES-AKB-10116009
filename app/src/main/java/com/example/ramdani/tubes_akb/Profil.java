package com.example.ramdani.tubes_akb;
/*
  Nama                  : Muhamad Ramdani
  NIM                   : 10116009
  Kelas                 : IF-1/AKB-1
  Tanggal pengerjaan    : 12-08-2019
*/

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Profil extends AppCompatActivity {

    Button logout, listteman, tambahteman;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        logout = (Button) findViewById(R.id.logout);
        tambahteman =(Button) findViewById(R.id.tambahteman);
        listteman = (Button) findViewById(R.id.listteman);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Profil.this, MainActivity.class);
                startActivity(i);
            }
        });

        tambahteman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Profil.this, tambahteman.class);
                startActivity(i);
            }
        });
        listteman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Profil.this, LoadActivity.class);
                startActivity(i);
            }
        });
    }
}
