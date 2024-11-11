import java.util.Scanner;

public class problem23 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the Num:");

        int num = s.nextInt();

        if(num < 0 || num ==1){
            System.out.println("It is not either prime or not");
        }

        int flag=0,i=2;

        while(i <num){
            if(num % i==0){
                flag=1;
                
            }
            i++;
            
        }

        if(flag == 1){
            System.out.println("it is not prime");
        }
        else{
            System.out.println("it is prime");
        }
    }
    
}
