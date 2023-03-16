package ders07_NestedIfElseStatements;

public class C05_NestedIfElseStstements {
    public static void main(String[] args) {

        //soru kullanıcıdan aldıgı urun adedi ve liste fiyatini alin,
        //kullanicidan musteri karti olup olmadıgını sorun.
        //musteri kartı varsa 10 urunden fazla alırsa %20, 10 üründen az ise %15 indirim yapın ,
        // musteri kartı yoksa 10 urunden fazla alırsa %15, 10 üründen az ise %10 indirim yapın.

        int urunAdedi = 30;
        boolean kartVarMi = true;
        double listeFiyati = 12.5;
        double toplamFiyat = 0;

        //ana degisken kart olsun

        if (kartVarMi) {
            // kart var
            if (urunAdedi < 0) {
                System.out.println("hatali urun adedi");

            } else if (urunAdedi < 10) {
                toplamFiyat = urunAdedi * listeFiyati * 0.85;
                System.out.println(("%15 indirimli toplam fiyat:" + toplamFiyat));

            } else {
                toplamFiyat = urunAdedi * listeFiyati * 0.80;
                System.out.println(("%20 indirimli toplam fiyat:" + toplamFiyat));
            }

        } else {
            //kart yok
            if (kartVarMi) {
                if (urunAdedi < 0) {
                    System.out.println("hatali urun adedi");

                } else if (urunAdedi < 10) {
                    toplamFiyat = urunAdedi * listeFiyati * 0.90;
                    System.out.println(("%10 indirimli toplam fiyat:" + toplamFiyat));

                } else {
                    toplamFiyat = urunAdedi * listeFiyati * 0.85;
                    System.out.println(("%15 indirimli toplam fiyat:" + toplamFiyat));
                }
            }
        }
    }
}