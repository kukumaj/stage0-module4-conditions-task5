package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        boolean remainder;

        remainder = ((year % 4 == 0) && ((year % 400 == 0) || (year % 100 != 0)));
        int remainderInt = (remainder) ? 1 : 0;
        switch (remainderInt) {
            case 1 -> System.out.println("leap");
            case 0 -> System.out.println("not leap");
        }
    }
}