public class main {
    public static void main(String[] args) {

        for(int i=0;i<9;i++){
            System.out.println("10000 at " + i + "% interest is:" +calculateInterest(10000,i));
        }
        System.out.println("\n");
        for(int m=8;m>1;m--){
            System.out.println("10000 at " + m + "% interest is:" +calculateInterest(10000,m));
        }

    }

    public static double calculateInterest(double amount,double interestRate) {
        return (amount*(interestRate/100));

    }
}
