public class StockBuyAndSell {

    public static int maxProfit(int[] price){
        int n = price.length;
        int profit = 0;
        for(int i=1;i<n;i++){
            if(price[i]>price[i-1]){
                profit = profit + (price[i]-price[i-1]);
            }
        }
        return profit;
    }

    public static void main(String[] args){
        int[] price = {1,5,3,8,12};
        System.out.println(maxProfit(price));
    }
}

//IDEA : we know the prices in advance. If prices of stock are going down, let them go down and once the
//price has reached bottom, buy the stock. And when they are going up, let them go up, and when it has
//reached the peak, sell the stock.
// 1 5 3 8 12
// B S B   S