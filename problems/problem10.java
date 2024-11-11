import java.util.*;

public class problem10 {
    public static void main(String[] args) {
        int num ;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number");
       num = s.nextInt();

       if(num %2 == 0){
        System.out.println("This "+num + " is even");
       }

       else{
        System.out.println("This "+num + " is odd");

       }
    }
}
