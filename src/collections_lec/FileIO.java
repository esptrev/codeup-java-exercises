package collections_lec;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;

public class FileIO {
    public static void main(String[] args) {
        try {
//            System.out.println(File.separator);
//            Path pathToJavaExercises = Paths.get("/Users/trevoresparza/IdeaProjects/codeup-java-exercises");
//            Path pathToNonExistingFile = Paths.get("/Users/trevoresparza/IdeaProjects/codeup-java-exercises/nofile.txt");
//
//            System.out.println("does Java Exc exist? " + Files.exists(pathToJavaExercises));
//            System.out.println("does Java Exc exist? " + Files.exists(pathToNonExistingFile));

//            Files.createFile(pathToNonExistingFile);

            String directory = "data";
            String filename = "info.txt";

            Path dataDirectory = Paths.get(directory);
            Path dataFile = Paths.get(directory, filename);

            if (Files.notExists(dataDirectory)) {
                Files.createDirectories(dataDirectory);
            }

            if (! Files.exists(dataFile)) {
                Files.createFile(dataFile);
            }
            ArrayList<String> fruit = new ArrayList<>(Arrays.asList("apple", "pear", "orange","strawberries"));
            System.out.println(fruit);
            Files.write(dataFile,fruit); /// Will overwrite by default
            ArrayList <String> veggies = new ArrayList<>(Arrays.asList("tomato", "onion", "asparagus"));
            Files.write(dataFile,veggies, StandardOpenOption.APPEND);
            System.out.println(Files.readAllLines(dataFile));
            System.out.println("is fruit and array list? " + (fruit instanceof ArrayList));

            ///replace pear with banana
            ////find index first
            int replaceIndex = fruit.indexOf("pear");
            fruit.remove(replaceIndex);
            fruit.add(replaceIndex, "banana");
            Files.write(dataFile,fruit);
            System.out.println(fruit);







        }catch (IOException e){
            System.out.println("OOPS  something went wrong, File not created, please refer to the message below for reference");
            e.printStackTrace();
        }


    }

}
