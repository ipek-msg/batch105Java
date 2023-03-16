package ders11_StringManupulation;

public class C01_nullPointer {

    public static void main(String[] args) {

        String str1 = "";
        //ster1 e deger atanmıstır

        System.out.println(str1);//hiclik yazdırır
        System.out.println(str1.concat("Java"));// Java

        String str2;

        //str2 olusturdu ama deger  atanmadı

        //System.out.println(str2);//stre2 ye deger atamadıgı icin yazdırılmaz cte verir

        //System.out.println(str2.concat("Java"));// deger atanmadıgı icin method la kullanılamaz

        str2 = "Java Candir";
        System.out.println(str2);//Java Candir
        System.out.println(str2.concat(". "));//Java Candır.


        String str3 = null; //str3 e deger atanmamıstır
        //null pointer ile javaya deger atamadıgımızin farkinda oldugumuzu soyluyoruz

        System.out.println(str3);//null isaretlendigini yazdirir

        // System.out.println(str3.concat("java"));// NullPointerExceptions

        System.out.println(str3+"Java");//nullJava

       // System.out.println(str3.toUpperCase());//NullPointerException
    }


}