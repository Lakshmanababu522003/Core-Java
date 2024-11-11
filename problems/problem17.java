import java.util.*;

public class problem17 {

    public static void main(String args[]){

        System.out.println("Enter the N value:");

        Scanner s = new Scanner(System.in);

        int n= s.nextInt();

        int sum=0;
        int Avg=0;

        for(int i=1;i<=n;i++){

            System.out.println("Enter the number");

            int sam=s.nextInt();

            sum+=sam;


        }

        Avg=sum/n;

        System.out.println("The sum is "+ sum + "The avg is"+Avg);


    }
    
}

//sum and avaerge
