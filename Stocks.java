import java.util.*;

class Stocks {
    public static int stocksProfit(int[] arr) {
        int n = arr.length;

        int min = arr[0], profit = 0;
        for(int i = 1; i < n; i++) {
            min = Math.min(min,arr[i]);
            int currProfit = arr[i] - min;
            profit = Math.max(profit,currProfit);
        }
        return (profit);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of days of stocks:   "); 
        int n = sc.nextInt();

        if(n == 0 || n == 1) {
            System.out.print("We cannot buy and sell stocks for " + n + " days ");
            return ;
        }
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int profit = stocksProfit(arr);
        System.out.print("Maximum profit is : " + profit);
        sc.close();
    }
}