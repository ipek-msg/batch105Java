package ders08_Ternary;

public class C08_SwitchCase {
    public static void main(String[] args) {
        // kullanıcıdan ay no alip mevsimi yazdirin

        int ayNo= 5;

        switch (ayNo){

            case 12 :
            case 1  :
            case 2  :
                System.out.println("kiş");
                break;
            case 3  :
            case 4  :
            case 5  :
                System.out.println("ilkbahar");
                break;
            case 6  :
            case 7  :
            case 8  :
                System.out.println("yaz");
                break;
            case 9  :
            case 10 :
            case 11 :
                System.out.println("sonbahar");
                break;
            default:
                System.out.println("gecersiz ay no");
        }
    }
}
