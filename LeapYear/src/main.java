public class main {
    public static void main(String[] args) {
        isLeapYear(2000);
        isDaysInMonth(2, 2000);

    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year >= 9999) {
            return false;
        } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }

    }

    public static int isDaysInMonth(int month, int year) {
        boolean method1 = isLeapYear(year);
        {
            if ((month >= 1 && month <= 12) && (year >= 1 && year <= 9999)) {
                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        return 31;
                    case 2: {
                        if (method1 == true) {
                            month = 29;
                        } else {
                            month = 28;
                        }
                        break;
                    }
                    default:
                        month = 30;
                        break;


                }
            } else {
                return -1;
            }
            return month;
        }
    }
}



