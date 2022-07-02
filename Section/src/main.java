import java.util.Scanner;
public class Main {
    public static void main(String args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the character");
        char in= input.next(".").charAt(0);
        System.out.println(checkwitch(in));

    }

    public static String checkwitch(char input) {
        switch(input) {
            case 'a':
                System.out.println("This is character 'a' \n");
                break;
            case 'b':
                System.out.println("This is the character 'b' \n");
                break;
            case 'c':
                System.out.println("This is the character 'c' \n");
                break;
            case 'd':
                System.out.println("This is the character 'd' \n");
                break;
        }
    }

}
