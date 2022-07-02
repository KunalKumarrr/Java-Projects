import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=in.nextLine();
        System.out.println("The vowels in the following string is :" +Calculate_vowel(str));

    }

    public static int Calculate_vowel(String str) {
        int count=0;
        for(int i=0; i<str.length();i++){
            if(str.charAt(i) == 'a' || str.charAt(i)=='e' ||  str.charAt(i)=='i' ||  str.charAt(i)=='o'||  str.charAt(i)=='u' )
            {count++;}

        }
        return count;


    }
}
