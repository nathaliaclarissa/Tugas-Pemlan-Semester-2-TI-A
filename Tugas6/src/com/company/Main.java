package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("""
                NAMA    : NATHALIA CLARISSA ANGGRAINI SUHARTANTO
                NIM     : 215150700111002
                KELAS   : PEMROGRAMAN LANJUT TI'A""");
        System.out.println("-".repeat(40));
        System.out.println("-".repeat((40)));

        Manusia man1 = new Manusia("Jerimia","271202134",true,true);
        System.out.println(man1.toString());
        Manusia man2 = new Manusia("Mark", "230306134",true, false);
        System.out.println(man2.toString());
        Manusia man3 = new Manusia("Butet","230306135",false,false);
        System.out.println(man3.toString());
        Manusia man4 = new Manusia("Bejo","230306122",false,true);
        System.out.println(man4.toString());

        System.out.println("-".repeat(40));
        System.out.println("-".repeat(40));
        System.out.println("Profesi Mahasiswa :");
        System.out.println("-".repeat(40));
        System.out.println();

        Mahasiswa mhs1 = new Mahasiswa("Megumi Sutejo","230306111",false,false,"1200111002",4);
        System.out.println(mhs1.toString());
        Mahasiswa mhs2 = new Mahasiswa("Eren Yeager","230306121",true,true,"1200111003",3.3);
        System.out.println(mhs2.toString());
        Mahasiswa mhs3 = new Mahasiswa("Olivia Rodrigo","250306134",true,false,"1200111004",2.8);
        System.out.println(mhs3.toString());
        Mahasiswa mhs4 = new Mahasiswa("Conan Gray","230306001",false,true,"1200111005",3);
        System.out.println(mhs4.toString());

        System.out.println("-".repeat(40));
        System.out.println("-".repeat(40));
        System.out.println("Profesi Pekerja :");
        System.out.println("-".repeat(40));
        System.out.println();

        Pekerja pk1 = new Pekerja("Anggraeni Lesmana","230306011",true,false,6,21,"1200222105");
        System.out.println(pk1.toString());
        Pekerja pk2 = new Pekerja("Andrew Starkey","277306001",false,false,7,23,"1200222177");
        System.out.println(pk2.toString());
        Pekerja pk3 = new Pekerja("Fadiliah Muhammad","277306033",false,true,8,25,"1133222105");
        System.out.println(pk3.toString());
        Pekerja pk4 = new Pekerja("Simon Simatupang","277306110",true,true,9,27,"1200222222");
        System.out.println(pk4.toString());

        System.out.println("-".repeat(40));
        System.out.println("-".repeat(40));
        System.out.println("Profesi Manajer :");
        System.out.println("-".repeat(40));
        System.out.println();

        Manager mng1 = new Manager("Heski Pardo", "277306008",true,true,9,27,"1200222211",2000);
        System.out.println(mng1.toString());
        Manager mng2 = new Manager("Diva Viranda", "277306118",false,false,8,25,"1123456782",2000);
        System.out.println(mng2.toString());
        Manager mng3 = new Manager("Rasyid Handiko", "277000110",true,false,7,23,"1123456992",2000);
        System.out.println(mng3.toString());
        Manager mng4 = new Manager("Jasmin Putriana", "201016110",false,true,6,21,"3213456782",2000);
        System.out.println(mng4.toString());
    }
}

