import java.util.*;

public class Stringpractice {
    public static void main(String[] args) {
        String str = "ajithkumar";
        String str1 = "shalini";
        Flames(str, str1);
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

       static void Flames(String person_1, String person_2) {
        int count = 0;
        person_1 = person_1.toLowerCase();
        person_2 = person_2.toLowerCase();

        char[] p1 = person_1.toCharArray();
        char[] p2 = person_2.toCharArray();

        // 1. Correct Character Counting (Marking both as '0')
        for (int i = 0; i < p1.length; i++) {
            for (int j = 0; j < p2.length; j++) {
                if (p1[i] == p2[j] && p1[i] != '0') {
                    p1[i] = '0';
                    p2[j] = '0';
                    count++;
                    break;
                }
            }
        }

        int res = (p1.length - count) + (p2.length - count);

        // Special case: if res is 0
        if (res == 0) {
            System.out.println("The names are too similar to play FLAMES!");
            return;
        }

        // 2. The FLAMES elimination logic
        boolean[] flm = {true, true, true, true, true, true};
        int remaining = 6;
        int index = 0; // Pointer stays OUTSIDE the loop to remember position

        for (int i = 0; i < 5; i++) { // Eliminate 5 letters
            int temp = 0;
            while (temp < res) {
                if (flm[index]) {
                    temp++;
                }
                if (temp == res) {
                    flm[index] = false; // Eliminate this letter
                } else {
                    index = (index + 1) % 6; // Move to next in circle
                }
            }
            remaining--;
        }

        // 3. Find the final 'true' index
        int finalResult = 0;
        for (int i = 0; i < 6; i++) {
            if (flm[i]) {
                finalResult = i;
                break;
            }
        }

        // 4. Attractive Final Sentences
        System.out.println("--- Your Destiny ---");
        System.out.println();
         switch (finalResult) {
            case 0: // F
                System.out.println("FRIENDS: A bond that never fades and a heart that always stays.");
                System.out.println("You both share the kind of friendship that movies are made of!");
                break;
            case 1: // L
                System.out.println("LOVERS: Two souls with but a single thought, two hearts that beat as one.");
                System.out.println("Your chemistry is undeniable; a beautiful romance is written in your stars.");
                break;
            case 2: // A
                System.out.println("AFFECTION: A gentle warmth that fills the soul whenever you are near.");
                System.out.println("There is a deep, sweet fondness between you that makes life brighter.");
                break;
            case 3: // M
                System.out.println("MARRIAGE: A journey of a thousand miles beginning with a single promise.");
                System.out.println("A lifetime of shared dreams and morning coffees awaits you both.");
                break;
            case 4: // E
                System.out.println("ENEMIES: A thin line exists between love and hate, fueled by intense passion.");
                System.out.println("You might clash often, but it's only because your energies are so powerful!");
                break;
            case 5: // S
                System.out.println("SIBLINGS: A protective shield and a lifelong companion gifted by fate.");
                System.out.println("You share a deep-rooted connection that is as strong and pure as family.");
                break;
        }
    }
        

    }

    


