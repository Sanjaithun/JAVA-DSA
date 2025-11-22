public class NumberBasis {
    
    void GreatesOfNumber(int a, int b){

        int res = (a - b) >> 31;
        
        System.out.println(res);

    }

    void SingleCharacter(char[] array){

        int checking[] = new int[26];

        for(int i = 0 ; i < array.length; i++ , checking[array[i] - 97]++);

        for(int i = 0 ; i < checking.length; i++){
            if(checking[i]==1)
            System.out.print((char)(i+97));
        }


    }




}

