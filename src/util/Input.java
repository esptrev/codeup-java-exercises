package util;

import java.util.Scanner;

import static java.lang.Integer.toBinaryString;
import static java.lang.Integer.toHexString;

public class Input {

    public  void main(String[] args) {
    }

    private Scanner inputScanner;

    /// CONSTRUCTOR ///
    public Input() {
        this.inputScanner = new Scanner(System.in);
    }

    public String getString(String bufferInput) {
        System.out.println(bufferInput);
        String sentenceInput = inputScanner.nextLine();
        System.out.println("you entered: " + sentenceInput);
        return sentenceInput;

    }

    public boolean yesNo(String anserToYN) {
        System.out.print(anserToYN);
        String bufferYesOrNo = inputScanner.nextLine();
        return (bufferYesOrNo.equalsIgnoreCase("y") || bufferYesOrNo.equalsIgnoreCase("yes"));
    }

    public int getInt() {
        System.out.println("Please enter a number");
        int userNum = inputScanner.nextInt();
        inputScanner.nextLine();
        System.out.println("You entered: " + userNum);
        return userNum;
    }

    public int getInt(int min, int max) {
        System.out.printf("Please enter a number between %d and %d.%n", min, max);
        int userNum = inputScanner.nextInt();
        inputScanner.nextLine();
        if (userNum < min || userNum > max) {
            System.out.println("Try again");
            getInt(min, max);
        } else {
            System.out.printf("Your number %d is in the range%n", userNum);
        }
        return userNum;
    }

    public double getDouble() {
        System.out.println("Please enter a decimal number");
        double userNum = inputScanner.nextInt();
        inputScanner.nextLine();
        System.out.println("Your double is " + userNum);
        return userNum;
    }

    public double getDouble(double min, double max) {
        double userNum = getDouble();
        if (userNum < min || userNum > max) {
            System.out.println("Try again");
            getDouble(min, max);
        } else {
            System.out.printf("Your number %f is in range\n", userNum);
        }
        return userNum;
    }

    public int getIntException() {
        String intParsedString = getString("Please enter a number");
        try {
            int userNum = Integer.valueOf(intParsedString);
            System.out.println("You entered: " + userNum);
            return userNum;
        }catch (NumberFormatException e){
            System.out.println("You didn't enter a number" + e.getMessage());
        }
        return getIntException();
    }

    public double getDoubleException (){
        String dubParsedString = getString("Please enter a decimal based number");
        try{
            double userNum = Integer.valueOf(dubParsedString);
            System.out.println("You entered: " + userNum);
            return userNum;
        }catch (NumberFormatException e){
            System.out.println("You didn't enter a decimal number");
        }
        return getDoubleException();
    }

    public int getBinary(){
        String binaryString = getString("Please enter binary number");
        int userBinary = Integer.valueOf(binaryString);
        System.out.println(toBinaryString(userBinary));
        return userBinary;
    }

    public int getHexString(){
        String hexString = getString("Please enter a hex code");
        int userHex = Integer.valueOf(hexString);
        System.out.println(toHexString(userHex));
        return userHex;
    }


}/// END OF CLASS ///

