package ders04_matematikselislemler_incrementDecrement;

import java.util.Scanner;

public class C03_DataCasting {

    public static void main(String[] args) {
        // kullanicidan iki int deger alin bunlari
        // biribirine bolun ve sonucu double olarak yazdirin


        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen iki tam sayi giriniz");

        int sayi1= scan.nextInt(); //20
        int sayi2= scan.nextInt(); //6

        System.out.println(sayi1/sayi2); //3

        double ondalikliSonuc=(sayi1/sayi2);  //  (double)(3)== 3.0

        System.out.println(ondalikliSonuc);  //3.0

        double dogrusonuc = (double) sayi1/sayi2; //int== genis olana gore sonuc verir


        System.out.println(dogrusonuc);// 3.333333333333335


    }
}
