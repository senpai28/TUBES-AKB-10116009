package com.example.ramdani.tubes_akb;
/*
  Nama                  : Muhamad Ramdani
  NIM                   : 10116009
  Kelas                 : IF-1/AKB-1
  Tanggal pengerjaan    : 12-08-2019
*/

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

public class User extends RealmObject {
    @PrimaryKey
    private String nama;
    @Required
    private String nim;
    @Required
    private String notelp;
    @Required
    private String email;

    public String getNama(){
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public String getNotelp() {
        return notelp;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNotelp(String notelp) {
        this.notelp = notelp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
