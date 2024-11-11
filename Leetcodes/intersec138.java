import java.util.Arrays;

public class intersec138 {

    public static void main(String[] args) {

        int[] nums1 = new int[] {4,9,5};

        int[] nums2 = new int[] {9,4,9,8,4};

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i=0,j=0,k=0;

        while(i < nums1.length && j<nums2.length){

            if(nums1[i] < nums2[j]){
                i++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else{

                nums1[k++] = nums1[i++];
                j++;

            }

        }

       for(int l=0;l<k;l++){

        System.out.println(nums1[l]);

       }

      
        
    }
    
}
