import java.util.Arrays;

public class MERGESORTEDARRAY {
    static void main() {
    int[] array1 = {1,2,3,0,0,0};
    int[] array2 = {2,5,6};
    int array1len = 3;
    int array2len = 3;
    mergesorted(array1 , array2 , array1len , array2len);
        System.out.println(Arrays.toString(array1));
    }
    static void mergesorted(int[] array1 , int[] array2,int array1len , int array2len){
        int i = array1len - 1;
        int j = array2len - 1;
        int k = array1len + array2len - 1;

        while(i >= 0 && j >= 0){
            if(array1[i] > array2[j]){
                array1[k] = array1[i];
                k--;
                i--;
            }
            else{
                array1[k] = array2[j];
                j--;
                k--;
            }
        }

    }

}
