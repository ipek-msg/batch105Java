package ders06_IfElse_Statements;

import java.util.Scanner;

public class C01_IfStatements {

    public static void main(String[] args) {
        //soru 2 Kullanicidan bir harf alin,harf ile baslayan bir ay varsa yazdirin,
        //Kullanici o veya O yazdiginda output olsun

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen ay isminin ilk harfini giriniz");
        char ilkHarf = scan.next().charAt(0);

        if (ilkHarf == 'o' || ilkHarf == 'O') {
            System.out.println("Ocak");
        }
        if (ilkHarf == 's' || ilkHarf == 'S') {
            System.out.println("Subat");
        }
        if (ilkHarf == 'm' || ilkHarf == 'M') {
            System.out.println("Mart veya Mayıs");
        }
        if (ilkHarf == 'n' || ilkHarf == 'N') {
            System.out.println("Nisan");
        }

        if (ilkHarf == 'h' || ilkHarf == 'H') {
            System.out.println("Haziran");
        }

        if (ilkHarf == 't' || ilkHarf == 'T') {

            System.out.println("Temmuz");
        }
        if (ilkHarf == 'a' || ilkHarf == 'A') {
            System.out.println("Agustos veya Aralık");
        }
        if (ilkHarf == 'e' || ilkHarf == 'E') {
            System.out.println("Eylül veya Ekim");
        }
        if (ilkHarf == 'k' || ilkHarf == 'K') {
            System.out.println("Kasım");}
    }
}








