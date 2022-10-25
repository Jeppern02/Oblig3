public class Year {


    private int year;



    public static boolean isDivisibleWith4(int year) {
        return year % 4 == 0;
    }

    public static boolean isNotDivisibleWith100(int year) {
        return year % 100 != 0;
    }

    public static boolean isDivisibleWith400(int year) {
        return year % 400 == 0;
    }

    public static boolean isLeapYear(int year) {
        if (isDivisibleWith4(year) && isNotDivisibleWith100(year)) {
            return true;
        } else return isDivisibleWith400(year);
    }

    public void setYear(int i) {

    }






}
