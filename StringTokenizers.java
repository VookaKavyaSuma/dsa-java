import java.util.StringTokenizer;

public class StringTokenizers {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Java is hard");

        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        st = new StringTokenizer("Apple,Banana,Cherry"," ");
        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        st = new StringTokenizer("Kavya=Suma"," =", true);
        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
