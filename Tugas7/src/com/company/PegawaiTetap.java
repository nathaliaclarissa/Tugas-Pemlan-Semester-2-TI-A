package com.company;

public class PegawaiTetap extends Pegawai {
    private double upah;

    public PegawaiTetap(String nama, String noKTP, double upah) {
        super(nama, noKTP);
        this.upah = upah;
    }

    public double getUpah() {
        return upah;
    }

    public void setUpah(double upah) {
        this.upah = upah;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Pegawai Tetap   : " + getNama() + "\n" +
                "Nomor KTP       : " + getNoKTP() + "\n" +
                "Upah            : " + getUpah() + "\n" +
                "Pendapatan      : Rp " + gaji() + "\n";
    }

    @Override
    public int gaji() {
        int a;
        a = (int) (getUpah());

        return a;
    }
}

