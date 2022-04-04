package Jame;

import java.util.Scanner;

public class namnhuan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter a year: ");
        year = scanner.nextInt();
        boolean namNhuan = false;

        boolean A = year % 4 == 0;
        if(A){
            boolean B = year % 100 == 0;
            if(B){
                boolean C = year % 400 == 0;
                if(C){
                    namNhuan = true;
                }
            } else {
                namNhuan = true;
            }
        }

        if(namNhuan){
            System.out.printf("%d Năm nhuận", year);
        } else {
            System.out.printf("%d Không phải năm nhuận", year);
        }
    }
}