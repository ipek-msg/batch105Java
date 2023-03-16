package ders10_StringMnipulation;

public class C10_isEmpty {

    public static void main(String[] args) {

        String str="";

        System.out.println(str.isEmpty());//true

        str="  ";

        System.out.println(str.isEmpty());//false //isEmpty dolu mu boş mu diye bakar
        System.out.println(str.isBlank());//true //isBlank boşluk kabul eder

        str="x";

        System.out.println(str.isEmpty());//false
        System.out.println(str.isBlank());//false
    }
}
