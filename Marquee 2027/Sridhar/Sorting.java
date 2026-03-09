import java.util.*;

public class Sorting{
	public static void main(String[] args){
		int[] arr = {3,1,7,21,7,6,3,10,87,4,9,20};
		int len = arr.length - 1;
		bubbleSort(arr , len);
		System.out.println("The Sorted Array is : "+ Arrays.toString(arr));
	}
	public static void bubbleSort(int[] arr,int len){
		for(int i = 0; i < len ;i++){
			for(int j = 0;j < len - i;j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.currentTimeMillis();
	}
	
	public static void InsertionSort(int[] arr,int len){
		
	}
}