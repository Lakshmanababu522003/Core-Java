import java.util.*;

public class problem19 {

    public static void main(String[] args) {
        
        System.out.println("Enter the Number:");

        Scanner s = new Scanner(System.in);

        int num = s.nextInt();

        int temp=0, rev=0;

        while(num > 0){

            temp = num % 10;

            rev = rev *10 + temp;

            num /=10;


        }

        System.out.println("The Reverse no is "+rev);
    }
    
}

//reverse
