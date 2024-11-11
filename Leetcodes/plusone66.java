import java.util.Arrays;

public class plusone66 {

    public static void main(String args[]){

        int[] digits = new int[] {9};

         ;

         System.out.println(Arrays.toString(plusone(digits)));
    }

    static int[] plusone(int[] digits){
        for(int i=digits.length-1;i>=0;i--){

            if(digits[i] < 9){
               digits[i]++;
               return digits;
            }
            
            digits[i] =0;
            
        }

        int n=digits.length;

        int arr[] = new int[n+1];

        arr[0] = 1;

        return arr;

        


    }
    
}
