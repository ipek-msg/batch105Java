package ders06_IfElse_Statements;

import java.util.Scanner;

public class C07_IfElseStatements {

    public static void main(String[] args) {
         // kullanıcıdan  bir harf alin
        // girilen karakter kucuk harf ise onu buyuk harf  olarak yazdirin,
        // yoksa girilen harfi yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz");
        char krk = scan.next().charAt(0);

        if(krk>='a' && krk<='z') {

            //kucuk harf girildi demektir
            System.out.println((char) (krk - 32));
        }else {

            //kucuk harf degil dmektir

            System.out.println(krk);
        }
    }
}
