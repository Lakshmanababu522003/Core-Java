import java.util.Scanner;

public class problem20 {

    public static void main(String args[]){

        System.out.println("Enter the number:");

        Scanner s = new Scanner(System.in);

        int num = s.nextInt();

        int temp=0;

        int arms=0;

        int num1=num;

        while(num1 > 0){

            temp = num1 %10;

            arms = arms + (temp*temp*temp);

            num1/=10;
        }

        if(num == arms){

            System.out.println("The armstrong number" + num + arms);
        }
        else{
            System.out.println("better luck");
        }
    }
    
}

//armstrong num
