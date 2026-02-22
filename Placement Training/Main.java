public class Main {
    public static void main(String[] args) {
        String a = "abcde";
        String b = "qrs";
        System.out.println(MergeStrings(a, b));
    }
  // Palindrom integer
    public static boolean  palindrome(int a){
        int k = 0;
        int check = a;
        while(a > 0){
            k = (k * 10) + a % 10;
            a = a / 10;
        }
        if(check == k) return true;
        return false;
    }

    public static String MergeStrings(String a , String b){
        String result = "";
        int i = a.length();
        int j = b.length();
        int k = 0;
        int l = 0;
        while(i > k && j > l){
            result = result + a.charAt(k++);
            result = result + b.charAt(l++);
        }
        while(i > k) result = result + a.charAt(k++);
        while(j > l) result = result + b.charAt(l++);
        return result;
    }

}
