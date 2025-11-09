import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        
        ArraysMethods obj = new ArraysMethods();
        int[] array = {0,0,1,2,3,4,4};
        
        int unique = obj.removedublicate(array);

        System.out.println(Arrays.toString(Arrays.copyOf(array, unique)));

    }


}


