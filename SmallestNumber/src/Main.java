public class Main {
    public static void main(String[] args) {
        Smallest(2, 12, 78);

    }

    public static void Smallest(long a, long b, long c) {
        if (a < b && a < c) {
            System.out.println(a + " is the smallest number");
        } else if (b < a && b < c) {
            System.out.println(b + " is the smallest number");
        } else {
            System.out.println(c + " is the smallest number");

        }

    }
}

