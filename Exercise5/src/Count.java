import java.util.Scanner;
public class Count {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your Sentence");
        String str=in.nextLine();
        System.out.println("Total words in the string are :" +Count(str));
    }

    public static int Count(String str) {
        int count=0;
        if(!(" ".equals(str.substring(0,1))) || !(" ".equals(str.substring(str.length() -1))))
        {
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' ') {
                count++;
            }
        }
        count=count+1;

        }