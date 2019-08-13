package com.example.ramdani.tubes_akb;
/*
  Nama                  : Muhamad Ramdani
  NIM                   : 10116009
  Kelas                 : IF-1/AKB-1
  Tanggal pengerjaan    : 12-08-2019
*/

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button signin;

    public static final String MyPREFERENCES = "MyPrefs";
    public static final String Name = "namekey";
    public static final String Password = "passkey";

    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        signin =  (Button) findViewById(R.id.signin);
        sharedPreferences = getSharedPreferences("Reg",0);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n = username.getText().toString();
                String p = password.getText().toString();

                SharedPreferences.Editor editor = sharedPreferences.edit();

                if(signin.getText().length()<=0){
                    Toast.makeText(MainActivity.this, "Masukan Ussername", Toast.LENGTH_LONG);
                }
                else if(password.getText().length()<=0) {
                    Toast.makeText(MainActivity.this, "Masukan Password", Toast.LENGTH_LONG);

                }
                else {

                    editor.putString(Name, n);
                    editor.putString(Password, p);
                    editor.commit();

                    Intent i = new Intent(MainActivity.this, Profil.class);
                    startActivity(i);
                }


            }
        });
    }
}
