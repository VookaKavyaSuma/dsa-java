public class StringReversal{
    public static void main(String[] args){
        String str = "Kavya Suma";
        char[] rev = new char[str.length()];
        for(int i = 0;i < str.length(); i++){
            rev[i] = str.charAt((str.length()-1)-i);
        }
        String rev1 = String.valueOf(rev);
        System.out.println("The reverse of " + str + " is " + rev1);
        StringBuilder sb = new StringBuilder(rev1);
        System.out.println("The reverse of " + rev1 + " using StringBuilder is " + sb.reverse());
    }
}