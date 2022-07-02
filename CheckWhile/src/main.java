public class main {
    public static void main(String[] args) {
        int sum=0;
        int number=4;
        int finishNumber=200;
        int count=0;

        while(number<=finishNumber){
            number++;

            if(! isEvenNumber(number)){
                count++;

                sum+=number;
                continue;

            }
            if(count==6){break;}
            System.out.println("Even Number " +number);

        }
        System.out.println("Total Sum " +sum);
    }

    public static boolean isEvenNumber(int num) {

        if ((num % 2) == 0) {
            return true;
        } else {
            return false;
        }

    }
}
