package com.example.renaldi.tubes_akb;
/*nama  : Renaldi Ferdiansyah
  nim   : 10116032
  kelas : IF-1/AKB-1
  tanggal pengerjaan : 12-08-2019
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

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
