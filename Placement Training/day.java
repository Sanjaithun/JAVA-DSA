public class day {
    public static void main(String[] args) {
        rice();
    }
    static void numtobit(int a){
        String temp = "";
        while(a != 0){
            if(a % 2 == 0) temp = "0" + temp;
            else temp = "1" + temp;
            a = a / 2;
        }
        System.out.println(temp);
      
    }
    static void bit(){
        int a = 3;
        int b = 4;
        System.out.println("Bitwise And : " + (a & b));
        System.out.println("Bitwise OR : " + (a | b));
        System.out.println("Bitwise XOR : "+(a ^ b));
        System.out.println("Bitwise Right : "+(a >> b));
        System.out.println("Bitwise left : "+(a << b));
    }
    static void complement(){
        int a = 8;
        System.out.println(a);
    }

    static int fact(int a){
        if(a < 1) return 1;
        return a * fact(a-1);
    }

    static void rice(){
        int count = 0;
        int right = 25000;
        int left = 1;
        while(left <= 1000){
            left = left + left;
            count++;
            System.out.println(left-1);
             
        }
        System.out.println("Total times to compare : "+count);
    }
    

}
