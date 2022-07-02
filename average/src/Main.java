import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Input the first number");
        double x=in.nextDouble();
        System.out.println("Input the second number");
        double y=in.nextDouble();
        System.out.println("Input the third number");
        double z=in.nextDouble();
        System.out.println("The Average is " +Average(x,y,z) );

    }

    public static double Average(double x, double y , double z) {
        Double Average= (x+y+z)/3;
        return Average;

    }

}
