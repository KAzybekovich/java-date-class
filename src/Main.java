import java.util.ArrayList;
import java.util.Collections;

class Date implements Comparable<Date> {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        if (isValidDate(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            System.out.println("Error: Invalid date.");
        }
    }

    public boolean isValidDate(int day, int month, int year) {
        if (month < 1 || month > 12) return false;
        if (day < 1 || day > daysInMonth(month, year)) return false;
        return year > 0;
    }

    private int daysInMonth(int month, int year) {
        switch (month) {
            case 2:
                return isLeapYear(year) ? 29 : 28;
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                return 31;
        }
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public void updateDate(int day, int month, int year) {
        if (isValidDate(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            System.out.println("Error: Attempt to set an invalid date.");
        }
    }

    public void printDate() {
        String[] months = {"", "January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December"};
        System.out.println(months[this.month] + " " + this.day + ", " + this.year);
    }

    public int calculateDifference(Date otherDate) {
        int days1 = convertToDays(this);
        int days2 = convertToDays(otherDate);
        return Math.abs(days1 - days2);
    }

    private int convertToDays(Date date) {
        int days = date.year * 365 + date.day;
        for (int i = 1; i < date.month; i++) {
            days += daysInMonth(i, date.year);
        }
        days += countLeapYears(date.year, date.month);
        return days;
    }

    private int countLeapYears(int year, int month) {
        if (month <= 2) year--;
        return year / 4 - year / 100 + year / 400;
    }

    @Override
    public int compareTo(Date other) {
        if (this.year != other.year) return this.year - other.year;
        if (this.month != other.month) return this.month - other.month;
        return this.day - other.day;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Date> dates = new ArrayList<>();

        dates.add(new Date(1, 1, 2023));
        dates.add(new Date(29, 2, 2020));
        dates.add(new Date(15, 5, 2021));
        dates.add(new Date(30, 6, 2019));

        System.out.println("Dates before sorting:");
        for (Date date : dates) {
            date.printDate();
        }

        Collections.sort(dates);

        System.out.println("\nDates after sorting:");
        for (Date date : dates) {
            date.printDate();
        }

        Date date1 = new Date(1, 1, 2023);
        Date date2 = new Date(1, 1, 2020);
        System.out.println("\nDifference in days: " + date1.calculateDifference(date2));
    }
}


