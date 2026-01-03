import java.util.*;

class Arrays{
    public static void main(String[] args){
        Scanner s =  new Scanner(System.in);
        int[] arr = new int[10];
        for(int i=0;i<4;i++){
            arr[i] = s.nextInt();
        }
        for(int i=0;i<4;i++){
            System.out.print(arr[i]+" ");
        }
        // int[] arr1;
        // int arr2[];
        s.close();
    }
}