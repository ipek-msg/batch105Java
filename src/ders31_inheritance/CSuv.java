package ders31_inheritance;

public class CSuv extends BinekArac{

    public static void main(String[] args) {

        CSuv suv1=new CSuv();
        System.out.println(suv1.marka);//binek aracların markası vardır
        System.out.println(suv1.model);//binek aracların motorları olur
        System.out.println(suv1.motor);//tum araclar motor kullanır
        System.out.println(suv1.plaka);//tum aracların plakası olur
        System.out.println(suv1.yakit);//araclar farklı yakıtlar kullanır
        System.out.println(suv1.yil);//1900

        suv1.hiz("benzin");//binek aracların hızı modele göre degisir
        suv1.teker();//binek aracların 4 tekeri olur

        CSuv suv2=new CSuv();
        suv2.marka="toyota";
        suv2.model="Rav4";
        suv2.motor="1.6";
        suv2.plaka="06 ANK 006";
        suv2.yakit="benzin";
        suv2.yil=2012;
        suv2.hiz(suv2.yakit);
    }

    public void hiz(String yakit){
        if (yakit.equalsIgnoreCase("benzin")){
            System.out.println("benzinli suvlar max 300 km hız yapar");

        } else if (yakit.equalsIgnoreCase("Dizel")) {
            System.out.println("dizel suvlar max 260 km hız yapar");


        } else if (yakit.equalsIgnoreCase("hibrit")) {
            System.out.println("hibrit suvlar max 220 km hiz yapar");
        }else{
            System.out.println("Byakitbelli degil,max hız söyleyemem");
        }
    }
}
