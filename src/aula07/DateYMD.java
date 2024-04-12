package aula07;

public class DateYMD extends Date {

        private int day;
        private int year;
        private int month;

    public DateYMD(int day, int month, int year) {
        set (day, month, year);
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public void set(int day, int month, int year){
        if (validDate(day, month, year) == false)
            throw new IllegalArgumentException("Invalid date");

        this.day = day;
        this.month = month;
        this.year = year;
    }


}

