package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

    Baju baju = new Baju();

        System.out.println("""
                Baju yang tersedia :
                Baju A dengan harga 100000
                Baju B dengan harga 125000
                Baju C dengan harga 175000""");
        System.out.print("Baju yang akan anda beli bertipe : ");
        baju.jenis = sc.nextLine();
        System.out.print("Jumlah Baju yang akan anda beli adalah : " );
        baju.jumlah = sc.nextInt();

        baju.display();

    }
}

