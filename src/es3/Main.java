package es3;


import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("scrivi una stringa");
        while (true) {
            String input = sc.nextLine();
            if (input.equals(":q")) {
                break;
            }
        }

    }
}
