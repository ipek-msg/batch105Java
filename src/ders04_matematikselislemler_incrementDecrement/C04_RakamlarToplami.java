package ders04_matematikselislemler_incrementDecrement;

public class C04_RakamlarToplami {
    public static void main(String[] args) {
        //kullanicidan girdiği 4 basamakli bir sayinin
        // rakamlar toplamini veren bir kod yaziniz


        int input=1453;
        //yada Scanner scan=new Scanner(System.in);
        //System.out.println("lutfen 4 basamakli bir sayi giriniz");
        //int input=scan.next();

        int birlerBasamagi=0;
        int rakamlarToplami=0;

        // 1-birler basamagini al
        birlerBasamagi=input%10; //3
        // 2-birler basamagini rakamlar toplamina ekle
        rakamlarToplami=rakamlarToplami+birlerBasamagi;//3
        //3-birler basamagindan kurtul
        input=input/10;  //145

        birlerBasamagi=input%10; //5
        rakamlarToplami=rakamlarToplami+birlerBasamagi; //8
        input=input/10;  //14


        birlerBasamagi=input%10; //4
        rakamlarToplami=rakamlarToplami+birlerBasamagi; //12
        input=input/10;  //


        birlerBasamagi=input%10; //1
        rakamlarToplami=rakamlarToplami+birlerBasamagi; //13
        input=input/10;  //


        System.out.println("verilen sayilarin rakamlarin toplami : "+ rakamlarToplami);


    }
}
