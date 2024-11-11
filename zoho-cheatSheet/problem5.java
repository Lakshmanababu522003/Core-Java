public class problem5 {

    public static void main(String zoho[]){

        String s = "2A.FF";

        StringBuffer s1 = new StringBuffer();

        s1.append(s);

        // System.out.println(s1.charAt(0));

        int i=0;

        while(i < s1.length()){

            if(s1.charAt(i) != ' '){

            switch (s1.charAt(i)) {
                case '.':
                System.out.print(".");
                break;
                case '0':
                System.out.print("0000 ");
                break;
                case '1':
                    System.out.print("0001 ");
                    break;
                case '2':
                    System.out.print("0010 ");
                    break;
                case '3':
                    System.out.print("0011 ");
                    break;
                case '4':
                    System.out.print("0100 ");
                    break;
                case '5':
                    System.out.print("0101 ");
                    break;
                case '6':
                    System.out.print("0110 ");
                    break;
                case '7':
                    System.out.print("0111 ");
                    break;
                case '8':
                    System.out.print("1000 ");
                    break;
                case '9':
                    System.out.print("1001 ");
                    break;
                case 'A' :
                case 'a' :
                    System.out.print("1010 ");
                    break;
                case 'B' :
                case 'b' :
                    System.out.print("1011 ");
                    break;
                case 'C' :
                case 'c' :
                    System.out.print("1100 ");
                    break;
                case 'D' :
                case 'd' :
                    System.out.print("1101 ");
                    break;
                case 'E' :
                case 'e' :
                    System.out.print("1110 ");
                    break;
                case 'F' :
                case 'f' :
                    System.out.print("1111 ");
                    break;
                
            
                default:
                    break;
            }
            i++;
        }
        }
    }
    
}

//output

//0010 1010 .1111 1111
