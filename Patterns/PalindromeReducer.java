import java.util.*;

public class PalindromeReducer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int a = n;
        boolean found = false;
        int reverse = 0;

        while(n>0){
            reverse = reverse*10 + n%10;
            n/=10;
        }

        if(reverse != a) {
            System.out.println("It is not a palindrome number");
        }
        
        while(!found){
            if(reverse == a) {
                System.out.println("Now it is a palindrome number");
                found = true;
            }
            else {
                n = a;
                n += reverse;
                a = n;
                reverse = 0;
                while(n>0){
                    reverse = reverse*10 + n%10;
                    n/=10;
                }
            }
        }
        
        n = a;
        int p1,p2,p=10;
        while(p>9){
            a = n;
            int num = 0;
            while(n>0){
                num++;
                n/=10;
            }

            int num1 = num/2;
            int a1 = 1;
            while(num1>0){
                a1 *= 10;
                num1--;
            }

            p1 = a/a1;
            p2 = a - p1*a1;
            p = p1 + p2;
            n = p;
        }
        System.out.println(p);
        sc.close();
    }
}
