package aula05;

import java.util.Scanner;


public class Ex51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int option, day, year, month, incrementDays, decrementDays;
        String dateString;

        day = 0; month = 0; year = 0;
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

                    String[] dateParts = dateString.split("-");
                    year = Integer.parseInt(dateParts[0]);
                    month = Integer.parseInt(dateParts[1]);
                    day = Integer.parseInt(dateParts[2]);

                    System.out.println(date.setDate(day, month, year));
                    System.out.println("");
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
                date.decrementDate(day, month, year, decrementDays);
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
