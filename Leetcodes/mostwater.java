public class mostwater {

    public static void main(String[] args) {
        
        int[] arr = new int[] {1,8,100,2,100,4,8,3,7};

        int left = 0;

        int right = arr.length-1;

        int ans =-1;

        while(left < right){
            int width = right-left;

            int height = Math.min(arr[left], arr[right]);

            ans =  Math.max(ans,height*width);

            if(arr[left] < right){
                left++;
            }
            else{
                right--;
            }
        }

        System.out.println(ans);
    }
    
}
