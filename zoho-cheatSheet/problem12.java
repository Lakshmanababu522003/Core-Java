import java.util.*;

public class problem12 {

    public static void main(String zoho[]){

        int num = 43;

        int num1 = num ;

        int temp=0,rev =0;

        while(num1 > 0){
            temp = num1% 10;

            rev= rev*10+temp;

            num1=num1/10;
        }

       int[] arr = new int[] {num , rev};

       int flag =0;

       System.out.println(Arrays.toString(arr));

       for(int i=0;i<arr.length;i++){

            int j=2;
            

            while(arr[i] > j){
                if(arr[i] % j == 0){
                    flag=1;
                }
                j++;
            }

       }

       if(flag == 0){
        System.out.println(true);
       }
       else{
        System.out.println(false);
       }
    }
    
}
