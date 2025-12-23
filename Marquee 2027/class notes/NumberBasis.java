
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

    void ArmstrongNumber(int val){

        int digit = String.valueOf(val).length();
        int sum = 0;
        int valcheck = val;
        

        while(val>0){

            int dig = val % 10;
            sum = sum + (int)Math.pow(dig,digit);
            val = val / 10;
        }
        System.out.println(sum == valcheck ? "Arm":"Not Arm");


    }

    void primeFactorization(int n){
    for(int i = 2; i * i <= n; i++){
        while(n % i == 0){
            System.out.print(i + " ");
            n /= i;
        }
    }
    if(n > 1)  // remaining prime
        System.out.print(n);
}

    
    



}

