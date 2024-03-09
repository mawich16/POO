package aula04;

import java.util.Scanner;

class Car {
    public String make;
    public String model;
    public int year;
    public int kms;

    public Car(String make, String model, int year, int kms) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.kms = kms;
    }

    public void drive(int distance) {
        this.kms += distance;
    }

}

public class Ex44 {

    static Scanner sc = new Scanner(System.in);

    static int registerCars(Car[] cars) {
        System.out.println("Insira dados do carro (marca modelo ano quilômetros):");
        int numCars = 0;
        while (numCars < cars.length) {
            String input = sc.nextLine();
            if (input.isEmpty())
                break;
    
            String[] tokens = input.split(" ");
            if (tokens.length < 4) {
                System.out.println("Dados mal formatados. Tente novamente.");
                continue;
            }
    
            String make = tokens[0];
            int year;
            int kms;
    
            String model = tokens[1];
            for (int i = 2; i < tokens.length - 2; i++) {
                model += " " + tokens[i];
            }
            year = Integer.parseInt(tokens[tokens.length - 2]);
            kms = Integer.parseInt(tokens[tokens.length - 1]);
    
            cars[numCars] = new Car(make, model, year, kms);
            numCars++;
        }
        return numCars;
    }

    static void registerTrips(Car[] cars, int numCars) {
        System.out.println("Registe uma viagem no formato \"carro:distância\":");
        while (true) {
            String input = sc.nextLine();
            if (input.isEmpty())
                break;
    
            String[] parts = input.split(":");
            if (parts.length != 2) {
                System.out.println("Dados mal formatados. Tente novamente.");
                continue;
            }
    
            int carIndex;
            int distance;
    
            try {
                carIndex = Integer.parseInt(parts[0]);
                distance = Integer.parseInt(parts[1]);
            } catch (NumberFormatException e) {
                System.out.println("Índice do carro e distância devem ser números inteiros. Tente novamente.");
                continue;
            }
    
            if (carIndex < 0 || carIndex >= numCars || cars[carIndex] == null) {
                System.out.println("Carro inválido. Tente novamente.");
                continue;
            }
    
            cars[carIndex].drive(distance);
        }
    }


    static void listCars(Car[] cars) {
        System.out.println("\nCarros registados:");
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null) {
                System.out.println(cars[i].make + " " + cars[i].model + ", " + cars[i].year + ", kms: " + cars[i].kms);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Car[] cars = new Car[10];

        int numCars = registerCars(cars);

        if (numCars>0) {
            listCars(cars);
            registerTrips(cars, numCars);
            listCars(cars);
        }

        sc.close();

    }
}