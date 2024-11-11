import java.util.*;

public class problem13 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the num ");

        int num = s.nextInt();

        int temp ,rever =0;



        while(num > 0){

            temp = num %10;

            rever = rever * 10 + temp;

            num = num /10;
        }

        System.out.println(rever);
    }
}
