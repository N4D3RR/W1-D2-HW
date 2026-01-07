package es2;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("scrivi un numero tra 0 e 3");
        int number = Integer.parseInt(sc.nextLine());
        switch (number) {
            case 0: {
                System.out.println("zero");
                break;
            }
            case 1: {
                System.out.println("uno");
                break;
            }
            case 2: {
                System.out.println("due");
                break;
            }
            case 3: {
                System.out.println("tre");
                break;
            }
            default: {
                System.out.println("inserisci un numero tra 0 e 3");
            }
        }

    }
}