import java.util.*;
import java.util.Arrays;
public class Anagram {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the two strings which need to be verify whether they need to be anagram");
        String s1 = a.nextLine();
        String s2 = a.nextLine();
        if(s1.length()!=s2.length()){
            System.out.println("They are not Anagrams as their lengths are different!!");
            System.exit(0);
        }
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        char a1[]=s1.toCharArray();
        char a2[]=s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);

        for(int i = 0; i < s1.length(); i++){
            if(a1[i]!=a2[i]){
                System.out.println("They are not Anagrams");
                //System.exit(0); not necessary for small programs
                a.close();
                return;
            }
        }
        System.out.println("They are anagrams");
        a.close();
    }
}
