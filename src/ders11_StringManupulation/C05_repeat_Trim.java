package ders11_StringManupulation;

public class C05_repeat_Trim {
    public static void main(String[] args) {

        String str="java guzeldir "; //  \n  koyulursa altalta yazar

        System.out.println(str.repeat(4));
        //java guzeldir java guzeldir java guzeldir java guzeldir

        str="   Java guzeldir   ";

        System.out.println(str.length());//19

        str=str.trim();

        System.out.println(str);// Java guzeldir

        System.out.println(str.length());//13
    }
}
