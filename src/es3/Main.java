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
            for (int i = 0; i < input.length(); i++) {
                System.out.println(input.charAt(i));
                if (i < input.length() - 1) {
                    System.out.println(",");
                }

            }
        }

    }
}
