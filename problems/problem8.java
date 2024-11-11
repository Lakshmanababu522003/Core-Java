public class problem8 {
    public static void main(String args[]){
        String s1 = "LakshmanaBabu.T";
        int lower=0;
        int upper=0;
        int vowel=0;

        StringBuffer s2 = new StringBuffer();
       

        s2.append(s1);

        for(int i=0;i<s2.length();i++){
            if(s2.charAt(i) >= 97 && s2.charAt(i)<=122){
                lower++;
            }

            else if(s2.charAt(i) >= 65 && s2.charAt(i) <= 96){
                upper++;
            }
             if(s2.charAt(i) == 'A' || s2.charAt(i) == 'E' || s2.charAt(i) == 'I' ||
            s2.charAt(i) == 'O' || s2.charAt(i) == 'U' || s2.charAt(i) == 'a' || s2.charAt(i) == 'e' ||
            s2.charAt(i) == 'i' || s2.charAt(i) == 'o' || s2.charAt(i) == 'u' 
            ){
                vowel++;
            }
        }

        int spl = s2.length()-(lower+upper);

        System.out.println("spl"+spl);
        System.out.println("lower"+lower);
        System.out.println("upper"+upper);
        System.out.println("vowel"+vowel);
      

    }
}


// spl1
// lower11
// upper3
// vowel5
