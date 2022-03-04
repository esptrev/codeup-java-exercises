package main;

import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        /// CALL ALL METHODS HERE ///
//        System.out.println(addition(5, 5));
//        System.out.println(subtraction(20, 5));
//        System.out.println(multiplication(6, 5));
//        System.out.println(division(40, 5));
//        System.out.println(modulo(10, 2));
//        System.out.println(multiplySansOperator(10, 1));
//        System.out.println(mulitiplyViaRecursion(5, 10));
//        getInteger(1, 10);
//        factorialMethod();
//        rollOfDieA(16);
//        rollOfDieB(16);
        letsRollTheDice();
    }
//    public static int addition(int a, int b){
//        return a + b;
//    }
//
//    public static int subtraction (int x, int y){
//        return x - y;
//    }
//
//    public static int multiplication (int m, int n){
//        return m * n;
//    }
//
//    public static int division (int a, int b){
//        return a / b;
//    }
//
//    public static int modulo (int d, int e){
//        return d % e;
//    }
//
//    public static int multiplySansOperator ( int startingNum, int loopNum){
//        int total = 0;
//        for (int i = 0; i <= loopNum ; i++) {
//            total += startingNum;
//        }
//        return total;
//    }
//
//    public static int mulitiplyViaRecursion (int startingNumber, int loopNumber){
//
//        if(loopNumber == 0 || startingNumber == 0){
//            return 0;
//        }else {
//            return startingNumber + mulitiplyViaRecursion(startingNumber, loopNumber - 1);
//        }
//    }
//    public static void getInteger(int min, int max){
//        System.out.print("Please enter a number between 1 & 10: ");
//        Scanner bufferNumInput = new Scanner(System.in);
//        int numFromInput = bufferNumInput.nextInt();
//        if((numFromInput >= min && numFromInput <= max)){
//            System.out.println("Thanks for your participation. You entered: " + numFromInput);
//            return;
//        }
//            System.out.println("Please enter a valid number!");
//            getInteger(min, max);
//
//    }
//
//    public static void factorialMethod (){
//        System.out.println("Please enter a number between 1 & 10: ");
//        Scanner factorialScanner = new Scanner(System.in);
//        int numberToBeFactored = factorialScanner.nextInt();
//        System.out.println(numberToBeFactored);
//        System.out.println("Would you like to continue with the factoring? (y/n)");
//        String continueFactoring = factorialScanner.next();
//        if(continueFactoring.equals("y")){
//            if(numberToBeFactored >= 1 && numberToBeFactored <= 10){
//                int totalOfFactorial = 1;
//                for (int i = 1; i <= numberToBeFactored; i++) {
//                    System.out.println(totalOfFactorial *= i);
//                }
//                System.out.println("Run program again? (y/n)");
//                String runProgramAgain = factorialScanner.next();
//                if(runProgramAgain.equals("y")){
//                    factorialMethod();
//                }else{
//                    System.out.println("Thanks for playing, have a nice day");
//                    return;
//                }
//
//            }else{
//                System.out.println("Please enter a number from 1-10: ");
//            }
//        }else{
//            System.out.println("Thanks for playing, have a nice day");
//            return;
//        }
//    }
static Scanner diceRollScan = new Scanner(System.in);
        static int sidesOnDie;
        static String userIsRollingDice;

    static public void letsRollTheDice(){
        System.out.print("How many sides on the die?: ");
        sidesOnDie = diceRollScan.nextInt();
        System.out.print("Are you ready to roll? (y/n) ");
        userIsRollingDice = diceRollScan.next();
       didUserWantToRoll();

    }

    static public void didUserWantToRoll (){
        if(userIsRollingDice.equals("y")){
            rollOfDieB(sidesOnDie);
            rollOfDieA(sidesOnDie);
        }else{
            System.out.println("Ok bruh, enjoy your day");
            return;
        }
        letsRollAgain();

    }
    static public void letsRollAgain (){
        System.out.println("Roll again? (y/n)");
        String rollAgain = diceRollScan.next();
        if(rollAgain.equals("y")){
            rollOfDieB(sidesOnDie);
            rollOfDieA(sidesOnDie);
        }else{
            System.out.println("Thats cool, we get it bruh, work, work, work");
            return;
        }
        letsRollAgain();
    }

    static public void rollOfDieA (int sidesOnDie){
        int aRolled = (int)(Math.floor(Math.random() * (sidesOnDie) + 1));
        System.out.println("You rolled: " + aRolled);
    }

    static public void rollOfDieB (int sidesOnDie){
        int bRolled = (int)(Math.floor(Math.random() * (sidesOnDie) + 1));
        System.out.println("You rolled: " + bRolled);
    }







}/// END OF CLASS DO NOT DELETE ///
