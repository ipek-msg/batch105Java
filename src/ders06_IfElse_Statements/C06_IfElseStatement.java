package ders06_IfElse_Statements;

public class C06_IfElseStatement {
    public static void main(String[] args) {
        /*
        if else statement ta {} kullanmazsak hem if
        body si hemde  else body si icin sadece 1 satir kabul eder

        sonraki satırlar if else ile ilişkendirilemez
        her durumda çalışır
         */
        int not = 56;


        if (not>= 50){

            System.out.println("sinifi gectin");

            System.out.println("yazin kafan rahat");
        } else {
            System.out.println("bud dersten kaldın");
            System.out.println("yaz okuluna bekleriz:)");
        }
    }
}
