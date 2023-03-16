package ders11_StringManupulation;

public class C08_soru {
    public static void main(String[] args) {

        //kullanicidan bir sifre isteyin
        // asagıdaki sartlari kontrol edin
        //kullaniciya düzeltmesi gereken tum eksikleri soyleyin
        //eger tum sartlari saglarsa ,"sıfre basarıyla kaydedildi" yazdirin
        //-ilk harf buyuk harf olmalı
        //-son karakter rakam olmalı
        //-sifrede bosluk olmamalı
        //-uzunlugu en az 10 kararkter olmalı

        String sifre="nasilsinKardes1";
        int bayrak=0;

        if(!(sifre.charAt(0)>='a'&& sifre.charAt(0)<'z')){
            System.out.println("ilk harf kucuk olmalı");
            bayrak++;
        }

        if (!(sifre.charAt(sifre.length()-1)>='0'&& sifre.charAt(sifre.length()-1)<='9')){
            System.out.println("son karakter rakam olamlı");
            bayrak++;
        }
        if (sifre.contains(" ")){
            System.out.println("sifre bosluk icermemeli");
            bayrak++;
        }
        if (bayrak==0){
            System.out.println("sifreniz basari ile kaydedildi");
        }
    }


}
