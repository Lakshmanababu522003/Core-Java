public class addtwonum {

    public static void main(String[] args) {

        int[] l1 = new int[] {2,4,3};

        int[] l2 = new int[] {5,6,4};

        String s1 = "";
        String s2 = "";

        for(int i=l1.length-1;i>=0;i--){
            s1+=l1[i];
        }

        for(int i=l2.length-1;i>=0;i--){
            s2+=l2[i];
        }

        System.out.println(s1);

        System.out.println(s2);

        int i = Integer.parseInt(s1) + Integer.parseInt(s2);

        System.out.println(i);

        


        
    }
    
}
