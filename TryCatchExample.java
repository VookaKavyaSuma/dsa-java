public class TryCatchExample {
    public static void main(String[] args) {
        
        try {
            int a = 10;
            int b = 10;
            int result = a/b;
            String str = "Kavya";
            int[] array = {1,2,3,4};
            System.out.println(result);
            System.out.println(str.length());
            System.out.println(array[5]);
        } catch (ArithmeticException e) {
            System.out.println("Cannot be divided with zero");
        } catch(NullPointerException e) {
            System.out.println("Value stored is that string is null");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("The index you are accessing does not not exist");
        } 
    }
}
