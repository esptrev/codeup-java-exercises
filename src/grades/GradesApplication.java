package grades;

import util.Input;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    private static final HashMap<String, Student> ghStudentUser = new HashMap<>();
    private static final Scanner bufferInput = new Scanner(System.in);
    private static final Input queryAnotherStudent = new Input();

    public static void main(String[] args) {

        Student studentOne = new Student("Trevor");
        ghStudentUser.put("Huero", studentOne);
        studentOne.addGrade(85);
        studentOne.addGrade(80);
        studentOne.addGrade(100);
        studentOne.addGrade(100);
        studentOne.recordAttendance("14/4/2022", "A");
        studentOne.recordAttendance("13/4/2022", "P");
        System.out.println(studentOne.getGradeAverage());

        Student studentTwo = new Student("William");
        ghStudentUser.put("One_Hand", studentTwo);
        studentTwo.addGrade(90);
        studentTwo.addGrade(90);
        studentTwo.addGrade(95);
        studentTwo.addGrade(100);

        Student studentThree = new Student("Alex");
        ghStudentUser.put("Little_Mohow", studentThree);
        studentThree.addGrade(95);
        studentThree.addGrade(95);
        studentThree.addGrade(85);
        studentThree.addGrade(75);

        Student studentFour = new Student("Nelson");
        ghStudentUser.put("B^^^h_Lips", studentFour);
        studentFour.addGrade(75);
        studentFour.addGrade(90);
        studentFour.addGrade(65);
        studentFour.addGrade(65);

        System.out.println(ghStudentUser);
        System.out.println();
        System.out.println();

        System.out.println("Here are our github students");
        printStudentKeys(ghStudentUser);


    }///END OF MAIN

    public static void printStudentKeys(HashMap<String, Student> ghStudentUser) {
        for (String key : ghStudentUser.keySet()) {
            System.out.print("|" + key + "|  ");
        }
        System.out.println();
        promptUserQuery();
    }

    public static void promptUserQuery() {

        System.out.print("Who would you like more info on? ");
        String studentQuery = bufferInput.nextLine();
        System.out.println(studentQuery);

        if (ghStudentUser.containsKey(studentQuery)) {
            Student currentStudent = ghStudentUser.get(studentQuery);
            System.out.println(studentQuery + "'s name is " + currentStudent.getStudentName() +
                    " their GPA is " + currentStudent.getGradeAverage() +
                    currentStudent.getStudentGrade() +
                    currentStudent.getAttendanceHash());

        } else {
            System.out.println("Sorry, " + studentQuery + " isn't a current student");
        }

        queryAnotherStudent();
    }

    public static void queryAnotherStudent() {
        boolean carryOn = queryAnotherStudent.yesNo("Query another student?");
        if (carryOn) {
            promptUserQuery();
        } else {
            System.out.println("Good-bye");
        }
    }


}/// END OF CLASS
