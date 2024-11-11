import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class problem2 {

    public static void main(String zoho[]){

        int[] arr = new int[]{131, 11, 48};

        Set<Integer> set = new HashSet<>();

        int temp;


        for(int i=0;i < arr.length;i++){

            temp = arr[i];

            while(temp > 0){

                set.add(temp%10);

                temp = temp/10;


            }

        }

        int[] arr2 = new int[set.size()];
        int i=0;

        for(int num : set){

            arr2[i++] = num;
        }

        System.out.println(Arrays.toString(arr2));


    }
    
}

//output

//[1, 3, 4, 8]
