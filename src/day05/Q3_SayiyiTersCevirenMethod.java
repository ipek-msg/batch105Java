package day05;

public class Q3_SayiyiTersCevirenMethod {

    /*
     * Interview questions…
     *
     * write a return method to reverse number
     *
     * Input : 12345 Output : 54321
     */
    public static void main(String[] args) {


        int input = 12345;

        reverseNumber(input);
        System.out.println("Girdiginiz sayinin ters cevirilmis hali = " +reverseNumber(input));

    }

    public static int reverseNumber(int input) {

        int reverseNum = 0;

        while (input > 0) {

            reverseNum = input % 10 + reverseNum * 10;

            input = input / 10;
        }

        return reverseNum;


    }
}