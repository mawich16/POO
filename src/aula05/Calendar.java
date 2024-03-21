package aula05;

import java.util.Scanner;

public class Calendar {

    static int day, month, year, daysNumber, startDayOfYear, startDayOfMonth;
    static String monthName, startDayOfYearName, startDayOfMonthName;

    public Calendar(int year, int startDayOfYear) {
        this.year = year;
        this.startDayOfYear = startDayOfYear;
    }

    public static String monthName(int month) {
        String[] monthsList = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		String monthName = monthsList[month-1];
		return monthName;
    }

    public static Boolean isLeapYear(int year) {
        if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static int monthDays(int month, int year) {
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

    public static String firstWeekdayOfYear() {
        String[] weekdayList = {"Monday", "Tuesday", "Wendnesday","Thersday", "Friday", "Saturday", "Sunday"};
		startDayOfYearName = weekdayList[startDayOfYear-1];
		return startDayOfYearName;
    }

    public static int getYear() {
        return year;
    }

    public static int firstWeekdayOfMonth(int month, int startDayOfYear, int year) {
        if (month < 3) {
            month += 12;
            year--;
        }
        int q = startDayOfYear;
        int m = month;
        int K = year % 100;
        int J = year / 100;

        if (q == 6) {
            q = 0;
        }
        else {
            q++;
        }

        int h = (q + ((13 * (m + 1)) / 5) + K + (K / 4) + (J / 4) - (2 * J)) % 7;

        return (h + 5) % 7;
    }

    public static void toStringYear(int year) {
        for (int month=1; month<=12; month++) {
            printMonth(month, year);
            System.out.println("");
        }
    }

    public static Boolean validDate(int day, int month, int year) {
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

    public static int[][] events(int day, int month, int year) {
        int[][] eventsList = new int[12][31];
        if (validDate(day, month, year) == true) {
            eventsList[month-1][day -1]++;
        }
        else {
            System.out.println("invalid date");
        }
        return eventsList;
    }

    public static void printMonth(int month, int year) {
        int daysNumber = monthDays(month, year);
        String monthName = monthName(month);
    
        System.out.printf("%12s %-10d\n", monthName, year);
        System.out.println(" Su  Mo  Tu  We  Th  Fr  Sa");
    
        int startDayOfMonth = firstWeekdayOfMonth(month, startDayOfYear, year);
        int[][] eventList = events(day, month, year);

        for (int i = 0; i < startDayOfMonth; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= daysNumber; day++) {
            if (eventList[month-1][day-1] != 0) {
                System.out.printf("*%2d ", day);
            }
            else {
                System.out.printf("%3d ", day);
            }

            if ((startDayOfMonth + day) % 7 == 0 || day == daysNumber) {
                System.out.println();
            }
        }
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int option, year, startDayOfYear, month;
        String dateString;
        year = 0;

        while (true) {
            System.out.println("Calendar operations:");
            System.out.println("1 - create new calendar");
            System.out.println("2 - print calendar month");
            System.out.println("3 - print calendar");
            System.out.println("4 - add events");
            System.out.println("0 - exit");
            
            option = sc.nextInt();
            System.out.println("");


            switch (option) {
                case 1:
                    System.out.println("introduce year:");
                    year = sc.nextInt();
                    while (year < 0) {
                        System.out.println("invalid year:");
                        year = sc.nextInt();
                    }

                    System.out.println("introduce start weekday:");
                    startDayOfYear = sc.nextInt();
                    while (startDayOfYear < 0 && startDayOfYear >= 7 ) {
                        System.out.println("invalid weekday:");
                        startDayOfYear = sc.nextInt();
                    }
                    System.out.println("");

                    Calendar calendar = new  Calendar(year, startDayOfYear);
                    break;

                case 2:
                    if (year == 0) {
                        System.out.println("you havent created a calendar yet, please do that first");
                        System.out.println("");
                    }
                    else {
                        System.out.println("introduce month number:");
                        month = sc.nextInt();

                        Calendar.printMonth(month, year);
                        System.out.println("");
                    }
                    break;

                case 3:
                    if (year == 0) {
                        System.out.println("you havent created a calendar yet, please do that first");
                    }
                    else {
                        toStringYear(year);
                        System.out.println("");
                    }
                    
                break;

                case 4:
                    if (year == 0) {
                        System.out.println("you havent created a calendar yet, please do that first");
                    }
                    else {
                        System.out.println("introduce date in formate 'mm-dd':");
                        dateString = sc.next();

                        String[] dateParts = dateString.split("-");
                        month = Integer.parseInt(dateParts[0]);
                        day = Integer.parseInt(dateParts[1]);

                        events(day, month, year);
                        System.out.println("");
                    }
                    break;

                default:
                System.exit(0);
                    break;
            }
        }
    }
}
