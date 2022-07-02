public class main {
    public static void main(String[] args) {
        sumOdd(100,5000);



    }

    public static boolean isOdd(int num) {
        if(num <=0){
            return false;
        }

        return num %2 !=0;

    }

    public static int sumOdd(int start,int end) {
        if((end<start)|| (start<0) || (end <0)){
            System.out.println("Invalid Statement");
        }
        int sum=0;
        for(int i=start;i<=end;i++){
            if(isOdd(i)){
                sum+=i;
                System.out.println("The number " +i);
            }
        }
        System.out.println("total sum " +sum);
        return sum;



    }
}
