import java.util.*;

public class problem12 {
    public static void main(String args[]){

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the num  " );

        int num = s.nextInt();

        int temp,count=0;

        while(num >0){
            temp = num % 10;

            num = num/10;

            count++;
        }

        System.out.println(count);
    }
}
