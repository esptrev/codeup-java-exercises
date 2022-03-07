package util;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {

    }

    private Scanner inputScanner;

    public Input(){
        this.inputScanner = new Scanner(System.in);
    }

    public String getString (String bufferInput){
        System.out.println(bufferInput);
        String sentenceInput = inputScanner.nextLine();
        System.out.println("you entered: " + sentenceInput);
        return sentenceInput;

    }

    public boolean yesNo (String anserToYN){
        System.out.println(anserToYN);
        String bufferYesOrNo = inputScanner.nextLine();
        return (bufferYesOrNo.equalsIgnoreCase("y") || bufferYesOrNo.equalsIgnoreCase("yes"));
    }

    public int getInt(int min, int max){
        System.out.printf("Please enter a number between %d and %d.%n", min, max);
        int userNum = inputScanner.nextInt();
        inputScanner.nextLine();
        if (userNum < min || userNum > max){
            System.out.println("Try again");
            getInt(min, max);
        } else {
            System.out.printf("Your number %d is in the range%n", userNum);
        }
        return userNum;
    }

    public int getInt(){
        System.out.println("Please enter a number");
        int userNum = inputScanner.nextInt();
        inputScanner.nextLine();
        System.out.println("You entered: " + userNum);
        return userNum;
    }

    public double getDouble( double min, double max){
        System.out.printf("Please enter a number between %f and %f.%n", min, max);
        double userNum = inputScanner.nextDouble();
        if (userNum < min || userNum > max){
            System.out.println("Try again");
            getDouble(min, max);
        } else {
            System.out.printf("Your number %f is in range\n", userNum);
        }
        return userNum;
    }

    public double getDouble(){
        System.out.println("Please enter a decimal number");
        double userNum = inputScanner.nextInt();
        inputScanner.nextLine();
        System.out.println("Your double is " + userNum);
        return userNum;
    }

}/// END OF CLASS ///

