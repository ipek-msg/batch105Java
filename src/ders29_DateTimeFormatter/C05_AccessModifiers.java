package ders29_DateTimeFormatter;

public class C05_AccessModifiers {

    public static void main(String[] args) {

      C04_AccsessModifiers obj= new C04_AccsessModifiers();

        obj.isim="Tugay";
        System.out.println(obj.isim); // Tugay
        // obj.sayi=20; private variable'lara baska class'dan ulasilamaz

        C04_AccsessModifiers obj2= new C04_AccsessModifiers();
        System.out.println(obj2.isim); // Ali
    }
}

