package MonthsAndDays.CalendarHelper;

public class CalendarHelper {

    public String getWeekday(int number) {
        return switch (number) {

            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> throw new IllegalStateException("Unexpected value: " + number);
        };
    }

    public String getMonth(int number) {
        return switch (number) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "Mars";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "Juli";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> throw new IllegalStateException("Unexpected value: " + number);
        };
    }
}
