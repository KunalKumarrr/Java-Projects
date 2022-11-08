import java.util.Scanner;
class Main {
    public static void inputThenPrintSumAndAverage(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int sum=0;
        int count=0;

        while(scanner.hasNextInt()) {
            sum += scanner.nextInt();
            count++;
        }
        System.out.println("SUM = " +sum + " AVG = " +Math.round((double)sum/count));
        scanner.close();


    }




}
