public class Searching{
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,7,8,9,13,5,100,39,16};
		int target = 39;
		binarySearch(arr , target);
	}
	
	static void binarySearch(int[] arr , int target){
		int start = 0;
		int end = arr.length - 1;
		
		
		while(start < end){
			int mid = (end + start) / 2;
			if(arr[mid] == target)
			{
				System.out.printf("The element %d in %d %n", target , mid + 1);
				return;
			}
			
			else if(arr[mid] < target){
				start = mid + 1;
			}
			else{
				end = mid + 1;
			}
				
		}
		System.out.println("The target is not found");
	}
}