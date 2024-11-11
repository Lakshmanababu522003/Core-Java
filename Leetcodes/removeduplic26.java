import java.util.Arrays;

public class removeduplic26 {

    public static void main(String args[]){

        int[] nums = new int[] {0,0,1,1,1,2,2,3,3,4};

        int temp =0;

        for(int i=1;i<nums.length;i++){

         if(nums[temp] != nums[i]){

            temp++;

            nums[temp] = nums[i];
            
         }
           
        }

        for(int i=0;i<=temp;i++){
            System.out.print(nums[i]+" ");
        }

        // System.out.println(Arrays.toString(nums))  ; 
     }
    
}
