package com.company;

public class Baju {
    String jenis;
    int harga;
    int jumlah;

    public Baju(String jenis, int jumlah) {
        this.jenis = jenis;
        this.jumlah = jumlah;
    }

    final int bajua = 100000;
    final int bajub = 125000;
    final int bajuc = 175000;

    public Baju() {

    }

    void hargaa(){
        if (jumlah<=100) {harga = bajua;}
        else {harga = 90000;}
    }

    void hargab(){
        if (jumlah<=100) {harga = bajub;}
        else{harga = 120000;}
    }

    void hargac(){
        if (jumlah<=100) {harga = bajuc;}
        else{harga = 160000;}
    }

    void display (){
        if (jenis.equalsIgnoreCase("a"))
            hargaa();
        else if (jenis.equalsIgnoreCase("b"))
            hargab();
        else if (jenis.equalsIgnoreCase("c"))
            hargac();
        System.out.println("Jenis yang anda beli : "+jenis);
        System.out.println("Harga per buah       : "+harga);
        System.out.println("Total harga          : "+harga*jumlah);
    }

}
