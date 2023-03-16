package ders09_String_Manipulations;

public class C05_length {

    public static void main(String[] args) {
         String str="uzunkavaklaraltındayataruyumazoglu";
        System.out.println(str.length());// 34

        //son karakteri yazdırın

        System.out.println(str.charAt(33));//u
        System.out.println(str.charAt(str.length()-1));//son karakteri elde etmek için kullanilir
    }
}
