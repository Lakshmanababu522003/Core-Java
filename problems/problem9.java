public class problem9 {
    public static void main(String args[]){
    
        String s1 = "lakshmanababu.t";

        StringBuffer s2 = new StringBuffer();

        int s =0;

        s2.append(s1);
//lowertoupper
        for(int i=0;i<s2.length();i++){

            if(s2.charAt(i) >= 97 && s2.charAt(i)<=122){

                s =  s2.charAt(i) -32;

                s2.setCharAt(i, (char)s);


            }
//uppertolower
            // if(s2.charAt(i) >= 65 && s2.charAt(i)<=96){

            //     s =  s2.charAt(i) +32;

            //     s2.setCharAt(i, (char)s);


            // }
        }

        System.out.println(s2);

    }
}
