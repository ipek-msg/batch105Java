package ders11_StringManupulation;

public class C04_replaceAll {

    public static void main(String[] args) {

        //Kullanicinin girdigi metinde
        // harf dişinda kalan tum metinleri yazin


        String input="Ja5+va cok 1*guzel";

        input=input.replaceAll("\\d",""); // Ja+va cok *guzel
        input=input.replace(" ","5");// Ja+va5cok5*guzel
        input=input.replaceAll("\\W","");//Java5cok5guzel
        input=input.replace("5"," "); //Java cok guzel

        System.out.println(input);
    }
}
