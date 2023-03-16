package ders05_Concatenation;

public class C01_Concanitenation {
    public static void main(String[] args) {

        // sadece asagıda verilen variable lari kullanarak istenen degerleri yazdiralim

        String s1= "Java";
        String s2="Guzeldir";
        String s3="";//hiclik
        String s4=" ";//space,bosluk

        int sayi1=4;
        int sayi2=3;

        //java7 guzeldir43

        System.out.println(s1+(sayi1+sayi2)+s4+s2+sayi1+sayi2);
        //34 java

        System.out.println(s3+sayi2+sayi1+s4+s1);//öncelik sayi toplama ise s3 yani hiçlik koymaliyiz
         //7java guzeldir

        System.out.println(sayi1+sayi2+s1+s4+s2); //işlem once yapılacagı icin parantez gerektirmez


        // java guzeldir7

        System.out.println(s1+s4+s2+(sayi1+sayi2)); //java guzeldir7


        //java guzeldir 12

        System.out.println(s1+s4+s2+s4+sayi1*sayi2); //carpma islemi öncelik oldugu icin parantez gerekmez



    }
}
