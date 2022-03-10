package movies;

import java.util.Scanner;

public class MoviesApplication {
    static Scanner movieScanner = new Scanner(System.in);

    public static void main(String[] args) {
        findMovie();
    }


    public static void findMovie() {
        Movie[] newMovies = MoviesArray.findAll();
        System.out.println("What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category");

        int userChoice = movieScanner.nextInt();

        if (userChoice == 0) {
            System.exit(0);
        } else if (userChoice == 1) {
            for (Movie movie : newMovies) {
                System.out.println(movie.getName());
            }
        } else if (userChoice == 2) {
            for (Movie movie : newMovies) {
                if (movie.getCategory().equals("animated"))
                    System.out.println(movie.getName());
            }
        } else if (userChoice == 3) {
            for (Movie movie : newMovies) {
                if (movie.getCategory().equals("drama"))
                    System.out.println(movie.getName());
            }
        } else if (userChoice == 4) {
            for (Movie movie : newMovies) {
                if (movie.getCategory().equals("horror"))
                    System.out.println(movie.getName());
            }
        } else if (userChoice == 5) {
            for (Movie movie : newMovies) {
                if (movie.getCategory().equals("scifi"))
                    System.out.println(movie.getName());
            }

        }
        findMovie();
    }
}
