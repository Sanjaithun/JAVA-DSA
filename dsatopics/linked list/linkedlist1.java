import java.util.*;

public class linkedlist1 {
    
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the length of the linkedlist: ");
        int len = obj.nextInt();

        LinkedList<Integer> list = new LinkedList<>();

        for(int i = 0;i<len;i++){

            int val = obj.nextInt();
            
            list.add(val);

        }
        System.out.println(list.get( len - 1));
        System.out.println(list);



    }


}
