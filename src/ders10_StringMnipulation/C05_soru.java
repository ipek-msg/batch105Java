package ders10_StringMnipulation;

public class C05_soru {

    public static void main(String[] args) {
        //mail kontrolu yapan bir program hazırlayın
        //1:mail @ isareti icermiyorsa "gecersiz email"
        //2:@gmail.com icermiyorsa "gmail.adres giriniz"
        //3:@gmail.com ile bitmiyorsa "yazım hatası " seklinde sonuc yazin

        String email="ahmet@gmail.com";

        if (!email.contains("@")){

            System.out.println("gecersiz email");
        } else if (!email.contains("@gmail")){

            System.out.println("gmail adresi giriniz");

        } else if (!email.endsWith("@gmail.com")) {
            System.out.println("yazim hatasi");

        }else {
            System.out.println("email basari ile kaydedildi");
        }
    }
}
