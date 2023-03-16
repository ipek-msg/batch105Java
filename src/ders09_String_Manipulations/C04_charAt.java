package ders09_String_Manipulations;

public class C04_charAt {

    public static void main(String[] args) {

        String str= "Java Candir";
        System.out.println(str.charAt(0));// ilk harfi verir

        System.out.println(str.charAt(5));// 5. Index i verir "C " verir

        System.out.println();//bana sonuncu karakteri verin

        /* karakter sayısı ve index karıştıtılmamalıdır
        bir karakter sayısı ile index arasında fark vardır
        bu metin için karakter sayısı 11 son index 10 dur

        karakter sayısı klavyeye kac defa basarsın
        ındex son harf sayısını verir


         */

        System.out.println(str.charAt(11));// cevap vermez sınır dışı index kalır


    }
}
