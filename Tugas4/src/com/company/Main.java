package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Sate Mas Eco", "Sate Kacang", 20000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Mie Goreng Ko Aho", "Mie Goreng", 35000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Marugame Udon", "Udon", 60000));
        System.out.println("Halo selamat data di sistem kami, silahkan masukkan Nama Merchant, Nama Produk,dan Harga Makanan : ");
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant(in.nextLine(), in.nextLine(), in.nextDouble()));
        DataMerchant.tampilData();

    }
}

