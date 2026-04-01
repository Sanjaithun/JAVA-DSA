import java.util.*;

public class Sorting{
	public static void main(String[] args){
		Scanner kbrd = new Scanner(System.in);
		Random rand = new Random();
		//length of the given array
		System.out.println();
		System.out.println();
		System.out.print("Enter the Length of the Array : ");
		int len = kbrd.nextInt();
		int[] array = new int[len];
		//random elements for the arrays in integers
		for(int i = 0; i<len;i++){
			array[i] = (rand.nextInt()) / 100000;
			if(array[i] < 0){
				array[i] = array[i] * -1;
			}
		}
		
		int[] bubblearray = Arrays.copyOf(array , len);
		int[] selectionarray = Arrays.copyOf(array , len);
		// call bubble sort
		double startbubble = System.currentTimeMillis();
		bubbleSort(bubblearray , len);
		double endbubble = System.currentTimeMillis();
		double bubbletime = (endbubble - startbubble) / 1000.0;
		System.out.println();
		System.out.println();
		System.out.println(" The Bubble Sorted Array is : \n\n "+ Arrays.toString(bubblearray));
		System.out.println();
		System.out.println();
		System.out.printf(" Excution time for Bubble Sort : %.4f %s" , bubbletime , ".s");
		System.out.println();
		System.out.println();
 		System.out.println("|----------------------------------------------------------------------------------------------------------------------------------------------------------|");
		//call Selection Sort
		
		double startselection = System.currentTimeMillis();
		SelectionSort(selectionarray , len);
		double endselection = System.currentTimeMillis();
		double selectiontime = (endselection - startselection) / 1000.0;
 		System.out.println();
		System.out.println(" The Selection Sorted Array is : \n\n"+ Arrays.toString(selectionarray));
		System.out.println();
		System.out.println();
		System.out.printf(" Excution time for Selection Sort : %.4f %s" , selectiontime , ".s");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("|----------------------------------------------------------------------------------------------------------------------------------------------------------|");
	}
	
	//bubble sort
	public static void bubbleSort(int[] arr,int len){
		for(int i = 0; i < len ;i++){
			boolean flag = false;
			for(int j = 0;j < len - i - 1 ;j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					flag = true;
				}
			}
			if(!flag) break;
		}
 		
	}
	//selection sort
	public static void SelectionSort(int[] arr , int len){
		
		
		for(int i = 0;i<len ;i++){
			int mini = Integer.MAX_VALUE;
			int index = -1;
			for(int j = i;j<len;j++){
				if(arr[j] < mini){
					mini = Math.min(mini , arr[j]);
					index = j;
				}
			}
			int temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;
		}
 	}
	 
}