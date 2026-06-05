public class MaximumSubArray {
    static void main() {
        int[] array = {-2,1,-3,4,-1,2,1,-5,4};
        int maxi = 0;
        int sum = -2;
        for(int i = 1;i<array.length;i++){
            sum = Math.max(array[i],sum + array[i]);
            maxi = Math.max(sum , maxi);
        }
        System.out.println("The Maximum Subarray : " + maxi);
    }
}
