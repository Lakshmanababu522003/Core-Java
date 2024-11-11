public class problem8 {

    public  static void main(String zoho[]){

        String s1 = "gksrek";

        String s2 = "geeksforgeeks";

    

       int i=0,j=0;

       boolean ans = false;

       while(i < s2.length()){
        if(j==s1.length()){
            break;
        }
        if(s1.charAt(j) == s2.charAt(i)){
            j++;
            ans =true;
        }
        else{
            ans=false;
        }
        
        i++;
       }

       if(j != s1.length()){
        ans = false;
       }

       System.out.println(ans);
       System.out.println(j);


    }
    
}
