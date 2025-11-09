import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        
        ArraysMethods obj = new ArraysMethods();
        int[] array1 = {1,2,3,0,0,0};
        int[] array2 = {2,5,6};
        int n = 3;
        int m = array2.length;
        System.out.println(Arrays.toString(obj.mergeArray(array1, array2, n, m)));
    }


}
