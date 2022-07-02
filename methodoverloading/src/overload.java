public class overload {
    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(5, 10);
        calcFeetAndInchesToCentimeters(7);

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || (inches < 0 && inches > 12)) {
            return -1;

        }
        double centimeters = feet * 30.48;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet " + inches + " inches " + centimeters + " cm");
        return centimeters;


    }

    public static double calcFeetAndInchesToCentimeters(double inches) {

        if (inches < 0) {
            return -1;

        }
        double feet =  inches/12;
        System.out.println(inches + "Inches = " + +feet + "ft");
        return feet;
    }
}
