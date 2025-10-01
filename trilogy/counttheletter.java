public class counttheletter {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        String str = "aaaaaaaaaabbbbbccccccddddddddddeeeeffffggggggggghhhhhiiiiijjjkkllllmmmmnnnnnooooooppppppqqrrrrrsssstttttuuuuvvvwwxxxyyyzzzz";
        int count = 0;
        for(int i = 1;i < str.length();i++){
            if(str.charAt(i) == str.charAt(i-1)){
                count = count + 1;
            }
            else{
                count = count + 1;
                result.append(str.charAt(i-1));
                result.append(count);
                count = 0;
            }
        }
        System.out.println(result);
    }
}
