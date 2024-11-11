import java.util.Arrays;

public class mergesort88 {

    public static void main(String args[]){
        int[] nums1 = new int[] {1,2,3,0,0,0};

        int[] nums2 = new int[] {2,5,6};

        int m=3,n =3;

        for(int i=0,j=m;i<n;i++){

            nums1[j] = nums2[i];
            j++;
        }

        Arrays.sort(nums1);

        System.out.println(Arrays.toString(nums1));
    }
    
}
