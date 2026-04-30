 import java.util.Arrays;

public class ROTATEARRAY {
    static void main() {
        int[] array = {1,2,3,4,5,6,7};
        int len = array.length - 1;
        int rotate = 3;
        reverse(array,rotate+1,len);
        reverse(array,0,rotate);
        reverse(array,0,len);
        System.out.println(Arrays.toString(array));
    }

    static void reverse(int [] array,int i ,int j){
        int temp;
        while(i<j){
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        return;
    }
}
