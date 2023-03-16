package ders03_datacastingWrapperClass;

public class C02_ExplicitNarrowing {

    public static void main(String[] args) {

        int sayi = 20;

        /* geniş data turundeki bir degeri dar data turundeki bir variable'a atamak isterseniz
        java sorumlulugu almamızı ister

        bu sorumlulugu almak icin cast edecegimiz degerin onune () içerisinde cast etmek istedigimiz
        data turu yazılır

        ancak bu durumda data kayıplari (doubledan int e geçerken virgülden sonrası silinir)

        veya başkalasım olabilir.(int'i byte 'a çevirirsek tekrar tekrar basa döner)

         */

        short sh=(short) sayi;

        System.out.println(sh); // 20

        double dbl=23.5;

        int say=(int)dbl;

        System.out.println(say);//23


        say=15;//int

        byte byt=(byte) say;



    }
}
