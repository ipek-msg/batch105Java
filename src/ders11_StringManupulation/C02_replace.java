package ders11_StringManupulation;

public class C02_replace {
    public static void main(String[] args) {
         String str="Java candir";

        System.out.println(str.replace('a','A'));//JAvA cAndir

        System.out.println(str.replace(' ','_'));//Java_candir

        System.out.println(str.replace("candir","cok guzeldir"));// Java cok guzeldir

        System.out.println(str.replace(" ",""));//Javacandir

        //String'deki tum a 'lari silin

        System.out.println(str.replace("a",""));//Jv cndir

        //Java candir yerine cok guzel yazdiralim

        System.out.println(str.replace("Java candir", "cok guzel"));

        //Java yerine Hava candir yerine cok guzel yazdiralim

        System.out.println(str.replace("Java", "Hava")
                                        .replace("candir","cok guzel"));

        System.out.println(str.replace("","_"));//_J_a_v_a_ _c_a_n_d_i_r_

        //sadece 1. a yı A yapin

        System.out.println(str.replaceFirst("a","A"));//JAva candir


    }

}
