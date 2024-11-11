public class problem2 {

    public static void main(String zoho[]){

        int arr[] = new int[] {1,2,4,1,18};

        int max = arr[0];

        for(int i=0;i < arr.length;i++){

            if(arr[i] > max ){
                max = arr[i];
            }
        }

        System.out.println(max);
    }
    
}

//output 18
