package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String studentName;
    private ArrayList<Integer> studentGrade;
    private HashMap<String, String> attendanceHash;

    ///MAIN NOT BEING USED NOW METHODS ARE CALLED IN GRADES APP///
    public static void main(String[] args) {


    }

    ///CONSTRUCTOR///
    public Student(String studentName) {
        this.studentName = studentName;
        this.studentGrade = new ArrayList<>();
        this.attendanceHash = new HashMap<>();
    }

    public void recordAttendance(String date, String value) {
        attendanceHash.put(date, value);
        System.out.println(attendanceHash);
    }


    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentGrade=" + studentGrade +
                '}';
    }

    public HashMap<String, String> getAttendanceHash() {
        return attendanceHash;
    }

    public void setAttendanceHash(HashMap<String, String> attendanceHash) {
        this.attendanceHash = attendanceHash;
    }


    public void addGrade(int grade) {
        studentGrade.add(grade);
    }

    public double getGradeAverage() {
        int sum = 0;
        for (int grade : studentGrade) {
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
