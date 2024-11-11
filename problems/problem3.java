import java.util.Arrays;

public class problem3 {

    public static void main(String zoho[]){

        int arr1[] = new int[] {4,2,19};

        int arr2[] = new int[] {2,18,12};

        problem3 obj = new problem3();

        obj.mergeSort(arr1,arr2);
        
    }

     void mergeSort(int[] arr1, int[] arr2){

        int m = (arr1.length + arr2.length);
        
        int k=0;

        int arr3[] = new int [m] ;

        for(int i =0;i<arr1.length;i++){
            arr3[k++] = arr1[i];
        }

        for(int i =0;i<arr2.length;i++){
            arr3[k++] = arr2[i];
        }

    //     for(int j=0;j<arr3.length;j++){
    //     for(int i=1;i < arr3.length;i++){

    //         if(arr3[i] < arr3[i-1]){

    //             int temp = arr3[i-1];

    //             arr3[i-1] = arr3[i];

    //             arr3[i] =temp;
    //         }
    //     }
    // }

    Arrays.sort(arr3);

        

        System.out.println(Arrays.toString(arr3));

        
    }
    
}

// output [2, 2, 4, 12, 18, 19]
