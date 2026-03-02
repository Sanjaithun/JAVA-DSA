import java.util.*;

public class Stringpractice {
    public static void main(String[] args) {
        String str = "king of the World is Bhuvi";
        System.out.println(reverseArrayString(str));
    }
    static String reverse(String str){
        char[] res = str.toCharArray();
        int i = 0, j = str.length() - 1;

        while(i<j){
            char temp = res[i];
            res[i] = res[j];
            res[j] = temp;
            i++;j--;
        }
        // System.out.println("Original String : "+str+" Revers String is : "+ new String(res));
        return new String(res);

    }
    static boolean  palindromLine(String str){
        char[] res = str.toLowerCase().replaceAll("[^a-z]", "").toCharArray();
        System.out.println(res);
        String revers = reverse(new String(res));
        return revers.equals(new String(res));
    }

    static int FirstNonRepatingChar(String str){
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(char i : str.toCharArray()){
            map.put(i,map.getOrDefault(i, 0)+1);
        }
        for(int i = 0;i<str.length();i++){
            if(map.get(str.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
        
    }
    static String reverseArrayString(String str){
         int i = str.length()-1;
         String res = "";
         String temp = "";
         while(i >= 0){
            if(str.charAt(i) == ' '){
                res = res + " " + temp;
                temp = "";
            }
            else{
                temp = str.charAt(i) + temp;
                
            }
            i--;
         }
         
         return res + " " + temp ;
    }


}
