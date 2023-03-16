package ders07_NestedIfElseStatements;

import java.util.Scanner;

public class C02_IfElseIfStatements {
    public static void main(String[] args) {

        //soru kullanıcıdan aldıgı urun adedi ve liste fiyatini alin,
        //kullanicidan musteri karti olup olmadıgını sorun.
        //musteri kartı varsa 10 urunden fazla alırsa %20, 10 üründen az ise %15 indirim yapın ,
        // musteri kartı yoksa 10 urunden fazla alırsa %15, 10 üründen az ise %10 indirim yapın.

        int urunAdedi = 30;
        boolean kartVarMi = true;
        double listeFiyati = 12.5;
        double toplamFiyat = 0;
//false yapmak için kart varmı önüne ! konur

        if (kartVarMi == true && urunAdedi > 10) {
            toplamFiyat = urunAdedi * listeFiyati * (0.8);
            System.out.println("%20 indirimli toplam fiyat :" + toplamFiyat);
        } else if (kartVarMi == true && urunAdedi < 10 && urunAdedi > 0) {
            toplamFiyat = urunAdedi * listeFiyati * (0.85);
            System.out.println("%15 indirimli toplam fiyat: " + toplamFiyat);
        } else if (kartVarMi == false && urunAdedi > 10) {
            toplamFiyat = urunAdedi * listeFiyati * (0.85);
            System.out.println("½15 indirimli toplam fiyat: " + toplamFiyat);
        } else if (kartVarMi == false & urunAdedi < 10 && urunAdedi > 0) {
            toplamFiyat = urunAdedi * listeFiyati * (0.9);
            System.out.println("%10 indirimli toplam fiyat : " + toplamFiyat);
        } else {
            System.out.println("gecersiz giris");
        }
    }
}




