package main;

import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
// option command t to wrap
        Scanner bobScan = new Scanner(System.in);

        boolean continueWithBob = true;

        do {
            System.out.println("What would you like to say to Bob?");
            String  userEnteredResponse = bobScan.nextLine().trim();

            if(userEnteredResponse.endsWith("?")){
                System.out.println("Sure");
            } else if(userEnteredResponse.endsWith("!")){
                System.out.println("Whoa, bruh, chill out");
            } else if(userEnteredResponse.equals("")){
                System.out.println("Dont be that way bruh");
            }else{
                System.out.println("Whatever bruh, you do you");
            }
            System.out.println("Would you like to say something else bruh?");

            String continueConversation = bobScan.next();

            if(!(continueConversation.equalsIgnoreCase("y"))){
                continueWithBob = false;
            }

        } while (continueWithBob);

    }
}
