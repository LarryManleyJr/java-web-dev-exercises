package Chapter3Exercises;

public class Array2 {
    public static void main(String[] args) {
        String splitIt = ("I would not, could not, in a box. I would not, could not with a fox." +
                "I will not eat them in a house. I will not eat them with a mouse.");
        String[] splits = splitIt.split("\\.");
        //This Splits the String on the whitespaces
        for (String splits2 : splits) {
            System.out.println(splits2);
        }

    }
}