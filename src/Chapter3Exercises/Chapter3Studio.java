package Chapter3Exercises;

import java.util.Map;
import java.util.HashMap;

public class Chapter3Studio {
    public static void main(String[] args) {
        //HashMap<String, Integer> characters = new HashMap<>();
        //input String
        String hiddenFigures = ("If the product of two terms is zero then common sense says at least" +
                "one of the two terms has to be zero to start with. So if you move all the terms over to one side, " +
                "you can put the quadratics into a form that can be factored allowing that side of the equation" +
                "to equal to zero. Once you've done that, it's pretty straightforward from there.");
        int startingValue = 1;

        //Creating a hashmap to store character as a key and occurrence as a value
        Map<Character, Integer> charCount = new HashMap<>();

        char[] charArray = hiddenFigures.toCharArray();
        // iterate each character from characterArray
        for (Character eachChar : charArray) {
            //condition is true if the character is already present in the map
            if (charCount.containsKey(eachChar)) {
                //increment the character occurrence in the map
                //Hashmap doesn't allow duplicate keys so it increments the value alone
                charCount.put(eachChar, charCount.get(eachChar) + 1);
            } else {
                // put the new character in the map with starting value as 1
                charCount.put(eachChar, startingValue);
            }
        }
        for (Character inputChar : charCount.keySet()) {
            //search for value using character
            Integer count = charCount.get(inputChar);
            // print each character and its occurrence
            System.out.println(inputChar + ": " + count);

        }
    }
}

