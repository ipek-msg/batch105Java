package ders08_Ternary;

public class C03_Ternary {

    public static void main(String[] args) {
        int a= 5;
        /* ternary operatörü tek başına kullanılamaz
        ternary bize bir sonuc uretir
        bu sonuc ya dırek yazdirmali veya variable atamaliyiz
         */
        String sonuc =a%2==0 ? "cift sayi":"tek sayi";

        /* ternarynin sonucunu bir variable a atayacaksak
        true ve false durumlarinda uretilecek sonucun
        ayni data turune uygun olmasi gerekir.
        aksi halde compant time eror (cte) oluşur.

        ama ternary i sout içinde kullanırsak sonucların data turunun aynı olması şart olmaz
         */
        String sonuc2=a>10 ? "buyuk sayi":""+ 2*a ;// cte vermemesi için stringe çevirdik
    }
}
