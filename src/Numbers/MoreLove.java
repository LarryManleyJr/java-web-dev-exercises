package Numbers;

import java.util.Scanner;

public class MoreLove {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the triangle");
        double length = input.nextDouble();
        System.out.println("The length of the rectangle is " + length + " meters long.");
        System.out.println("What is the width of the triangle");
        double width = input.nextDouble();
        System.out.println("The width of the rectangle is " + width + " meters long");
        System.out.println("The area of the rectangle is " + (width * length));

    }
}
