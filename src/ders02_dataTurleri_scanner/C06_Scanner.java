package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        //Soru 4: Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alıp,
        //dikdörtgenin alaninin yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen dikdortgenin iki kenar uzunlugunu girin" +
                "\niki kenar uzunlugu arasinda entar'a basin");

        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();

        System.out.println("dikdörtgenin alani : " + (kenar1*kenar2));
    }
}
