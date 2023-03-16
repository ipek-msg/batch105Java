package ders06_IfElse_Statements;



public class C09_IfElseIfStatements {

    public static void main(String[] args) {
         //kullanıcıdan bir tam sayı alın
        // sayı negatifse geceriz sayı
        //tek basamaklı ise rakam
        //iki basamaklı ise iki basamaklı sayı
        //bunun dısındaki sayılar icin buyuk sayı yazdırsın

        int sayi=2; //yada scanner scan =new.scanner(System.in)

        if (sayi<0) {
            System.out.println("gecersiz sayi");

        }else if (sayi<10) {
            System.out.println("rakam");
        }else if (sayi<100){
            System.out.println("iki basamaklı sayı");

        }else {
            System.out.println("buyuk sayi");
        }



    }
}
