package aula05;


class DateYMD {

    public int day, month, year, daysNumber;

    public DateYMD(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public static Boolean validMonth(int month) {
        if (month <= 12 || month >= 1) {
            return true;
        }
        else {
            return false;
        }
    }

    public static Boolean isLeapYear(int year) {
        if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
            return true;
        }
        else {
            return false;
        }
    }

    public Integer monthDays(int month, int year) {
        switch (month){
            case 4:
            case 6:
            case 9:
            case 11:
                daysNumber = 30;
                break;
            case 2:
                if (isLeapYear(year) == true) {
                    daysNumber = 29;
                }
                else {
                    daysNumber = 28;
                }
                break;
            default:
                daysNumber = 31;
                break;
            }
        return daysNumber;
    }

    public static Boolean validDate(int day, int month, int year) {
        switch (month){
            case 4:
            case 6:
            case 9:
            case 11:
                if (day <= 30 || day >= 1) {
                    return true;
                    
                }
                else {
                    return false;
                }
            case 2:
                if (isLeapYear(year) == true || day <= 29 || day >= 1) {
                    return true;
                }
                else if (isLeapYear(year) == false || day <= 28 || day >= 1) {
                    return true;
                }
                else {
                    return false;
                }
            default:
                if (day <= 31 || day >= 1) {
                    return true;
                }
                else {
                    return false;
                }
            }
    }

    public void setDate(int newDay, int newMonth, int newYear) {
        if (validDate(newDay, newMonth, newYear) == false) {
            System.out.println("invalid date ");
            day = 0;
            month = 0;
            year = 0;
        }
        else
            day = newDay;
            month = newMonth;
            year = newYear;
    }

    public Integer getDay() {
        return day;
    }

    public Integer getMonth() {
        return month;
    }

    public Integer getYear() {
        return year;
    }
}





public class Ex51 {

}
