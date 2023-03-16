package ders10_StringMnipulation;

public class C01_Concatenation {

    public static void main(String[] args) {
         String str1="java";
         String  str2="guzeldir";
         boolean bl= true;
         int sayi=20;
         double dbl=3.54;

        System.out.println(str1+bl+sayi);//javatrue20

        //System.out.println(bl+sayi);
        //string dısındaki data turlerinde toplama yapmamıza izin vermeyebilir

        System.out.println(sayi + dbl); //23.54

        //System.out.println(str1.concat(bl));
        //concat( ) sadce String variableleri birleştirmek icin kullanilir

        System.out.println(str1.concat(" ").concat(str2));


    }
}
