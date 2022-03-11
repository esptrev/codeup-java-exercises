package arrays;

import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {

        /// WHAT HAPPENS WHEN YOU RUN CODE BELOW ///
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);
        /// PRINTS OUT OBJECT LOCATION ///

String [] People = new String[3];
People[0] = "Trevor";
People[1] = "Kristin";
People[2] = "Korbin";
            /// TRADITIONAL FOR LOOP ///
        for (int i = 0; i < People.length; i++) {
            System.out.println(People[i]);
        }
        System.out.println("^^^^^^ For Loop Iteration ala: JS");
        /// JAVA FOR EACH ///
        for (String person: People) {
            System.out.println(person);
        }
        System.out.println("^^^^^ For Each Iteration");


addPerson(People.length,People,"Berry");
addPerson(People.length,People,"Riley, Berry, Bailey");



    }

    protected static String[] addPerson(int n, String[] People, String personToBeAdded){
        String [] updatedPeople = new String[n + 1];
        for (int i = 0; i < n; i++) {
            updatedPeople[i] = People[i];
            updatedPeople[n] = personToBeAdded;

        }
        System.out.println(Arrays.toString(updatedPeople));
        return updatedPeople;
    }







}
