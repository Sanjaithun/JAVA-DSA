import java.util.*;

public class KeithNumber{
public static void main(String[] args){
	Scanner kbrd = new Scanner(System.in);
	int value = kbrd.nextInt();
	keithNum(value);
	}
public static void keithNum(int value){
	
	int copyval = value;
	int index = 0;
	int sum = 0;

	ArrayList<Integer> List = new ArrayList<>();

	 while(copyval != 0){
	 
	     int temp = copyval % 10;
	     sum += temp;
	     copyval /= 10;
	     List.add(temp);
	 }

	 Collections.reverse(List);
	 
		
	List.add(sum);
	
	while(List.get(List.size()-1) < value)
{
    
	int NextSum = List.get(List.size() - 1 ) * 2 - List.get(index); 
	System.out.println(NextSum);
	
	if(NextSum == value)
{
	System.out.println("The Given Number is KeithNumber");
	return;
}


	List.add(NextSum);
	index++;
}	
	System.out.println("The Given Number is not KeithNumber");
	return;
	
  
	}
}