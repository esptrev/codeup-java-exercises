package notmain;

import java.util.Scanner;

public class TrevorWorld {
    public static void main(String[] args) {

//        Method overloading //

        System.out.println("Trevors World!");

        System.out.println(sayHello());
        System.out.println(sayHello("Trevor"));
        System.out.println(sayHello("Whats up my bruh ", "Korbin"));


        countdown(5);
        countDownRecursion(5);

        Scanner scannerForCurrencyMethod = new Scanner(System.in);
        validateCurrency(scannerForCurrencyMethod);
    }



    Scanner myNewScan = new Scanner(System.in);
    // COMMAND CLICK TO INVESTIGATE SCANNER //


    public static String  sayHello (){
        return "HELLO TREVOR";
    }

    public static String  sayHello (String name){
        return "HELLO " + name;
//        return "Hello".concat(name);  another option
    }

    public static String  sayHello (String greeting, String name){
        return greeting.concat(name);
    }

    public static int sum (int num1, int num2){
        return num1 + num2;
    }

    public static double sum (double num1, double num2){
        return num1 + num2;
    }

    //// RECURSION FROM LECTURE //////

    public static void countdown (int startNumber){
        for (int i = startNumber; i > 0 ; i--) {
            System.out.println("For Loop Solution: " + i);
        }
    }

    public static void  countDownRecursion (int m){

        /// STARTING POINT/FIRST PRINT OF RECURSIVE ///
        System.out.println("Recursive solution: " + m);

        /// HOW TO STOP RECURSION /// PUT YOUR STOP CODE BEFORE THE PROCEDE CODE ///
        if(m < 1){
            return;
        }
        /// HOW TO ACTUALLY COUNTDOWN ///
        countDownRecursion(m - 1);
    }

    /// VALIDATE SOME CURRENCY ///

    public static void validateCurrency (Scanner currencyScanner){

        /// START ///
        System.out.println("Give me a dollar amount, please :) ");
        String userInput = currencyScanner.nextLine();

        /// STOP ///
        if(userInput.startsWith("$")){
            System.out.println("Thats a valid dollar amount!");
            return;
        }
        /// HOW TO PROCEED ///
        System.out.println("Thats not a dollar amount.");
        validateCurrency(currencyScanner);
    }



}// END OF PUBLIC CLASS OBJECT DO NOT DELETE
