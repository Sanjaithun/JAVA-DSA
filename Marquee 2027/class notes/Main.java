public class Main {
    public static void main(String[] args) {
       
        NumberBasis obj = new NumberBasis();
        int val = 153;
        obj.ArmstrongNumber(val);


    }
}







































/*
class Main {
    public static void main(String[] args) 
    {
        // int a[],b[],c[];
        // int[] a,b,c;
        int[] a= {1,2,1,3,2,2};
        int c[] = new int[6];
        for(int i = 0; i<a.length;i++)
        {
            c[a[i]]++;
        }
        int max = 0;
        for(int i = 0; i<c.length; i++)
        {
            if(max<c[i]) max = c[i];
        }
        // for(int m = max; m>0; m--) // 3
        // {
        for(int i = 1;i <c.length; i++)
        // for(int i = c.length-1; i>=0; i--)
        {
            // for(int k = c[i]; (c[i]&1)==1 && k>0; k--)
            if(c[i]==0)
            {
                System.out.print(i+ " ");
                // break;                
            }
        // }
        }
    }
}
// unique - c[i] == 1 
// duplicate - c[i]>1
// print without duplicates - c[i]>0
// sort based on ascending with repeating - c[i]>0
// maximum element - traverse in reverse order, include break
// minimum element - traverse in forward order, include break
*/

/*
 Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 2 number for the limits");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int max = (a>b)? a : b;
        int min = (a<b)? a : b;
        System.out.println("Enter the number of elements in the array");
        int counts = scanner.nextInt();
        int count = 0;
        System.out.println("Enter the elements of the array");
        int array[] = new int[counts];
        for (int i = 0; i < counts; i++) {
            array[i] = scanner.nextInt();
            if (array[i] >= min && array[i] <= max) {
                count++;
            }
        }

        int ValuesInRange[] = new int[count];
        int index = 0;

        for(int i: array){
            if(i >= min && i <= max){
                ValuesInRange[index++] = i;
            }
        }

        // for(int i = 0;i < ValuesInRange.length;i++){
        //     for(int j = 0;j<ValuesInRange.length - i - 1;j++){
        //         if(ValuesInRange[j] > ValuesInRange[j+1]){
        //             int temp = ValuesInRange[j];
        //             ValuesInRange[j] = ValuesInRange[j+1];
        //             ValuesInRange[j+1] = temp;
        //         }
        //     }
        // }

        Collections.sort(ValuesInRange);
        index = 0;
        for(int i = 0;i<array.length;i++){
            if(array[i] >= min && array[i] <= max){
                array[i] = ValuesInRange[index++];
                System.out.print(array[i]  +"  ");
            }
            else{
            System.out.print(array[i]  +"  ");
            }
        }

*/


/* 
 int a = 10;
        int b = 1;
        String[] checkEqual = {"Equal","notEqual"};
        int check = a - b;
        System.out.println(checkEqual[check & 0]);
*/