import java.util.*;

public class problem18 {

    public static void main(String[] args) {
        
        System.out.println("Enter the n value:");

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int a=-1,b=1,c=0;

        for(int i=1;i<=n;i++){

            c=a+b;

            System.out.println(c);

            a=b;

            b=c;
        }

        //fibonacci


    }
    
}
