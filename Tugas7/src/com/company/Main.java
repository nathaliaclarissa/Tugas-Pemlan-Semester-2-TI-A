package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("""
                Nama    : Nathalia Clarissa Anggraini Suhartanto
                NIM     : 215150700111002
                Kelas   : Teknologi Informasi A""");

        Pegawai ttp1 = new PegawaiTetap("Bayu", "35072849032742489542",2000000);
        System.out.println(ttp1.toString());
        Pegawai ttp2 = new PegawaiTetap("Maria", "35072849032742481111",2500000);
        System.out.println(ttp2.toString());
        Pegawai ttp3 = new PegawaiTetap("Agung", "35072849032123489542", 3000000);
        System.out.println(ttp3.toString());

        Pegawai hari1 = new PegawaiHarian("Edo","35072849032742489343",8500,40);
        System.out.println(hari1.toString());
        Pegawai hari2 = new PegawaiHarian("Kalvin","35072849032712345343", 10000,35);
        System.out.println(hari2.toString());
        Pegawai hari3 = new PegawaiHarian("Aliando", "35072849032742489000", 20000,50);
        System.out.println(hari3.toString());

        Pegawai sls1 = new Sales("Tika","35072849032744289344",50,50000);
        System.out.println(sls1.toString());
        Pegawai sls2 = new Sales("Vania","35072849032744289001",40,25000);
        System.out.println(sls2.toString());
        Pegawai sls3 = new Sales("Heski", "35072849032744280004",27,60000);
        System.out.println(sls3.toString());

    }
}

