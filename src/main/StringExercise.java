package main;

public class StringExercise {
    public static void main(String[] args) {
        String demoONeStr = "We don't need no education";
        String demoReplace = demoONeStr.replace("education", "thought control");
        System.out.println(demoReplace);

        String checkString = "Check \"this\" out!, \"s inside of \"s!\n";
        System.out.println(checkString);

        String windowsString = "In windows, the main drive is usually C:\\\n";
        System.out.println(windowsString);

        String backSlashString = "I can do backslashes \\, double backslashes \\\\,\n" +
                "and the amazing triple backslash \\\\\\!\n";
        System.out.println(backSlashString);
    }
}
