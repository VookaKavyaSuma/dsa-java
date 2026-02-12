import java.util.*;

class TrappedRainWater {
    public static int RainWater(int[] barHeights) {
        int n = barHeights.length;

        if(n < 3) return 0;

        int trappedRainWater = 0;
        int[] leftMaxBoundary = new int[n];
        int[] rightMaxBoundary = new int[n];

        leftMaxBoundary[0] = barHeights[0];
        rightMaxBoundary[n-1] = barHeights[n-1];

        for(int i = 1; i < n-1; i++) {
            if(barHeights[i] > leftMaxBoundary[i-1]) {
                leftMaxBoundary[i] = barHeights[i];
            } else {
                leftMaxBoundary[i] = leftMaxBoundary[i-1];
            }
            if(barHeights[n-1-i] > rightMaxBoundary[n-i]) {
                rightMaxBoundary[n-1-i] = barHeights[i];
            } else {
                rightMaxBoundary[n-1-i] = rightMaxBoundary[n-i]; 
            }
        }

        for(int i = 1; i < n-1; i++) {
            trappedRainWater += Math.min(leftMaxBoundary[i],rightMaxBoundary[i]) - barHeights[i];
        }

        return trappedRainWater;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the quantity of bars:   ");
        int n = sc.nextInt();
        int[] barHeights = new int[n];
        System.out.println("Enter the heights of bars");
        for(int i = 0; i < n; i++) {
            barHeights[i] = sc.nextInt();
        }
        int waterAmount = RainWater(barHeights);
        System.out.println("The amount of water stored in these bars is "+ waterAmount);
        sc.close();
    }
}