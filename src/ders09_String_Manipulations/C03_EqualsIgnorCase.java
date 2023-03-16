package ders09_String_Manipulations;

public class C03_EqualsIgnorCase {

    public static void main(String[] args) {
        String str1= "Ali";
        String str2="ali";
        String str3="ALI";

        System.out.println(str1.equals(str2));//false
        System.out.println(str1.equals(str3));//false

        System.out.println(str1.equalsIgnoreCase(str2));//true
        System.out.println(str1.equalsIgnoreCase(str3));//true

        System.out.println(str1.equalsIgnoreCase("Ali Can"));//false

        /* equalsIgnoreCase ayni metnin buyuk kucuk harf kullanarak olusturulan
        fsrklı yazimlarini birbirine esit olarak kabul eder

        yani equalsIgnoreCase icin ali,Ali,ALİ,ALi,aLI,alI birbirine esittir

        ama kelimede farklilik varsa bunlari tolore etmez
         */
    }
}
