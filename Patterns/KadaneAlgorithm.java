import java.util.Scanner;

class KadaneAlgorithm {
    public static int KadaneAlg(int[] arr) {
        int maxSum = arr[0], currentSum = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] + currentSum > 0) {
                currentSum += arr[i];
            } else {
                currentSum = arr[i];
            }
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
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
        int result = KadaneAlg(arr);
        System.out.println("The maximun sum is " + result);
        sc.close();
    }
}