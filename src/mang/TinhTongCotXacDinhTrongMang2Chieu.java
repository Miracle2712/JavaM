package mang;

import java.util.Scanner;

public class TinhTongCotXacDinhTrongMang2Chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bạn muốn nhập bao nhiêu hàng: ");
        int row = sc.nextInt();
        System.out.print("Bạn muốn nhập bao nhiêu cột: ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Nhập phần tử của hàng " + i + " cột " + j + ": ");
                int inp = sc.nextInt();
                arr[i][j] = inp;
            }
        }
        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.print("\n");
        }
        int n = 0;
        do {
            System.out.print("Nhập cột cần tính: ");
            n = sc.nextInt();
        } while (n >= col && n < 0);
        int sum = 0;
        for (int[] ints : arr) {
            sum += ints[n];
        }
        System.out.print("Tổng cột " + n + ": " + sum);
    }
}