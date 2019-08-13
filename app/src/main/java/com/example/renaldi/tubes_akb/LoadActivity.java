package com.example.renaldi.tubes_akb;
/*nama  : Renaldi Ferdiansyah
  nim   : 10116032
  kelas : IF-1/AKB-1
  tanggal pengerjaan : 12-08-2019
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import io.realm.Realm;
import io.realm.RealmResults;

public class LoadActivity extends AppCompatActivity {

    Realm realm;
    EditText nama, nim, notelp, email;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load);

        TextView textView = (TextView) findViewById(R.id.textView);

        Realm realm = Realm.getDefaultInstance();

        RealmResults <User> results = realm.where(User.class).findAll();
        String text = "";
        for (User c:results){
            text = text+c.getNama()+"\n";
            text = text+c.getNim()+"\n";
            text = text+c.getNotelp()+"\n";
            text = text+c.getEmail()+"\n\n";

        }
        textView.setText(text);
    }
}
