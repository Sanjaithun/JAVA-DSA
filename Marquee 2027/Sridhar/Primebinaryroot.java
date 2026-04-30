import java.util.*;

public class Primebinaryroot {
    

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = obj.nextInt();
        if(isprime(n)){
            System.out.println(Square(n));
        }
        else{
            System.out.println("Composite");
        }
    }

    static boolean isprime(int n){
        for(int i = 2;i*i<=n;i++){
            if(n%i == 0) return false;
        }
        return true;
    }

    static double Square(int n){
        n = n * 1000000;
        int i = 1000;
        int j = 9999;

        while(i<=j){
            int mid =( i+j)/2;
            if(mid * mid == n){
                return mid / 1000;
            }
            else if(mid * mid > n){
                j = mid + 1;
            }
            else if(mid * mid < n){
                i = mid + 1;
            }
            

            
        }
        return 0;
    }
}
