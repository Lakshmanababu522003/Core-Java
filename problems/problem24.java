import java.util.Scanner;

public class problem24 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the start value");

        int start = s.nextInt();

        System.out.println("Enter the end value");

        int end = s.nextInt();

        int flag=0;

        for(int i=start;i <= end ; i++){

            

            int j=2;

            while(j>0){
                if(i%j==0){
                    flag=1;
                }
                j++;
            }

            if(flag==1){
                System.out.println("The not prime " + i);
            }
        }
    }
    
}
