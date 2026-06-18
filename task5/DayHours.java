package task5;

interface TimeCalculator {
    int hoursInOneDay();

    int hoursInDays(int days);
}

public class DayHours implements TimeCalculator {
    int hours;

    public DayHours() {
        hours = 24;
    }

    public int hoursInOneDay() {
        return hours;
    }

    public int hoursInDays(int days) {
        return hours * days;
    }

    public static void main(String[] args) {
        DayHours dayHours = new DayHours();

        System.out.println("Hours in one day: " + dayHours.hoursInOneDay());
        System.out.println("Hours in 3 days: " + dayHours.hoursInDays(3));
        System.out.println("Hours in 7 days: " + dayHours.hoursInDays(7));
    }
}
