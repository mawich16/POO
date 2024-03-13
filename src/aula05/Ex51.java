package aula05;

import java.util.Scanner;

class DateYMD {

    Integer day, month, year, daysNumber;

    public DateYMD(Integer day, Integer month, Integer year) {
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
            System.out.println("invalid date");
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

    public void incrementDate(int day, int month, int year, int incrementDays) {
        day += incrementDays;
        
        while (day > monthDays(month, year)) {
            day -= monthDays(month, year);
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }
    }

    public void decrementDate(int day, int month, int year, int decrementDays) {
        day -= decrementDays;
        
        while (day < 1) {
            month--;
            if (month < 1) {
                month = 12;
                year--;
            }
            day += monthDays(month, year);
        }
    }

    public String toString() {
        if (day == null || month == null ||  year == null) {
            return "no date available";
        }
        else {
            return "Date: " + year + "-" + month + "-" + day;
        }
    }
}


public class Ex51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer option, day, year, month, incrementDays, decrementDays;
        String dateString;

        day = null; month = null; year = null;
        DateYMD date = new DateYMD(day, month, year);

        while (true) {
            System.out.println("Date operations:");
            System.out.println("1 - create new date");
            System.out.println("2 - show current date");
            System.out.println("3 - increment date");
            System.out.println("4 - decrement date");
            System.out.println("0 - exit");
            
            option = sc.nextInt();
            System.out.println("");


            switch (option) {
                case 1:
                    System.out.println("introduce date in formate 'yyyy-mm-dd':");
                    dateString = sc.next();
                    System.out.println("");

                    String[] dateParts = dateString.split("-");
                    year = Integer.parseInt(dateParts[0]);
                    month = Integer.parseInt(dateParts[1]);
                    day = Integer.parseInt(dateParts[2]);

                    date.setDate(day, month, year);
                    break;

                case 2:
                    System.out.println(date.toString());
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("introduce the number of days that you want to increment: ");
                    incrementDays = sc.nextInt();
                    date.incrementDate(day, month, year, incrementDays);
                    System.out.println("final date:" + date.toString());
                    System.out.println("");
                    break;

                case 4:
                System.out.println("introduce the number of days that you want to decrement: ");
                decrementDays = sc.nextInt();
                date.incrementDate(day, month, year, decrementDays);
                System.out.println("final date:" + date.toString());
                System.out.println("");
                break;

                default:
                System.exit(0);
                    break;
            }
        }
    }
}
