package aula03;

import java.util.Scanner;

public class Ex33 {

    private static void higthAndLow() {
        Scanner sc = new Scanner(System.in);

        int randomNumber;
        int userNumber;
        int attempts;

        randomNumber = (int)(Math.random()*100);
        System.out.print("Guess the number: ");
        userNumber = sc.nextInt();
        attempts = 1;

        while (userNumber != randomNumber) {
            if (userNumber < randomNumber) {
                System.out.print("too low. Try again: ");
                userNumber = sc.nextInt();
            }
            else {
                System.out.print("too higth. Try again: ");
                userNumber = sc.nextInt();
            }
            attempts += 1;
        }

        System.out.println("You needed " + attempts + " attempts to guess the number");

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer;

        answer = "Yes";

        while (answer.equals("Yes") || answer.equals("Y")){
            higthAndLow();

            System.out.println("Do you pretend to try again? Write (Y)es");
            answer = sc.next();
    
        }

    }

}
