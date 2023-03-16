package ders31_inheritance;

public class Arac {


    //child classlardan (yani diger olusturdugumuz baglantılı Classlardan
    //kullanılabilinmesi icin protected class olusturulur

    protected String motor = "Tum araclar motor kullanır";
    protected String plaka = "Tum aracların plakası olur";
    protected String yakit = "Araclar farklı yakitlar kullanir";
    protected void teker(){
        System.out.println("Arac turune göre teker sayisi degisir");

    }
}
