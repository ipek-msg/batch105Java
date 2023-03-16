package ders08_Ternary;

public class C04_Ternary {

    public static void main(String[] args) {
         //kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        //ucgen eskenar ise "eskenar ucgen" yazdirin,degilse " eskenar degil yazdirin.

        int kenar1=10;
        int kenar2=12;
        int kenar3=10;

        System.out.println(kenar1==kenar2 && kenar2==kenar3 ? "eşkenar ucgen": "eskenar ucgen degil");

        /*basit yapida kullanilir*/

        //kullanicidan iki sayi alin ve buyuk olmayani yazdirin

        int sayi1=10;
        int sayi2=11;
        System.out.println(sayi1>sayi2 ? sayi2 :sayi1);


    }
}
