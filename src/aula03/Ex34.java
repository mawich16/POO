package aula03;

import java.util.Random;
import java.util.Scanner;

import utils.UserInput;

public class Ex34 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int num_students;
        double gradeT;
        double gradeP;
        double finalGrade;

        System.out.print("what is the number os students? ");
        num_students = sc.nextInt();
        
        double [][] grades = new double[num_students][3];

        // ciclo para meter la as notas e as notas finais
        gradeT = r.nextDouble(20);
        gradeP = r.nextDouble(20);
        finalGrade = UserInput.grades(gradeT, gradeP);


        sc.close();
    }

}
