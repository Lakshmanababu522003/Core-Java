import java.util.*;

public class largestnum {

    public static void main(String[] args) {
        
        int[] nums = new int[] {3,30,34,5,9};

        String[] s1 = new String[nums.length];

        for(int i=0;i < nums.length; i++){

            s1[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(s1,(a,b) -> (b+a).compareTo(a+b));

        StringBuffer s2 = new StringBuffer();

        for(String str:s1){

            s2.append(str);

        }

        System.out.println(s2);

        s1.startsWith('0') ? '0' : s2;

        
    }
    
}
