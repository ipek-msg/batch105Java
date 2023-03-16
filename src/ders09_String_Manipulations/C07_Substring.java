package ders09_String_Manipulations;

import java.sql.SQLOutput;

public class C07_Substring {
    public static void main(String[] args) {
        String str="java gun geçtikce guzellesıyor";

        System.out.println(str.substring(5, 8)); //gun

        //5.indexden baslar (8-5) karakter yazdırır
        //5. index dahil(inclusive),8.index haric(exclusive)

        //gectikce yazdırın
        System.out.println(str.substring(9,17));//gectikce

        System.out.println(str.substring(3,7));//a gu

        String isim="HASAN";
        //verilen ismi ilk harfi buyuk geriye kalanı kucuk harf oalacak sekilde kaydedin

        isim= isim.substring(0,1).toUpperCase()+ //ilk harf alıp buyuk harf yaptık
              isim.substring(1).toUpperCase();//1. index ve sonrasini alip lucuk harf yaptık

        System.out.println("isim");

        System.out.println(isim.substring(2,5));//san
        //sadece 3. indexdeki
        // harfi yazdırın


         //sadece 3. indexteki harfi yazdirin
        System.out.println(isim=isim.substring(3,4));//A

        //System.out.println("zor sourunun cevabı: " + isim.substring(2,2)); // "" hiçlik yazdirir

        //System.out.println(isim.substring(5,2));// StringIndexOutOfBoundsException
        //hatası verir


    }
}
