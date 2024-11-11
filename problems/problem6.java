

//sum([1,n]) = n * (n+1) / 2

public class problem6 {

    public static void main(String zoho[]){

        int[] arr = new int[] {0,1,3};
        int sum=0;

        for(int i:arr){

            sum +=i;
        }

        System.out.println(((arr.length)*(arr.length+1)/2)-sum);

    }
    
}

//2
