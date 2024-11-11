public class problem6 {

    public static void main(String zoho[]){

        int binnum = 1101;

        int base = 1;

        int desc = 0;

        

        while (binnum > 0){

            int last = binnum % 10;

            binnum = binnum / 10;

            desc = desc + last * base;

            base *=2;

        }

        

        System.out.println(desc);

        
    }
    
}

//output 

//13
