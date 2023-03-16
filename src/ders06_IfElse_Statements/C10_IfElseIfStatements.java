package ders06_IfElse_Statements;



public class C10_IfElseIfStatements {

    public static void main(String[] args) {

        //kullanıcıdan cinsiyetini ve yasını alın
        //kadın 60 yas ve uzeri
        //erkek 65 yas ve uzeri emekli olabilir
        //cinsiyet ve yasini dikkate alarak" emekli olabilirsin" veya
        //"emekli olmak için ... yıl calısman gerekiyor "yazdırın

        char cinsiyet = 'E';
        int yas = 60;

        if (cinsiyet == 'E' && yas >= 65) {
            System.out.println("emekli olabilirsin");

        } else if (cinsiyet == 'E' && yas < 65) {
            System.out.println("emekli olmak için daha" + (65 - yas) + "sene calısmalısın");
        } else if (cinsiyet == 'K' && yas >= 60) {
            System.out.println("emekli olabilirsin");
        } else if (cinsiyet == 'K' && yas < 60) {
            System.out.println("emekli olmak icin daha" + (60 - yas) + "sene calısmalısın");
        } else {
            System.out.println("gecersiz giris");

        }
    }
}