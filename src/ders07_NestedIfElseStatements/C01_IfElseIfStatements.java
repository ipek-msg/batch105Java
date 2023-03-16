package ders07_NestedIfElseStatements;

import java.util.Scanner;

public class C01_IfElseIfStatements {
    public static void main(String[] args) {

        //soru: kullanıcının kilo ve boyunu isteyip vücut kitle endeksini hesaplayın
        //(kilo*10000/(boy*boy))
        // vucut kitle endeksi 30'dan buyuk ise obez,25-30 arasi ise kilolu,20-25 arası ise, normal
        //20 den kucukse zayıf yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen kg olarak kilonuzu giriniz");
        double agirlik = scan.nextDouble();
        System.out.println("cm olarak boyunuzu giriniz");
        double boy = scan.nextDouble();


        double vke = (agirlik * 10000 / (boy * boy));
        System.out.println("vucut kitle endeksiniz :" + vke);

        if (vke > 30) {
            System.out.println("obez");
        } else if (vke > 25) {
            System.out.println("kilolu");
        } else if (vke > 20) {
            System.out.println("normal");

        } else if (vke > 0) {
            System.out.println("zayif");
        } else {
            System.out.println("yanlis giris");
        }
    }
}






