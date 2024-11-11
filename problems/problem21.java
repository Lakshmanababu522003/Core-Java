import java.util.Scanner;

public class problem21 {

    public static void main(String[] args) {

        // Scanner s = new Scanner(System.in);

        // System.out.println("Enter the Start Num:");

        // int start = s.nextInt();

        // System.out.println("Enter the End Num");

        // int end = s.nextInt();

    int temp =0,arms=0,val=0;

        for(int i=100;i<200;i++){

            val =i;

            System.out.println("------------------"+i);

            while(i > 0){

                // System.out.println(i);

                temp = i%10;

                arms = arms + (temp*temp*temp);

                i=i/10;
            }

            if(arms == val){
                System.out.println("The Armstrong no is" + arms);
            }

            
        }




        
    }
    
}
