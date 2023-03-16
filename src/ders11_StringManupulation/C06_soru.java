package ders11_StringManupulation;

public class C06_soru {

    public static void main(String[] args) {
         /*
         kullanıcıdan bir cumle alin
         -cumlede ev geciyorsa "home sweet home" yazdırın
         -cumlede is geciyorsa, "calıismak guzeldir
         -ikisinide iceriyorsa "hem ev lazım hem is"
         -hic birini gecirmiyorsa "cok calısman lazım"
          */
        String cumle="Eve geldim isler birikmis";
        String cumleCopy=cumle.toLowerCase();

        if (cumleCopy.contains("ev")&& cumleCopy.contains("is")){
            System.out.println("hem ev lazim hem is");

        } else if (cumleCopy.contains("ev")) {
            System.out.println("home sweet home");

        } else if (cumleCopy.contains("is")) {
            System.out.println("calısmak guzeldir" );

        }else {
            System.out.println("cok calısman lazim");
        }
    }
}
