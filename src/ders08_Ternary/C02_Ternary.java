package ders08_Ternary;

public class C02_Ternary {
    public static void main(String[] args) {
        String str1 = "Ali";
        String str2 = "ali";

        //verilen iki metin birbiri ile ayni ise "metinler ayni"
        //farklı ise "metinler farklı " yazdirin


        if (str1.equals(str2)) {
            System.out.println("metinler ayni");
        } else {
            System.out.println("metinler farkli");
        }

        System.out.println(str1.equals(str2) ? "metinler ayni" : "metinler farkli");

    }
}
