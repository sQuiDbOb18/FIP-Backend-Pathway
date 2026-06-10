package task4;

enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

class Week {
    String message;

    public Week() {
        message = "These are the days of the week:";
    }

    public void showMessage() {
        System.out.println(message);
    }
}

public class DaysOfWeek extends Week {
    public void displayDays() {
        showMessage();

        for (Day day : Day.values()) {
            System.out.println(day);
        }
    }

    public static void main(String[] args) {
        DaysOfWeek week = new DaysOfWeek();
        week.displayDays();
    }
}
