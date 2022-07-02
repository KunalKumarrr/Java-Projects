public class Main {
    public static void main(String[] args) {
        getDurationString(234, 12);
        getDurationString(1000);

    }

    public static long getDurationString(long minutes, long second) {
        if ((minutes < 0) || (second < 0) && (second > 59)) {
            System.out.println("Invalid Parameter");
            return -1;
        }
        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;
        System.out.println(hours + " hours " + remainingMinutes + " minutes " + second + " seconds");
        return hours;

    }

    public static long getDurationString(long second) {

        if (second < 0) {
            System.out.println("Invalid Value");
        }
    long minutes =second/60;
     long remainingMinutes= second %60;
     return getDurationString(minutes,remainingMinutes);

    }
}

