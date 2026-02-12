import java.util.Arrays;

class TwoPointerSum {
    static void twoPointerSum(int[] arr,int target) {
        int left = 0, right = arr.length-1, sum = 0;
        Arrays.sort(arr);

        while(left < right) {
            sum = arr[left] + arr[right];
            if(sum == target) {
                System.out.println("The sum == target is found at indices " + left + " and " + right);
                return;
            } else if(sum > target) {
                right--;
            } else {
                left++;
            }
        }
        System.out.println("There is no such possible sum found");
    }

    public static void main(String[] args) {
        int[] arr = {2,4,1,3,6,9};
        twoPointerSum(arr, 10);
    }
}