public class main {
    public static void main(String[] args) {
        double numba = 20;
        double numba1 = 80;
        double step3;
        double multiply = (numba + numba1) * 25;
        System.out.println("The output after step 3 was :" + multiply);
        double remainder = multiply % 40;
        System.out.println("The remainder we get : " + remainder);
        if (remainder <= 20)
            System.out.println("Total was over the limit");
        else
            System.out.println("Total was not over the limit");


    }
}
