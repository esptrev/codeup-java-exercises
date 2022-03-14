package collections_lec;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Collections {
    public static void main(String[] args) {
        ArrayList <String> words = new ArrayList ();
        words.add("the");
        words.add("brave");
        words.add("the");
        words.add("quick");
        words.add("the");
        words.add("dumb");

        words.add("the");

        System.out.println(words.size());
        System.out.println(words);

        words.remove("quick");

        System.out.println(words.size());
        System.out.println(words);

        System.out.println(words.get(4));

        for (String word : words) {
            System.out.println(word);
        }
        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i));
        }

        System.out.println(words.indexOf("dumb"));
        System.out.println(words.indexOf("lazy")); /// NOT IN LIST
        words.add("dumb");
        System.out.println(words);
        System.out.println(words.lastIndexOf("dumb"));

        /// is fox in array list ///
        System.out.println(words.indexOf("fox") > -1);
        System.out.println(words.contains("fox"));

        System.out.println("words empty? " + words.isEmpty());
        words.clear();
        System.out.println("words empty? " + words.isEmpty());

        /// REMOVES ALL INSTANCES OF THE
        words.removeAll(List.of("the"));

        ///-------------------------------///

        //// HASHMAPS ARE KEY:VALUE PAIRS ////

        HashMap<String, Integer> favoriteNumbers = new HashMap<>();
        favoriteNumbers.put("Kristin",11);
        favoriteNumbers.put("Trevor",88);
        favoriteNumbers.put("Korbin",10);
        favoriteNumbers.put("Berry",23);
        favoriteNumbers.put("Riley",13);

        System.out.println(favoriteNumbers);
        System.out.println(favoriteNumbers.get("Korbin"));
        System.out.println(favoriteNumbers.get("korbin")); ///null

        System.out.println(favoriteNumbers.getOrDefault("korbin",0));

        System.out.println(favoriteNumbers.containsKey("korbin"));
        System.out.println(favoriteNumbers.containsValue(100));

        favoriteNumbers.put("Riley",13); ///cannot have duplicates
        System.out.println(favoriteNumbers);

        favoriteNumbers.replace("Kristin",11,21);
        System.out.println(favoriteNumbers);

        favoriteNumbers.remove("Riley");
        System.out.println(favoriteNumbers);

        /// TRY NOT TO ITERATE OVER HASHMAP ///

        Set <String> keys = favoriteNumbers.keySet();
        for (String key: keys) {
            Object aValue = favoriteNumbers.get(key);
            System.out.println(key + " : " + aValue);
        }

    }
}
