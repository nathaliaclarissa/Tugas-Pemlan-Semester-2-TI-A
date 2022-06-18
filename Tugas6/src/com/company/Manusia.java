package com.company;

public class Manusia {
    private String nama, nik;
    private boolean jk;
    private boolean snikah;

    public Manusia(String nama, String nik, boolean jk, boolean snikah) {
        this.nama = nama;
        this.nik = nik;
        this.jk = jk;
        this.snikah = snikah;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public boolean isJk() {
        return jk;
    }

    public void setJk(boolean jk) {
        this.jk = jk;
    }

    public boolean isSnikah() {
        return snikah;
    }

    public void setSnikah(boolean snikah) {
        this.snikah = snikah;
    }

    public double getTunjangan(){
        if(isSnikah()==true){
            if(isJk()==true){
                return 25;
            } else return 20;
        } else return 15;
    }

    public double getPendapatan(){
        return getTunjangan();
    }

    public String jenisK(){
        if(isJk()==true){
            return "Laki-laki";
        } else return "Perempuan";
    }

    public String toString(){
        return  "Nama                : " + getNama()+"\n" +
                "NIK                 : " + getNik()+"\n"+
                "Jenis Kelamin       : " + jenisK()+"\n"+
                "Jumlah Pendapatan   : " + getPendapatan()+"$";
    }
}

