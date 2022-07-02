import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the input");
        int input= in.nextInt();
        DayofTheWeek(input);


    }

    public static void DayofTheWeek(int day) {
        if (day == 0) {
            System.out.println("Sunday");
        } else if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        }else{
            System.out.println("Invalid");
        }

    }
}
