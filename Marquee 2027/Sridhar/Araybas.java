import java.util.*;

public class Araybas{
	public static void main(String[] args){

		int[] arr1 = {1,2,3,4,5};  //Sum [0, 6, 15, 16, 18, 22]
		int[] arr2 = {5,8,9,1,3};

		int len1 = arr1.length;
		int len2 = arr2.length;

		System.out.println("Suffixsum  "+Arrays.toString(suffixsum(arr1,len1)));
		System.out.println("Prefixsum  "+Arrays.toString(prefixsum(arr1,len1)));
		System.out.println("Larger elements in suffix "+Arrays.toString(largerinright(arr2,len2)));
		System.out.println("Larger elements in prefix "+Arrays.toString(largerinleft(arr2,len2)));
		System.out.println("Smaller elements in suffix "+Arrays.toString(Smallerinright(arr2,len2)));
		System.out.println("Smaller elements in prefix "+Arrays.toString(Smallerinleft(arr2,len2)));
		System.out.println("Minimum Element in an array : " + minimumInArray(arr1 , len1));
		int[] Reverse = {1,2,3,4,5,6};
		reverseAnArray(Reverse , Reverse.length);
		System.out.println("Reverse an Given Array : "+Arrays.toString(Reverse));
		
	}
	
	static void reverseAnArray(int[] arr,int len){
		int i = 0;
		int j = len - 1;
		while(i < j){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		return;
		
	}
	
	static int minimumInArray(int[] arr,int len){
		int mini = Integer.MAX_VALUE;
		for(int i = 0;i<len;i++){
			mini = Math.min(mini , arr[i]);
		}
		return mini;
	}
	static int[] Smallerinright(int[] arr,int len){
		int[] Smaller = new int[len];
		int mini = arr[len - 1];
		for(int i = len - 2;i>=0;i--){
			Smaller[i] = mini;
			mini = Math.min(mini , arr[i]);
		}
		return Smaller;
	}
	
	static int[] Smallerinleft(int[] arr,int len){
		int[] Smaller = new int[len];
		int mini = arr[0];
		for(int i = 0;i<len;i++){
			Smaller[i] = mini;
			mini = Math.min(mini , arr[i]);
		}
		return Smaller;
	}
	static int[] largerinright(int[] arr,int len){
		int[] larger = new int[len];
		int maxi = 0;
		for(int i = len - 1;i>=0;i--){
			larger[i] = maxi;
			maxi = Math.max(maxi , arr[i]);
		}
		return larger;
	}
	
	static int[] largerinleft(int[] arr,int len){
		int[] larger = new int[len];
		int maxi = 0;
		for(int i = 0;i<len;i++){
			larger[i] = maxi;
			maxi = Math.max(maxi , arr[i]);
		}
		return larger;
	}
	
	static int[] suffixsum(int[] arr , int len){
		int[] suffix = new int[len];
		int j = len - 1;
		int sum = 0;
		for(int i = len - 1;i>=0;i--){
			suffix[j--] = sum;
			sum = sum + arr[i];
		}
		return suffix;
	}
	
	static int[] prefixsum(int[] arr , int len){
		int[] suffix = new int[len];
		int j = 0;
		int sum = 0;
		for(int i = 0;i<len;i++){
			suffix[j++] = sum;
			sum = sum + arr[i];
		}
		return suffix;
	}
	
}




/*
int sum = 0;
		for(int i : arr){
		
			sum = sum + i;
		}
		int[] arr2 = new int[len];
		for(int i = 0;i<len;i++){
			arr2[i] = sum - arr[i];
		}
//System.out.println("Sum "+Arrays.toString(arr2));
		 
		int[] arr3 = new int[len];
		int sum2 = 0;
		
		for(int i = 0;i<len;i++){
			sum2 = arr[i] + sum2;
			arr3[i] = sum2 - arr[i];
		}
		System.out.println("Sum "+Arrays.toString(arr3));
		
		*/
		