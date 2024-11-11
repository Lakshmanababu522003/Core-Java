public class problem4 {
    public static void main(String zoho[]){

        int amount = 565;

        int[] currency = new int[] {2000, 500, 200, 100, 50, 10, 1};

        int[] notescount = new int[currency.length];

        for(int i=0;i < currency.length;i++){

            if(amount > currency[i]){

                notescount[i] = amount / currency[i] ;

                amount = amount % currency[i];
            }

        }

        for(int i=0;i < currency.length;i++){
            System.out.println(currency[i] + " : " +notescount[i] );
        }
    }
}

//output

// 2000 : 0
// 500 : 1
// 200 : 0
// 100 : 0
// 50 : 1
// 10 : 1
// 1 : 5
