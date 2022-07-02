import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the First Number");
        double a= input.nextDouble();
        System.out.println("Enter the second number");
        double b= input.nextDouble();
        System.out.println("Enter the third Number");
        double c=input.nextDouble();

        System.out.println("The total for the given numbers are " + Addition(a,b,c));

    }

    public static double Addition(double a,double b) {
        return a+b;

    }
    public static double Addition(double a,double b,double c) {
        return a+b+c;

    }
}
