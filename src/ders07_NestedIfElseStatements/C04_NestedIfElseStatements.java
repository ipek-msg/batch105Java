package ders07_NestedIfElseStatements;

import java.util.Scanner;

public class C04_NestedIfElseStatements {
    public static void main(String[] args) {
        //kullanıcıdan cinsiyetini ve yasını alın
        //kadın 60 yas ve uzeri
        //erkek 65 yas ve uzeri emekli olabilir
        //cinsiyet ve yasini dikkate alarak" emekli olabilirsin" veya
        //"emekli olmak için ... yıl calısman gerekiyor "yazdırın

        //ana degisken yas olsun

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen yasınızı giriniz");
        double yas = scan.nextDouble();

        System.out.println("lutfen cinsiyeti giriniz E/K");
        char cinsiyet = scan.next().charAt(0);


        if (yas < 15) {
            System.out.println("Hatalı yas girisi");
        } else if (yas > 60) {
            //emekli olamaz calısması gereken sure cinsiyete baglı
            System.out.println("emekli olamazsın");
            if (cinsiyet == 'k' || cinsiyet == 'K') {
                System.out.println("emekli olmak icin" + (60 - yas) + "yıl kadar calısmalısın");
            } else if (cinsiyet == 'E' || cinsiyet == 'e') {
                System.out.println("daha" + (65 - yas) + "yıl kadar calısmalısın");

            } else {
                System.out.println("hatali cinsiyet girisi");
            }
        } else if (yas < 65) {
            //kadın ise emekli olabilir ancak erkek olamaz
            if (cinsiyet =='K' || cinsiyet =='k') {
                System.out.println("emekli olabilirsin");
            }

        } else if (cinsiyet == 'E' || cinsiyet == 'e') {
            System.out.println("emekli olmak icin " + (65 - yas) + "yıl kadar calısmalısın");
        } else {
            System.out.println("hatali cinsiyet girisi");
        }



    }
}


