package ders06_IfElse_Statements;

import java.util.Scanner;

public class C03_IfElseStatements {
    public static void main(String[] args) {

        //sur 4: Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        //ucgen eskenar ise "es kenar ucgen" yazdırın.


        Scanner scan =new Scanner(System.in);

        System.out.println("lutfen ucgenin uc kenarini giriniz");

        int kenar1= scan.nextInt();
        int kenar2= scan.nextInt();
        int kenar3= scan.nextInt();

        if (kenar1==kenar2 && kenar2==kenar3){
            System.out.println("Eskenar ucgen");
        }else {
            System.out.println("Eskenar ucgen degil");


        }

    }
}
