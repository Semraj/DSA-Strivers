package leetCode;

public class BuyAndSellStocks_121 {

   static int getMax_profit(int price[])
    {
        int max_profit = 0;
        int n =price.length;
        int buy_price=price[0];
        for(int i=1;i<n;i++){
            int current_price=price[i]-buy_price;
            if(max_profit<current_price){
                max_profit=current_price;
            }
            if(price[i]<buy_price){
                buy_price=price[i];
            }
        }
        return max_profit;
    }

    public static void main(String[] args) {
        int[] arr={7,6,4,3,1};
        int maxi_profit=getMax_profit(arr);
        System.out.println(maxi_profit);
    }
}
