package ders04_matematikselislemler_incrementDecrement;

import java.util.Scanner;

public class C02_DateCasting {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen iki sayi giriniz");

        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();

        int bolmeSonucuTamsayi=(int)(sayi1/sayi2);

        System.out.println(bolmeSonucuTamsayi);
    }
}
