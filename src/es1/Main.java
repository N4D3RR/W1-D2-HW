package es1;

import java.util.Scanner;

public class Main {
    public static boolean PariDispari(String input) {
        if (input.length() % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean annoBisestile(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("scrivi una parola");
        String stringa = sc.nextLine();

        if (PariDispari(stringa)) {
            System.out.println("è pari");
        } else System.out.println("è dispari");


        System.out.println("scrivi un anno");
        int year = Integer.parseInt(sc.nextLine());
        if (annoBisestile(year)) System.out.println("è bisestile");
        else System.out.println("non è bisestile");

    }
}
