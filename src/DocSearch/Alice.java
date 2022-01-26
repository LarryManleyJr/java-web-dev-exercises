package DocSearch;

import java.util.Locale;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String wonderLand =("Alice was beginning to get very tired of sitting by her " +
                "sister on the bank, and of having nothing to do: once or twice" +
                "she had peeped into the book her sister was reading, but it had no " +
                "pictures or conversations in it, 'and what is the use of a book,'" +
                "thought Alice 'without pictures or conversation?'");
        System.out.println(wonderLand);
        System.out.println("Search for a term within the quote");
        String name = input.nextLine();
        String wonderLandTwo = wonderLand.toLowerCase();
        String searchIt = name.toLowerCase();
        System.out.println(wonderLandTwo.contains(searchIt));
        int index =(wonderLandTwo.indexOf(searchIt));
        System.out.println("The index of " + searchIt + " is " + index + " .");
        int length = (searchIt.length());
        System.out.println("The length of " + searchIt + " is " + length + " .");
    }
}
