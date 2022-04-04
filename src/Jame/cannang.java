package Jame;

import java.util.Scanner;

public class cannang {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("Cân nặng (kg):");
        weight = scanner.nextDouble();

        System.out.print("Chiều cao (m):");
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);
        if (bmi < 18.5) {
            System.out.println("Hơi gầy");
        }
        else if (bmi < 25.0) {
            System.out.println("Bình thường");
        }
        else if (bmi  < 30) {
            System.out.println("Hơi béo");
        }
        else {
            System.out.println("Béo phì");
        }
    }
}