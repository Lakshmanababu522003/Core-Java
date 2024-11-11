import java.util.Arrays;

public class problem32 {
    public static void main(String zoho[]){

        int arr[] ={1 ,2, 3, 5, 4, 7, 10};
        int n=0;

        for(int i=0;i<arr.length;i++){

            if(arr[i] % 2 !=0){
                arr[i] *=-1;
                n++;
            }
        }

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        for(int i=0;i<n;i++){
            arr[i] *=-1;
        }

        System.out.println(Arrays.toString(arr));

    }
}


//[7, 5, 3, 1, 2, 4, 10]
