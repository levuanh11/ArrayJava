package ChangeF_C;

import java.util.Scanner;

public class ChangeF_C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double doF;
        double doC;
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Độ F");
            System.out.println("2. Độ C");
            choice = input.nextInt();


            switch (choice) {
                case 1:
                    System.out.println("Nhập độ F");
                    doF = input.nextDouble();
                    System.out.println("doC = " + fToC(doF));
                    break;
                case 2:
                    System.out.println("Nhập độ C");
                    doC = input.nextDouble();
                    System.out.println("doF = " + cToF(doC));
                    break;
                default:
                    System.out.println("idiot");
            }
        } while (choice != 0);

    }


    public static double fToC(double doF) {
        double doC = (5.0 * 9) - (doF - 32);
        return doC;
    }

    public static double cToF(double doC) {
        double doF = (9.0 / 5) * doC + 32;
        return doF;
    }
}

