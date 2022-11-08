public class Calculator {
    public static void main(String[] args) {

        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println(calculator.getFirstNumber() + " + " +calculator.getSecondNumber() + " = " + calculator.getAdditionResult());

    }
    }