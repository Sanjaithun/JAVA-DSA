public class secongLargest {
    public static void main(String[] args) {
        int[] arr= {16,44,95,58,3};
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int k: arr){
            if(k > max1){
                max2 = max1;
                max1 = k;
            }
            if(k > max2 && k < max1){
                max2 = k;
            }
        }

        System.out.println(max2);
    }
}
