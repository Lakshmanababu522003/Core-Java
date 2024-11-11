import java.util.*;

public class problem14 {
    public static void main(String args[]){

      double x=2;

      double n = 3;

      double nn = n;

      double ans = 1.0;

      if(nn < 0){
        nn=nn*-1;
      }

      while(nn > 0){
        if(nn%2==0){
            ans=ans*x;
            nn=nn-1;
        }
        else {
            x=x*x;
            nn=nn/2;
        }
      }

      if(n<0){
        ans = (double)(1.0) / (double)(ans);
      }

      System.out.println(ans);


    }
}
