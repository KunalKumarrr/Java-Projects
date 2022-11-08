import java.util.Scanner;

class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean first = true;
        while (true) {
            System.out.println("Enter number");
            boolean isanint = scanner.hasNextInt();
            if (isanint) {
                int number = scanner.nextInt();
                if(first){
                    first=false;
                    min=number;
                    max=number;
                }
                if (number < min) {
                    min = number;
                }
                if (number > max) {
                    max = number;

                } else {
                    break;
                }
                scanner.close();
            }
            System.out.println("The min of the number is :" + min + " The max of the number is :" + max);


        }
    }


}
