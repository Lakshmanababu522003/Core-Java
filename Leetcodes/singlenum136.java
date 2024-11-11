public class singlenum136{

    public static void main(String args[]){

        int[] arr= new int[] {4,1,2,1,2};

        int val =0;

        for(int i=0;i< arr.length;i++){
            val = val ^ arr[i];
        }

        System.out.println(val);

    }
}