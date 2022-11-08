public class main {
    public static void main(String[] args) {
        SimpleCalculator calculator=new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4.7);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("Subtract= " +calculator.getSubtraction());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " +calculator.getMultiplicationResult());
        System.out.println("divide= " +calculator.getDivisionResult());

    }
}
