public class Fibonacci {
    public static int fibonacci(int n){
        return (n == 0 || n == 1) ? n : (fibonacci(n-1) + fibonacci(n-2));
    }
    public static void main(String[] args){
        int n = 15;
        System.out.println("Fibonacci Series");
        for(int i = 0; i < n; i++)
            System.out.print(fibonacci(i) + " ");
    }
}