import java.util.Arrays;

public class problem7 {
    public static void main(String zoho[]){

        int arr[] [] = {{1,2,3},{1,2,3},{1,2,3}};
        int crr[] [] = {{1,2,3},{1,2,3},{1,2,3}};


        int brr[] [] = new int[3][3];

        for(int i=0;i < arr.length;i++){

            for(int j=0;j<arr[i].length;j++){
                // System.out.print(arr[i][j]+" ");

                brr[i][j] = arr[i][j] + crr[i][j]; 
               
            }
            
        }

        for(int i=0;i<brr.length;i++ ){
            for(int j=0;j<brr[i].length;j++){
                System.out.print(brr[i][j]+ " ");
            }
            System.out.println();
        }

    }
}

// 2 4 6
// 2 4 6
// 2 4 6
