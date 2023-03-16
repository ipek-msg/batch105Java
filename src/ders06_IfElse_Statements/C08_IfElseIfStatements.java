package ders06_IfElse_Statements;



import java.util.Scanner;

public class C08_IfElseIfStatements {

    public static void main(String[] args) {

        // kullanıcıdan bir üçgenin 3 kenar uzunlugunu alın,
        //kenar uzunlukları 0 veya negatifse "geçersiz kenar uzunlugu "yazdırın
        //ucgen eskenar ise" eşkenar ucgen "yazdırın degilse "eskenar degil" yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen ucgenin kenar uzunluklarını giriniz");

        int kenar1= scan.nextInt();
        int kenar2= scan.nextInt();
        int kenar3= scan.nextInt();

        if(kenar1<=0|| kenar2<=0|| kenar3<=0) {

            System.out.println("gecersiz kenar uzunlugu");
        } else if (kenar1==kenar2 && kenar2==kenar3) {
            System.out.println("eskenar ucgen");
        }else{
            System.out.println("eskenar ucgen degil");

            }
        }


    }



