
import java.util.*;


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

    void patterndouble(int n){
        int temp = n;
        for(int i = 0;i<temp;i++){

            System.out.println((n+"").repeat(n) + " ".repeat(i*2) + (n+"").repeat(n));
            n--;

        }

        /*
999999999999999999
88888888  88888888
7777777    7777777
666666      666666
55555        55555
4444          4444
333            333
22              22
1                1
        */

    }


    void reversearray(Integer[] array){

        Collections.reverse(Arrays.asList(array));
        System.out.println(Arrays.asList(array));

    }
  
    void hashmapiung(int[] array){

        HashMap <Integer , Integer> map = new HashMap<>();
        int index = 0;
        for(int i:array){

            map.put(index++,i);

        }

        System.out.println(map.get(0));
        System.out.println(map.get(2));

    }
    void frequentcy(int[] array){

        HashMap <Integer,Integer> map = new HashMap<>();

        int count = 0;

        for(int i:array){

            map.put(i,map.getOrDefault(i, 0)+1);
        }
            System.out.println(map);

    }
    
    



}

