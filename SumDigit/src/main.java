public class main {
    public static void main(String[] args) {
        System.out.println("Sum of digits in number is " +sumDigits(4));

    }

    public static int sumDigits(int number) {
        if(number<10){
            return -1;
        }
        int sum=0;
        while(number>=1){
            int digit=number%10;
            sum+=digit;
            number/=10;


        }
        return sum;
    }

}
