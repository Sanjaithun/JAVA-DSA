public class ValidAnagram {
    static void main() {
        String str1 = "thunsanjai";
        String str2 = "sanjaithun";
        int len1 = str1.length();
        int len2 = str2.length();
        int flag = 0;

        int[] check = new int[26];

        if(len2 != len1){
            System.out.println("This is not valid Anagram");
        } else  {
            for(char ch : str1.toCharArray()){
                check[ch - 'a']++;
            }
            for(char ch : str2.toCharArray()){
                check[ch - 'a']--;
            }
            for(int i = 0;i<26;i++){
                if(check[i] == 0) continue;
                else{
                    System.out.println("This is not anagram");
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) System.out.println("This is valid anagram");

        }
    }
}
