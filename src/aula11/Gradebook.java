package aula11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Gradebook {

    HashSet <Student> students = new HashSet<>();

    public void load (String file) throws FileNotFoundException {
        Scanner input = new Scanner(new FileReader(file));

        input.useDelimiter("(\\||[\\r\\n]+)");

        while (input.hasNext()) {
            String nome = input.next();
            Double grade1 = input.nextDouble();
            Double grade2 = input.nextDouble();
            Double grade3 = input.nextDouble();

            List<Double> grades = new ArrayList();
            grades.add(grade1); grades.add(grade2); grades.add(grade3);
            students.add(new Student(nome,grades));

            input.nextLine();
        }

        input.close();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(String name) {
        students.remove(name);
    }

    public Student getStudent(String name) {
            for (Student s : students) {
                if(s.getName().equals(name)) {
                    return s;
                }
            }
        return null;
    }

    public double calculateAverageGrade(String name) {
        Student student = getStudent(name);
        List<Double> studentsGrades = student.getGrades();
        double sum = 0;
        for(int i=0; i<3; i++) {
            double grade = studentsGrades.get(i);
            sum += grade;
        }
        return sum/3;
    }

    public String printAllStudents() {
        for (Student s : students) {
            return s.toString();
        }
        return null;
    }

}
