package ders10_StringMnipulation;

public class C07_soru {

    public static void main(String[] args) {

        /*
        kullanıcıdan bir cumle ve bir metin alin
        cumlede metnin durumuna göre
        1-cumle metni icermiyor
        2-cumle metni sadece 1 kere içeriyor
        3-cumle metni birden fazla içeriyor

        */

        String cumle = "java cok guzeldir cok";
        String metin = "cok";

        if (!cumle.contains(metin)) {
            System.out.println("cumle metni icermiyor");
        } else {

            int ilkIndex = cumle.indexOf(metin); //5

            int ikinciIndex = cumle.indexOf(metin, ilkIndex + 1); // ya -1 olacak yada bie index

            if (ikinciIndex == (-1)) {
                System.out.println("cumle metni sadece bir kere iceriyor");

            } else {
                System.out.println("cumle metni birden fazla iceriyor");
            }
        }
    }    }