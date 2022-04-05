package vonglapJava;

import java.util.Scanner;

public class songuyento {
    public static void main(String[] args) {
        System.out.print("Nhập số lượng số nguyên tố cần tìm: ");
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();
        int count = 0;
        for (int n = 2; count < inp; n++) {
            boolean flag = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                count += 1;
                System.out.println(n);
            }
        }
    }
}
