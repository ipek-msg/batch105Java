package ders04_matematikselislemler_incrementDecrement;

public class C06_Pre_Post_Increment {

    public static void main(String[] args) {

        int a=10;

        //a variable nin degerini yazdirip, sonra a nin degerini bir arttirin

        System.out.println("a:" + a);//10

        a++;
        // a artik 11

        int b =10;
        //b variable nin degerini bir arttip,sonra yazdirin

        b++;

        System.out.println("b : " +b); //11

        int c=10;

        //c variable nın degerini yazdirip, sonra c nin degerini bir artirin

        System.out.println("c:" +c++);//10

        int d=10;

        //d variable ni bir deger arttirin

        System.out.println("d :"  + ++d);


        /*
        c++ veya ++d yi yazdirma veya atama islemimde kullanirsaniz
        c++ ya post incement  denir.o satir icin once islemi yapar sonra arttirmayi yapar
        ++d ye ise pre incement denir,once arttirma yapip sonra islemi yapar

        islemin oldugu satirin bir alt satirina gecildiginde c ' de d'bir artmistir
         */


    }
}
