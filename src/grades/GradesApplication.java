package grades;

import util.Input;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    static HashMap <String, Student> ghStudentUser = new HashMap<>();
    static Scanner bufferInput = new Scanner(System.in);
    static Input queryAnotherStudent = new Input();

    public static void main(String[] args) {



        Student studentOne = new Student("Trevor");
        ghStudentUser.put("Whetto", studentOne);
        studentOne.addGrade(85);
        studentOne.addGrade(80);
        studentOne.addGrade(100);   
        studentOne.addGrade(100);
        System.out.println(studentOne.getGradeAverage());


        Student studentTwo = new Student("William");
        ghStudentUser.put("One_hand",studentTwo);
        studentTwo.addGrade(90);
        studentTwo.addGrade(90);
        studentTwo.addGrade(95);
        studentTwo.addGrade(100);

        Student studentThree = new Student("Alex");
        ghStudentUser.put("Little_Mohow",studentThree);
        studentThree.addGrade(95);
        studentThree.addGrade(95);
        studentThree.addGrade(85);
        studentThree.addGrade(75);

        Student studentFour = new Student("Nelson");
        ghStudentUser.put("B^^^h_Lips",studentFour);
        studentFour.addGrade(75);
        studentFour.addGrade(90);
        studentFour.addGrade(65);
        studentFour.addGrade(65);

        System.out.println(ghStudentUser);
        System.out.println();
        System.out.println();



        System.out.println("Here are our github students");
        printStudentKeys(ghStudentUser);
        promptUserQuery();




    }///END OF MAIN


    public static void promptUserQuery(){
        System.out.println("Who would you like more info on? ");
        String studentQuery = bufferInput.nextLine();
        System.out.println(studentQuery);


        if (ghStudentUser.containsKey(studentQuery)) {
            Student currentStudent = ghStudentUser.get(studentQuery);
            System.out.println(studentQuery + "'s name is " + currentStudent.getStudentName() +
                    " their GPA is " + currentStudent.getGradeAverage() +
                    currentStudent.getStudentGrade().toString());
        } else {
            System.out.println("Sorry, " + studentQuery + " isn't a current student");
        }


       boolean carryOn =  queryAnotherStudent.yesNo("Query another student?");
        if(carryOn){
            promptUserQuery();
        }else{
            System.out.println("Good-bye");
        }

    }


    public static void printStudentKeys(HashMap <String, Student> ghStudentUser) {
        for (String key: ghStudentUser.keySet()) {
            System.out.print("|" + key + "|  ");
        }
        System.out.println();
    }














}/// END OF CLASS
