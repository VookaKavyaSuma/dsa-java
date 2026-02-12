import java.util.Arrays;

class PrefixSuffixProduct {
    static void prefixSuffixProduct(int[] arr){
        int n = arr.length;
        int[] prefixArray = new int[n];
        int[] suffixArray = new int[n];
        int[] result = new int[n];

        prefixArray[0] = arr[0];
        suffixArray[n-1] = arr[n-1];
        for(int i = 1; i < n; i++) {
            prefixArray[i] = prefixArray[i - 1] * arr[i];
            suffixArray[n-1-i] = suffixArray[n-i] * arr[n-1-i];
        }

        result[0] = suffixArray[1];
        System.out.print(result[0] + " ");
        for(int i = 1; i < n-1; i++) {
            result[i] = prefixArray[i-1] * suffixArray[i+1]; 
            System.out.print(result[i] + " ");
        }
        result[n-1] = prefixArray[n-2];
        System.out.print(result[n-1]);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        prefixSuffixProduct(arr);
    }
}