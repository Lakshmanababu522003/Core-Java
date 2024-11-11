import java.util.Arrays;

public class majerityele {

    public static void main(String args[]){

        int[] arr = new int[] {2,2,1,1,1,2,2};

        int count =0;

        int num=0;

        for(int nums:arr){

            if(count == 0){

                num = nums;
            }

            if(num == nums){
                count++;
            }

            else{
                count--;
            }

            Arrays.toString(nums);
            



        }

        System.out.println(num);
    }
    
}

//Approach : Moore Voting Algorithm
