import java.util.Scanner;
public class FirstAndLastDigitSum {
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
        System.out.println("Enter the numbers");
        int no=s.nextInt();

        System.out.println("The sum of first and last digit are " +sumFirstAndLastDigit(no));

    }

    public static int sumFirstAndLastDigit(int number) {
        if(number<0){
            return -1;
        }
        int lastdigit=number%10;
        while (number>9) {
            number /= 10;
        }

            return lastdigit+number;

        }


    }