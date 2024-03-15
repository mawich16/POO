package aula05;

public class DateYMD {

    int day, month, year, daysNumber, startDayOfYear, startDayOfMonth;
    String monthName, startDayOfYearName, startDayOfMonthName;

    public DateYMD(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Boolean validMonth(int month) {
        if (this.month <= 12 && this.month >= 1) {
            return true;
        }
        else {
            return false;
        }
    }

    public String monthName(int month) {
        String[] monthsList = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		String monthName = monthsList[month-1];
		return monthName;
    }

    public Boolean isLeapYear(int year) {
        if (this.year % 400 == 0 || (this.year % 100 != 0 && this.year % 4 == 0)) {
            return true;
        }
        else {
            return false;
        }
    }

    public int monthDays(int month, int year) {
        switch (this.month){
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

    public Boolean validDate(int day, int month, int year) {
        if (month == 0 || year == 0 || day == 0) {
            return false;
        }
        switch (month){
            case 4:
            case 6:
            case 9:
            case 11:
                if (day <= 30 && day >= 1) {
                    return true;
                    
                }
                else {
                    return false;
                }
            case 2:
                if (isLeapYear(year) == true && day <= 29 && day >= 1) {
                    return true;
                }
                else if (isLeapYear(year) == false && day <= 28 && day >= 1) {
                    return true;
                }
                else {
                    return false;
                }
            default:
                if (day <= 31 && day >= 1) {
                    return true;
                }
                else {
                    return false;
                }
            }
    }

    public String setDate(int newDay, int newMonth, int newYear) {
        if (validDate(newDay, newMonth, newYear) == false) {
            this.day = 0;
            this.month = 0;
            this.year = 0;
            return "invalid date";
        }
        else
            this.day = newDay;
            this.month = newMonth;
            this.year = newYear;
            return "valid date";
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void incrementDate(int day, int month, int year, int incrementDays) {
        this.day += incrementDays;
        
        while (this.day > monthDays(month, year)) {
            this.day -= monthDays(month, year);
            this.month++;
            if (this.month > 12) {
                this.month = 1;
                this.year++;
            }
        }
    }

    public void decrementDate(int day, int month,  int year, int decrementDays) {
        this.day -= decrementDays;
        
        while (this.day < 1) {
            this.month--;
            if (this.month < 1) {
                this.month = 12;
                this.year--;
            }
            this.day += monthDays(month, year);
        }
    }

    public String toString() {
        if (day == 0 || month == 0 ||  year == 0) {
            return "no date available";
        }
        else {
            return "Date: " + year + "-" + month + "-" + day;
        }
    }

}

