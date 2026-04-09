 
import java.util.Random;

public class Helper {
    // Generates a random array based on user input size
    public static int[] generateRandom(int length) {
        Random rand = new Random();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = rand.nextInt(10000); 
        }
        return arr;
    }

    // Creates a copy so each algorithm sorts the exact same numbers
    public static int[] duplicate(int[] original) {
        int[] copy = new int[original.length];
        for(int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }
        return copy;
    }
}