package Medium;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        System.out.println(Better(arr));

    }
    static int BruteForce(int[] prices){
        int min=0;
        int profit=0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                min=prices[j]-prices[i];
                profit=Math.max(profit,min);
            }
        }
        return profit;
    }
    static int Better(int[] prices){
        int min=prices[0];

        int profit=0;

        for(int i=0;i<prices.length;i++){
              int cost=prices[i]-min;
              profit=Math.max(profit,cost);
              min=Math.min(min,prices[i]);
            }

      return profit;

        }




        }




