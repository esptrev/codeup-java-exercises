package main;

import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
     youWantToPlay();

    }

static int generatedNumber;
static Scanner numberScan = new Scanner(System.in);
   static Scanner playScanner = new Scanner(System.in);
    public static void  youWantToPlay (){
        System.out.println("Would you like to play a number guessing game? (y/n)");
        String letsPlay = playScanner.next();
        if(letsPlay.equals("y")){
            systemGenRandom();
        }else{
            System.out.println("Have a nice day");
            return;
        }
    }


    public static void systemGenRandom (){
            generatedNumber = (int)(Math.floor(Math.random() * (100) + 1));
            System.out.println(generatedNumber);
            getYourGuessesIn();
    }
 static int guessCounter = 0;

    public static void  getYourGuessesIn(){
        if(guessCounter % 3 == 0){
            System.out.println("Would you like to exit? (y/n) ");
            String exitAnswer = playScanner.next();
            if(exitAnswer.equals("y")) {
                System.out.println("Done deal, enjoy your day");
                return;
            }
        }
        System.out.print("Enter your best guess! Remember the number is from 1-100:  ");
        int userBestGuess = Integer.parseInt(numberScan.next());
        if(userBestGuess == generatedNumber){
            System.out.println("Youre the BOMB, nailed it!");
            System.out.println("Would you like to play again? (y/n) ");
            String playAgain = playScanner.next();
            if(playAgain.equals("y")){
                systemGenRandom();
            }else{
                System.out.println("Ok, ok, ok  get back to work");
                return;
            }
        }else if(userBestGuess < generatedNumber){
            System.out.println("You're under, try again: ");
            guessCounter++;
            System.out.println(guessCounter);
            getYourGuessesIn();

        }else {
            System.out.println("You're over, try again: ");
            guessCounter++;
            System.out.println(guessCounter);
            getYourGuessesIn();

        }



    }
















}/// END OF CLASS ///
