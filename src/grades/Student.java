package grades;

import java.util.ArrayList;

public class Student {
    private String studentName;
    private ArrayList <Integer> studentGrade;

    public Student(String studentName) {
        this.studentName = studentName;
        this.studentGrade = new ArrayList<>();
    }

    public static void main(String[] args) {
        Student studentOne = new Student("trevor");
        studentOne.addGrade(85);
        studentOne.addGrade(80);
        studentOne.addGrade(92);

        System.out.println(studentOne);
        System.out.println(studentOne.getGradeAverage());
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentGrade=" + studentGrade +
                '}';
    }

    public void addGrade(int grade){
        studentGrade.add(grade);
    }

    public double getGradeAverage(){
        int sum = 0;
        for (int grade: studentGrade) {
            sum += grade;
        }
        double averageGrade = (double) sum / studentGrade.size();
        return averageGrade;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public ArrayList<Integer> getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(ArrayList<Integer> studentGrade) {
        this.studentGrade = studentGrade;
    }


}
