import java.util.Arrays;
import java.util.Collections;
import java.io.*;
import java.util.*;

public class problem3 {
    public static void main(String zoho[]){

        int[] arr = new int[] {0, 4, 5, 3, 7, 2, 1};

        int k=0;
        int j =0;
        int n=0;
        int m=0;

        int [] odd = new int [arr.length];

        int [] even = new int [arr.length];

        for(int i=0;i<arr.length;i++){

            if(arr[i] % 2 == 0){
                even[k++] = arr[i];
                m++;
            }
            else{
                odd[j++] = arr[i];
                n++;
            }
        }

        // Arrays.sort(even);
        // Arrays.sort(odd, Collections.reverseOrder());

        //[1,3,5,7,0,0,0]
        for(int l=0;l<n;l++){
        for(int i=0;i<n-1;i++){
            if(odd[i] < odd[i+1]){
                int temp = odd[i];
                odd[i] = odd[i+1];
                odd[i+1] = temp;
            }
        }
    }

    for(int i=0;i <n;i++){
        System.out.print(odd[i]+ " ");
    }

    System.out.println();
for(int l=0;l<m-1;l++){
    for(int i=0;i <m-1;i++){
        if(even[i] > even[i+1]){
            int temp = even[i];
            even[i] = even[i+1];
            even[i+1] = temp;
        }
        
    }
}

    for(int i=0;i <m;i++){
        System.out.print(even[i]+ " ");
        
    }

    int z=0;

    for(int i=0;i < n;i++){
        arr[z++] = odd[i];
    }

    for(int i=0;i < m;i++){
        arr[z++] = even[i];
    }

    System.out.println();

        System.out.println(Arrays.toString(arr));

    }
}
