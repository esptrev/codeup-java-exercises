package main;

import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.println("i is " + i);
//            i++;
//        }
//        int i=0;
//        do {
//            System.out.println("i is " + i);
//            i+=2;
//        } while (i <= 100);
//    }
//       int x = 100;
//       do{
//           System.out.println("x is: " + x);
//           x -= 5;
//       } while (x >= -10);

//        long y = 2;
//        do{
//            System.out.println(y);
//            y *= y;
//        } while(y < 1000000);

//        int k = 1;
//        while( k <= 100){
//            if(k % 3 == 0 && k % 5 == 0){
//                System.out.println("Fizz Buzz");
//            }else if( k % 3 ==0){
//                System.out.println("Fizz");
//            }else if(k % 5 == 0){
//                System.out.println("buzz");
//            }else{
//                System.out.println("int is neither divisible by 3 or 5.");
//            }
//            k++;
//        }

//        Scanner tableScan = new Scanner(System.in);
//        System.out.print("Please enter a number: ");
//        int tableMaxNumber = tableScan.nextInt();
//        System.out.println("Here is your table!");
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//        int x = 1;
//
//        while(x <= tableMaxNumber){
//            int squarex = x * x;
//            int cubex = x * x * x;
//            System.out.printf("%-6d | %-7d | %-5d \n" ,x,squarex,cubex);
//            x++;
//        }

        Scanner gradeScanner = new Scanner(System.in);
        System.out.print("What was your number grade?  ");
        int studentNumberGrade = gradeScanner.nextInt();
        if(95 <= studentNumberGrade  && studentNumberGrade <= 100){
            System.out.println("Your Letter grade is A+");
        }else if(90 <= studentNumberGrade  && studentNumberGrade <= 94){
            System.out.println("Your Letter grade is A-");
        }else if(85 <= studentNumberGrade  && studentNumberGrade <= 89){
            System.out.println("Your Letter grade is B+");
        }else if(80 <= studentNumberGrade  && studentNumberGrade <= 84){
            System.out.println("Your Letter grade is B-");
        }else if(75 <= studentNumberGrade  && studentNumberGrade <= 79){
            System.out.println("Your Letter grade is C+");
        }else if(70 <= studentNumberGrade  && studentNumberGrade <= 74){
            System.out.println("Your Letter grade is C-");
        }else if(65 <= studentNumberGrade  && studentNumberGrade <= 69){
            System.out.println("Your Letter grade is D+");
        }else if(60<= studentNumberGrade  && studentNumberGrade <= 64){
            System.out.println("Your Letter grade is D-");
        }else if(studentNumberGrade <= 59){
            System.out.println("Your Letter grade is F--");
        }







}}
