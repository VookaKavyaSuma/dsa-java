import java.util.*;

class PrintSubArrays {
    static void printSubArrays(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j++) {
                for(int k = i; k <= j; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements into the array ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println();
        printSubArrays(arr);
        System.out.println("Number of sub arrays thus formed with size " + n + " is " + ((n*(n+1))/2));
        sc.close();
    }
} 