

public class almostsame {


    static StringBuilder samechecker(String s, int k){
        int count = 0;
        StringBuilder strs = new StringBuilder();


        int len = s.length();
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                count = count + 1;
                strs.append(s.substring(i,j+1));
                strs.append("  ");
                
            }
        }
        strs.append(count);
        return strs;
    }

    public static void main(String[] args) {
        
        String str = "abaabc";
        int index = 1;
        StringBuilder result = samechecker(str,index);
        System.out.println("The Result of the count is: " + result);

    }
    
}
