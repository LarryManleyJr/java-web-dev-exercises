package Chapter3Exercises;

import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<Integer> numbs = new ArrayList<>();
        numbs.add(1);
        numbs.add(2);
        numbs.add(3);
        numbs.add(4);
        numbs.add(5);
        numbs.add(6);
        numbs.add(7);
        numbs.add(8);
        numbs.add(9);
        numbs.add(10);
        numbs.add(11);

        int sum = 0;
        for (int numb : numbs) {
            if (numb % 2 == 0) {
                sum = sum + numb;
            }
        }
            System.out.println(sum);
        }
}
