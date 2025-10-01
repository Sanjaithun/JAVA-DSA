class HashToStart {
    public static void main(String[] args) {
        StringBuilder hash = new StringBuilder();
        StringBuilder NonHash = new StringBuilder();
        StringBuilder result = new StringBuilder();
        String str = "hello#####world";
        for(int i = 0;i < str.length();i++){

            if(str.charAt(i) == '#'){
                hash.append(str.charAt(i));
            }
            else{
                NonHash.append(str.charAt(i));
            }

        }
        result.append(hash);
        result.append(NonHash);
        System.out.println(result);
    }
}