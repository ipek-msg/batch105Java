package ders24_constructor;

   public class Rope {

    Rope(){
        this("Hasan");

    }

    Rope(String isim){

    }

    Rope(int sayi){

    }

    Rope(int sayi1,int sayi2){

    }



    void swing(){
        System.out.println("swing");
    }

    public static void main(String[] args) {

        Rope rope=null;
        rope.swing();
    }
}