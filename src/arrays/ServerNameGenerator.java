package arrays;

public class ServerNameGenerator {

    public static void main(String[] args) {
        randomStringGen();
    }

    protected static void randomStringGen(){
        String [] nouns = new String[10];
        nouns[0] = "goat";
        nouns[1] = "surf-board";
        nouns[2] = "fish";
        nouns[3] = "car";
        nouns[4] = "house";
        nouns[5] = "beach";
        nouns[6] = "waves";
        nouns[7] = "boat";
        nouns[8] = "weapon";
        nouns[9] = "dragon";

        String [] adjectives = new String[10];
        adjectives[0] = "goofy";
        adjectives[1] = "hot";
        adjectives[2] = "creepy";
        adjectives[3] = "robust";
        adjectives[4] = "moody";
        adjectives[5] = "gorgeous";
        adjectives[6] = "distinct";
        adjectives[7] = "prickly";
        adjectives[8] = "bitter";
        adjectives[9] = "obnoxious";
        int randomNoun = (int) (Math.floor(Math.random() * (9) + 1));
        int randomAdj = (int) (Math.floor(Math.random() * (9) + 1));
        System.out.print(adjectives[randomAdj] + " " + nouns[randomNoun]);
    }
}
