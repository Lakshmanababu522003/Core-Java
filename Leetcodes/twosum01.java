import java.util.Arrays;

class twosum01{

    public static void main(String args[]){

        int[] nums = new int[] {3,3};

        int[] sum = new int[2];

        int target = 6;

        for(int i=1;i<nums.length;i++){

            if(nums[i] + nums[i-1] == target){

                sum[0] = i-1;
                sum[1] = i;

            }
        }

        System.out.println(Arrays.toString(sum));

        
    }

}