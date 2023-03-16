package ders10_StringMnipulation;

public class C04_endswith {

    public static void main(String[] args) {

       String str="java heryerde guzel";

        System.out.println(str.endsWith("guzel"));//true

        System.out.println(str.endsWith(""));//true

        System.out.println(str.endsWith("java her yerde guzeldir"));//true

        System.out.println(str.endsWith("java"));//false

    }
}
