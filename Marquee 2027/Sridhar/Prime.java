import java.util.*;

public class Prime {
	public static void main(String[] args){
		Scanner kbrd = new Scanner(System.in);
		int length = kbrd.nextInt();
		int[] arr = new int[length];
		for(int i = 0;i<length;i++) 
			arr[i] = kbrd.nextInt();
		for(int Value : arr){
			
		if(checkPrime(Value) == true)
			System.out.printf("The Given Number %d is Prime",Value);
		else
			System.out.printf("The Given Number %d is not Prime",Value);
		System.out.println();
		}
		kbrd.close();

	}
	static boolean checkPrime(int Value){
		if(Value <= 1) return false;
		if(Value <= 3) return true;
		if(Value % 2 == 0 || Value % 3 == 0) return false;
		for(int i = 5;i*i <= Value;i+=6){
			if(Value % i == 0 || Value % (i + 2) == 0){
				return false;
			}
		}
		return true;
		
	}
}