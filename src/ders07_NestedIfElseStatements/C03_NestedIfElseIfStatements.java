package ders07_NestedIfElseStatements;

public class C03_NestedIfElseIfStatements {
    public static void main(String[] args) {
        //kullanıcıdan cinsiyetini ve yasını alın
        //kadın 60 yas ve uzeri
        //erkek 65 yas ve uzeri emekli olabilir
        //cinsiyet ve yasini dikkate alarak" emekli olabilirsin" veya
        //"emekli olmak için ... yıl calısman gerekiyor "yazdırın

        char cinsiyet = 'K';
        int yas = 56;

        //nested if-else seklinde kullanim icin önce ana degiskeni secip
        //ona göre ana yapiyi olusturalim
        //cinsiyet ona gore degisken olsun

        if (cinsiyet == 'k' || cinsiyet == 'K') {
            //giris yapilan deger bir kadina ait demektir

        } else if (cinsiyet == 'e' || cinsiyet == 'E') {
            // giris yapilan deger bir erkege ait
        } else {
            System.out.println("yanlısı cinsiyet girisi");
        }
    }
}
