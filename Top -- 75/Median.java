import java.util.Arrays;

public class Median {
    double Medians(int[] array1, int[] array2){

        int n1 = array1.length;
        int n2 = array2.length;
        int[] mergedArray = new int[n1 + n2];
        System.arraycopy(array1, 0, mergedArray, 0, n1);
        System.arraycopy(array2, 0, mergedArray, n1, n2);
        Arrays.sort(mergedArray);

        if (mergedArray.length % 2 == 0) {
            return (mergedArray[mergedArray.length / 2 - 1] + mergedArray[mergedArray.length / 2]) / 2.0;
        } else {
            return mergedArray[mergedArray.length / 2];
        }
    }
}
