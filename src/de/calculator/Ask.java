package de.calculator;

import java.util.Scanner;

public class Ask {

    static int choose;
    static double firstNumber;
    static double secondsNumber;

    public static void message() {
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);

        System.out.println("Was wollen sie berechnen?\n\n Addieren (1) \n Subtrahieren (2) \n Multiplizieren (3) \n Dividieren (4) \n");
        choose = scan.nextInt();

        System.out.println("Ihre erste Zahl?");
        firstNumber = scan.nextInt();
        System.out.println("Ihre zweite Zahl?");
        secondsNumber = scan.nextInt();

        for (int i = 0; i < 100; i++) {
            System.out.println(" ");
        }

        switch (choose) {
            case 1:
                System.out.printf("Ihr Ergebnis: %f", calc.add(firstNumber, secondsNumber));
                break;
            case 2:
                System.out.printf("Ihr Ergebnis: %f", calc.remove(firstNumber, secondsNumber));
                break;
            case 3:
                System.out.printf("Ihr Ergebnis: %f", calc.multiple(firstNumber, secondsNumber));
                break;
            case 4:
                System.out.printf("Ihr Ergebnis: %f", calc.divide(firstNumber, secondsNumber));
                break;
            default:
                System.out.println("Sie haben eine falsche Option ausgewählt.");
                break;
        }
    }
}
