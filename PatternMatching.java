import java.util.*;

public class PatternMatching {
    public static void naiveApproach(String text,String pattern){
        int textLength = text.length();
        int patternLength = pattern.length();
        char[] textArr = text.toCharArray();
        char[] patternArr = pattern.toCharArray();
        boolean found = false; 

        for(int i = 0; i <= textLength-patternLength; i++){
            int j;
            for(j = 0; j < patternLength; j++){
                if(textArr[i+j] != patternArr[j]){
                    break;
                }
            }if(j == patternLength){
                System.out.println("The pattern is found at " + (i+1) + " position");
                found = true;
            }
        }
        if(!found)
            System.out.println("The pattern is not found");
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the main text");
        String text = input.nextLine();
        System.out.println("Enter the pattern to be observed");
        String pattern = input.nextLine();
        naiveApproach(text,pattern);
        input.close();
    }
}
