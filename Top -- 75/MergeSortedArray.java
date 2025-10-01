// import java.util.Arrays; This for the brute force
public class MergeSortedArray {
    int[] checkMergeSortedArray(int[]arr1 ,int m, int[]arr2,int n){
        int Num1Pointer = m - 1;
        int Num2Pointer = n - 1;
        int TotalNum = m + n -1;
        while(Num1Pointer >= 0 && Num2Pointer >= 0){
            if(arr1[Num1Pointer] > arr2[Num2Pointer]){
                arr1[TotalNum] = arr1[Num1Pointer];
                Num1Pointer--;
            }
            else{
                arr1[TotalNum] = arr2[Num2Pointer];
                Num2Pointer--;
            }
            TotalNum--;
        }
        return arr1;
    }
}
