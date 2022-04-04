package Jame;

import java.util.Scanner;

public class ptbac1 {

    public static void main(String[] args) {
        System.out.println("pt bậc nhất");
        System.out.println("pt bậc nhất là 'a * x + b = c ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();

        System.out.print("c: ");
        double c = scanner.nextDouble();
        if (a != 0) {
            double dapan = (c - b) / a;
            System.out.printf("pt có nghiệm x = %f!\n", dapan);
        } else {
            if (b == c) {
                System.out.print("pt có nghiệm");
            } else {
                System.out.print("pt vô nghiệm");
            }
        }
    }
}