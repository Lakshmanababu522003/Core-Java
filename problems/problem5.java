import java.util.Arrays;


public class problem5 {

    public static void main(String[] args) {
        
        int arr[] = new int[] {0,0};

        int count = 0;

        int uni[] = new int [arr.length];

        Arrays.sort(arr);

    System.out.println(Arrays.toString(arr));

    for(int i=0;i<arr.length-1;i++){

        if(arr[i] != arr[i+1]){

            uni[count++] = arr[i];
 
        }
        else{
            arr[i+1] = 0;
        }
    }



   
  

    System.out.println(Arrays.toString(uni));
    }
    
}

//output

// [1, 2, 2, 3, 4, 8, 8]
//[1, 0, 3, 4, 0, 0, 0]
