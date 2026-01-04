import java.util.*;

class SlidingWindowMaxSum {
    static int slidingWindowMaxSum(int[] arr, int length) {
        int sum = 0,finalSum = 0,i = 0;

        for(i = 0; i < length; i++) {
            sum += arr[i];
        }

        finalSum = sum;
        for(i = length; i < arr.length; i++) {
            sum += arr[i] - arr[i-length];
            finalSum = Math.max(finalSum, sum);
        }
        return finalSum;
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

        System.out.print("Enter the max length of the subarray: ");
        int length = sc.nextInt();

        if(length > arr.length) 
            System.out.print("The length is more than the array length");
        
        int result = slidingWindowMaxSum(arr, length);
        System.out.println("The maximun sum of the subarray with length " + length + " is " + result);

        sc.close();
    }
}