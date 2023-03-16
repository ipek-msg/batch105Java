package ders31_inheritance;

public class BinekArac extends Arac{

    protected String marka="Binek aracların markası vardır";
    protected String model="Binek aracların modeli olur";
    protected int yil=1900;

    protected void hiz(){
        System.out.println("Binek aracların hızı modele göre degisir");
    }

    protected void teker(){
        System.out.println("Binek aracların 4 tekeri olur");
    }
}
