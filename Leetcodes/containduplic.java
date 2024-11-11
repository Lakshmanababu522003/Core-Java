// class containduplic{

//     public static void main(String[] args) {
        
//         int[] arr = new int[] {1,2,3,4};

//         for(int i=0;i<arr.length;i++){

//             for(int j=0;j<i; j++){

//                 if(arr[i] == arr[j]){
//                     System.out.println("true");
//                 }
//             }

            
//         }

//         System.out.println("false");
//     }
// }

//method2

import java.util.Arrays;

public class containduplic{

    public static void main(String[] args) {
        
        int[] nums = new int[] {1,2,3,1};

       Arrays.sort(nums);

        for(int i=1;i<nums.length;i++){

            if(nums[i-1] == nums[i]){
                System.out.println("true");
            }

        }

        System.out.println("false");
    }
}