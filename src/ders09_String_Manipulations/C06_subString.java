package ders09_String_Manipulations;

public class C06_subString {
    public static void main(String[] args) {

        String str ="java ogren isi kap";

        str.substring(5);// ogren isi kap

        System.out.println(str.substring(0));//java ogren isi kap

        System.out.println(str.length());//19

        //son karakteri String olarak kaydedin

        String sonHarf=""+str.charAt(str.length()-1);

        sonHarf=str.substring(str.length()-1);
        System.out.println(sonHarf);//p

        //son indexdeki karakteri upper case olarak yazdırın


        System.out.println(str.substring(str.length()-1).toUpperCase());//P

        //son 3 harfi buyuk harf olarak yazdırın

        System.out.println(str.substring(str.length()-3).toUpperCase());//KAP
    }
}
