import java.util.*;

class SubArrayWithSumK {
    static int subArrayWithSumK(int[] arr, int K) {
        int n = arr.length, sum = 0, j = 0, maxLen = 0;
        for(int i = 0; i < n; i++) {
            sum += arr[i];

            if(sum > K) sum -= arr[j++];

            if(sum == K) maxLen = Math.max(maxLen, i - j + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the count of values in the array :  ");
        int n = sc.nextInt();

        System.out.print("Enter the values into array :  ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the sum :  ");
        int K = sc.nextInt();

        System.out.print("The length of  sub array equal to " + subArrayWithSumK(arr, K));

        sc.close();
    }
}