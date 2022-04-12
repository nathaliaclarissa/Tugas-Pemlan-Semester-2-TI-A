package com.company;

public class Merchant {
    private String namaMerch;
    private String namaPro;
    private double hMakanan;

    public Merchant(String namaMerch, String namaProduk, double hMakanan) {
        this.namaMerch = namaMerch;
        this.namaPro = namaProduk;
        this.hMakanan = hMakanan;
    }

    public String getNamaMerchant() {

        return namaMerch;
    }

    public void setNamaMerchant(String namaMerchant) {

        this.namaMerch = namaMerch;
    }

    public String getNamaProduk() {

        return namaPro;
    }

    public void setNamaProduk(String namaPro) {
        this.namaPro = namaPro;
    }

    public double getHargaMakanan() {
        return hMakanan;
    }

    public void setHargaMakanan(double hMakanan) {

        this.hMakanan = hMakanan;
    }
}
