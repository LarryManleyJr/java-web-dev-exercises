package LoveMiles;

import java.util.Scanner;

public class Running {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven this month?");
        double miles = input.nextDouble();
        System.out.println("How much gas have you consumed this month (in gallons)?");
        double gallon = input.nextDouble();
        System.out.println("Your vehicle is driving about " + (miles/gallon) + " miles per gallon.");
    }
}
