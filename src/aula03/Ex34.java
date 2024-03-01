package aula03;

import java.util.Random;
import java.util.Scanner;

public class Ex34 {

    private static Double grades(double gradeT, double gradeP) {
        double finalGrade;

        finalGrade = 0.4 * gradeT + 0.6 * gradeP;

        return finalGrade;
    }


    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int num_students;
        double gradeT;
        double gradeP;
        double finalGrade;

        System.out.print("what is the number os students? ");
        num_students = sc.nextInt();
        
        double[] [] grades = new double[num_students][3];
        
        System.out.printf("%10s %10s %10s\n", "NotaT", "NotaP", "Pauta");

        for (double[] i : grades) {
            
            gradeT = Math.round(r.nextDouble(20));
            gradeP = Math.round(r.nextDouble(20));
            

            if (gradeT < 7.0 || gradeP < 7.0) {
                finalGrade = 66;
            }
            else {
                finalGrade = grades(gradeT, gradeP);
            }

            i[0] = gradeT;
            i[1] = gradeP;
            i[2] = finalGrade;

            System.out.printf("%10.1f %10.1f %10.0f\n", i[0], i[1], i[2]);
        }

        sc.close();
    }

}
