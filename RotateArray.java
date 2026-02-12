import java.util.*;

class RotateArray {
    static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k%n;

        reverseArray(arr, 0, n-1);

        reverseArray(arr, 0, k-1);

        reverseArray(arr, k, n-1);
    }
    static void reverseArray(int[] arr, int start, int end){
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        rotateArray(arr,3);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}