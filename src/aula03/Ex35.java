package aula03;

import java.util.Scanner;

public class Ex35 {

    private static Integer numberDays(int month, int year) {
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if ((year%4==0 && year%100!=0) || year%400==0) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 31;
        }
    }

    private static String monthName(int month) {

        String[] monthsList = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	
		String monthName = monthsList[month-1];
		
		return monthName;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int year, month, days, startDay;
        String monthName;

        do {
            System.out.print("Month: ");
            month = sc.nextInt();
        } while (month < 1 || month > 12);

        do {
            System.out.print("Year: ");
            year = sc.nextInt();
        } while (year < 0);

        do {
            System.out.print("Start day: ");
            startDay = sc.nextInt();
        } while (startDay < 1 || startDay > 7 );

        days = numberDays(month, year);
        monthName = monthName(month);

        System.out.printf("%12s %-10s\n", monthName, year);
        System.out.printf("%3s%3s%3s%3s%3s%3s%3s", "Su", "Mo", "Tu", "We", "Th", "Fr", "Sa");

        startDay--;

        if (startDay != 0) {
            String s = "%n%" + 3*startDay + "s";
            System.out.printf(s,"");
        }
        for (int i=1; i<=days; i++) {
            if (startDay%7 == 0) {
                System.out.print("\n");
            }
            System.out.printf("%3d",i);
            startDay++;
        }

        sc.close();
    }

}
