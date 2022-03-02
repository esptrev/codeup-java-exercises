package main;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.print("Hello");
        System.out.print(" World!");
        System.out.print("\n");
        int myAge = 45;
        System.out.println(myAge);
        int myFavoriteNumber = 12;
        String myString = "codeup";
        System.out.println(myString);
        myString = "san antonio";
        System.out.println(myString);
        myString = String.valueOf('c');
        System.out.println(myString);
        myFavoriteNumber = (int) 3.14;
        System.out.println(myFavoriteNumber);
        myFavoriteNumber = 123;
        float myNumber = (float) 3.14;

        int x = 5;
        System.out.println(x++);
        System.out.println(x);

        int y = 5;
        System.out.println(++y);
        System.out.println(y);

        int j = 4;
        j += 4;
        System.out.println(j);

        int l = 3;
        int m = 4;
        l *= m;
        System.out.println(l);

        int d = 10;
        int e = 2;
        d /= e;
        e -= d;
        System.out.println(d);
        System.out.println(e);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter something: ");
        String userInput = scanner.next();

        System.out.println("You entered: --> \"" + userInput + "\" <--");






    }
}

