package ders03_datacastingWrapperClass;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {
        // kullanıcısan bir tamsayi alin
        // kullanıcı kac girerse girsin
        // konsolda -128 ile +127 arasında bir sonuc yazdiracak kod yaziniz

        Scanner scan= new Scanner(System.in);

        System.out.println("lutfen bir tamsayi giriniz");

        int girilenSayi= scan.nextInt();

        byte donusenSayi=(byte) girilenSayi;

        System.out.println("girdiginiz" + girilenSayi +" 'nin donusmus hali :"+ donusenSayi);
    }

}
