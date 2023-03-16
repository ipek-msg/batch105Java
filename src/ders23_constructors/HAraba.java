package ders23_constructors;

public class HAraba {

    String marka="Marka belirtilmedi";
    String model="Model belirtilmedi";
    String yakit;
    int yil;
    int fiyat;

    public HAraba(String mrk,String mdl,String ykt,int yl,int fyt){

        marka=mrk;
        model=mdl;
        yakit=ykt;
        yil=yl;
        fiyat=fyt;
    }

      public HAraba(String mrk, String mdl, int yl){

        marka=mrk;
        model=mdl;
        yil=yl;

        //istersek parametreleri azaltarakta constructor olusturabiliriz


    }

    public HAraba(){

        //gorunur durumdaki parametresiz constructor
        //default constructor değildir
        //Default constructorin body'si de bos olur
        //Ancak parametresiz constructor da bodye kod yazdırabilir.


        //parametresiz constructor in bodysinde code yoksa
        //default constructor ile ayni işlevi görür
        // ama yine de gorunur durumdaysa default constructor denmez

    }


    //biz gözle görülür herhangi bir constructor olusturdugumuzda
    // Java default constructor i siler
    //Bu durumda daha once olusturulmus olan objelerin sorun olmamasi
    //class 'a parametresiz bir constructor eklememiz faydali olur



    public String toString() {
        return "Araba Ozellikleri " +
                "\nmarka : " + marka +
                "\nmodel : " + model +
                "\nyakit : " + yakit +
                "\nyil : " + yil +
                "\nfiyat : " + fiyat ;
    }

    public int maxHiz(String yakit){
        int maxHiz=120;

        if(yakit.equalsIgnoreCase("dizel")){
            maxHiz=200;
        } else if (yakit.equalsIgnoreCase("benzin")) {
            maxHiz=230;
        } else if (yakit.equalsIgnoreCase("elektrikli")) {
            maxHiz=180;
        }
        return maxHiz;
    }
}

