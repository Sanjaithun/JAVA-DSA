public class NumberBasis {
    
    
    void PositiveOrNegative(int num){

        String[] check = {"Zero","Positive","Negative"};
        int checkval = (num >> 31) | (-num >> 31);
        System.out.println(check[checkval+1]);


    }

    void RemoveTrailingZeros(int num){

        int count = 0;

        while(num > 0){
            num = num / 5;
            count = count + num;
        }
        System.out.println(count);

    }

    void endWithnine(int val){

        int res = (val / 9 ) + val;
        System.out.println("Value is "+val + " The replace val is :"+res);

    }

    void containsNine(int val){
        int num = val;
        while(val > 0){
            val = val / 9;
        }

    }


    




}

