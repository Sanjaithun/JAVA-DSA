public class reversenum {
    

    int reverse(int val){

        int res = 0;

        while(val > 0){

            int temp = val % 10;
            res = res * 10+ temp;
            val = val / 10;
        }
        return res;

    }
}
