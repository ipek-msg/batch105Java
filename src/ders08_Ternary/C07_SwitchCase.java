package ders08_Ternary;

import java.util.Scanner;

public class C07_SwitchCase {

    public static void main(String[] args) {

        //J: Java
        //D:Development
        //K: Kit

        // kullanicidan bir harf alin alinan harf J,D,K dan biriyse yukarıdaki kelimeleiri yazdirin
        //bu harflerden biri degilse "gecersiz harf yazdirin"

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir harf girin");
        char harf=scan.next().charAt(0);

        switch (harf){

            case 'J':
            case 'j':
                System.out.println("Java");
                break;
            case 'D':
            case 'd':
                System.out.println("Development");
                break;
            case 'K':
            case 'k':
                System.out.println("Kit");
                break;
            default:
                System.out.println("gecersiz harf");
            }

    }
}
