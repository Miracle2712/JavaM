package vonglapJava;

import java.util.Scanner;

public class lap2 {

    public static void main(String[] args) {
        double tien = 1.0;
        int thang = 1;
        double laisuat = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số tiền: ");
        tien = input.nextDouble();
        System.out.println("Nhập tháng: ");
        thang = input.nextInt();
        System.out.println("Nhập tỉ lệ lãi suất: ");
        laisuat = input.nextDouble();
        double tongLai = 0;
        for(int i = 0; i < thang; i++){
            tongLai += tien * (laisuat/100)/12 * thang;
            System.out.println("Lãi suất " + tongLai);
        }
    }
}