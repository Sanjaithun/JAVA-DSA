public class prac {
    public static void main(String[] args) {
        int a = 98765; 
        int check = a;
        int reverse = 0;
         
          while(a > 0)
          {
            int temp = a % 10; 
            reverse = (reverse * 10) + temp;
            a = a / 10; 
          }
          
          System.out.println("Sum of the digit : " + reverse);
          if(check == reverse) System.out.println("Palindrom");
        
     }
}
// 56789



// Temp : 5
// a : 98765
// Temp : 6
// a : 9876
// Temp : 7
// a : 987
// Temp : 8
// a : 98
// Temp : 9
// a : 9
// --> 9+8+7+6+5 = 35
// Sum of the digit : 35


