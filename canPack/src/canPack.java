import java.util.Scanner;
public class canPack {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your date of birth:)");

        boolean hasNextInt= scanner.hasNextInt();
        if(hasNextInt) {
            int DateOfBirth= scanner.nextInt();
            scanner.nextLine();
            Scanner Name=new Scanner(System.in);
            System.out.println("Enter your name");
            String name= scanner.nextLine();
            int age = 2022 - DateOfBirth;
            if (age >= 0 && age <= 100) {
                System.out.println("Hello ! your name is " + name + " and you are " + age + " years old ");
                scanner.close();
            } else {
                System.out.println("Please enter a valid year of birth");

            }
        }
        else{
            System.out.println("unable to parse int !");
        }



    }

}
