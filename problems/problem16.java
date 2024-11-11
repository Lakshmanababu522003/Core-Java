import java.util.Scanner;

public class problem16 {

    public static void main(String args[]){

        System.out.print("Enter the Factorial Number :");

        Scanner fact = new Scanner(System.in);

        int fact1 = fact.nextInt();

        int val = 1;

        for(int i=1;i<=fact1;i++){

             val*=i;

        }

        System.out.println(val);
    }
    
}

//factorial
