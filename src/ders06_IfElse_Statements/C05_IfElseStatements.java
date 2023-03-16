package ders06_IfElse_Statements;

import java.util.Scanner;

public class C05_IfElseStatements {

    public static void main(String[] args) {

        //soru 3 kullanicidan yasını isteyin,65 yas ve uzeri ise "emekli olabilirsin" yazdırın
        //yoksa emekli olmasi için calısmasi gereken yil sayisini yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen yasınızı giriniz");

        double yas= scan.nextDouble();

                if(yas>=65){

                    System.out.println("yasınız emeklilik için yeterli");

                }else {
                    System.out.println("emekli olmak içim"+ (65-yas)+"sene daha calısmalısın");

                }

    }



}
