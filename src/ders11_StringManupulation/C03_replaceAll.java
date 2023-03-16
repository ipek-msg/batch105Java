package ders11_StringManupulation;

public class C03_replaceAll {

    public static void main(String[] args) {

        String str="J1ava2 G9uzel5dir8";

        //strdeki sayilari silip Java Guzeldir haline donusturelim

        //str.replaveAll() sadce bir harf veya char sequence i degil
        //genelleme ile soyleyebilecegimiz ortak ozellikteki tum karakterleri degistirir

        System.out.println(str.replaceAll("\\d",""));// Java Guzeldir

        System.out.println(str.replaceAll("//D",""));//12958

        String s1="ilk urun fiyati:1250tl";
        String s2="ikincii urun fiyati:1500tl";

        //iki urun fiyatinin toplayin

        s1=s2.replaceAll("\\D","");//1250
        s2=s2.replaceAll("\\D","");//1500

        System.out.println(s1+s2);//1250+1500
        System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));//2700
    }
}
