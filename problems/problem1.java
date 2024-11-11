import java.util.Arrays;

public class problem1 {

    public static void main(String args[]){

        int[] arr = new int[] {2,5,7,34};
        
        for(int i=0;i <arr.length-1;i++){

            if(arr[i] < arr[i+1]){

                arr[i] = arr[i+1];

            }
            else{
                arr[i] = -1;
            }

        }

        if(arr[arr.length-1] == arr[arr.length-2]){
            arr[arr.length-1] = -1;
        }

        System.out.println(Arrays.toString(arr));
    }
    
}

//output

// [5, 7, 34, -1]
