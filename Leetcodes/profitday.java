class profitday{
    public static void main(String args[]){
        int arr[] = new int [] {7,1,5,3,6,4};

        int buy=0;

        int sell = 1;

        int profit =0;

        int maxpro=0;

        while (sell < arr.length) {

            if(arr[buy] < arr[sell]){
                profit = arr[sell]-arr[buy];

                if(profit > maxpro){
                    maxpro = profit;
                }
            }

            else{
                buy=sell;
                
            }
            sell++;
            
        }
        System.out.println(maxpro);

        
    }
}