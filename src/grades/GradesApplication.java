package grades;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap <String, Student>students = new HashMap<>();
        Student studentTwo = new Student("Kristin");
        Student studentThree = new Student("Korbin");


        studentTwo.addGrade(95);
        studentTwo.addGrade(95);
        studentTwo.addGrade(95);

        studentThree.addGrade(95);
        studentThree.addGrade(95);
        studentThree.addGrade(95);



        students.put("GH-Kristin",studentTwo);
//        students.put("Korbin", "raccoonis");

        students.put("KK-child",studentThree);

        System.out.println(students);
    }
}
