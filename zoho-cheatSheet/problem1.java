import java.util.*;

class problem1{

    public static void main(String[] zoho){

        Scanner star = new Scanner(System.in);

        System.out.println("Enter the row");

        int row  = star.nextInt();

        for(int i=1;i <= row;i++){

            for(int j=1;j<= row-i;j++){
                System.out.print(' ');
            }

            for(int j=1;j<=i;j++){
                System.out.print('*'+ " ");
            }

            System.out.println();
        }
        for(int i=row;i >= 1;i--){

            for(int j=1;j<= row-i;j++){
                System.out.print(' ');
            }

            for(int j=1;j<=i;j++){
                System.out.print('*'+ " ");
            }
            System.out.println();
        }
    }
}