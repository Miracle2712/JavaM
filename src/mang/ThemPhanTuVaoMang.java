package mang;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số cần chèn: ");
        int x = sc.nextInt();
        System.out.print("Nhập vị trí cần chèn: ");
        int index = sc.nextInt();
        int[] temp = new int[arr.length+1];
        for (int i = 0; i < index; i++) {
            temp[i] = arr[i];
        }
        temp[index] = x;
        for (int i = index; i < arr.length; i++) {
            temp[i+1] = arr[i];
        }
        arr = temp;
        for (int i: arr) {
            System.out.print(i + "\t");
        }
    }
}