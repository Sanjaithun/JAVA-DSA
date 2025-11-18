public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 1;
        String[] checkEqual = {"Equal","notEqual"};
        int check = a - b;
        System.out.println(checkEqual[check & 0]);
    }
}