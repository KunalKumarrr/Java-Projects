import java.util.Scanner;

class InputCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int sum=0;
       int count=0;
       while(scanner.hasNextInt()){
           sum+=scanner.nextInt();
           count++;
       }
        System.out.println("Sum : " +sum + "Average: " +(sum/count));
       scanner.close();


}
}