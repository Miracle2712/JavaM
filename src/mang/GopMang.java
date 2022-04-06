package mang;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử trong mảng 1: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Nhập phần tử thứ " + i + " vào mảng 1: ");
            int inp = sc.nextInt();
            arr1[i] = inp;
        }

        System.out.print("Nhập số phần tử trong mảng 2: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Nhập phần tử thứ " + i + " vào mảng 2: ");
            int inp = sc.nextInt();
            arr2[i] = inp;
        }

        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length + i] = arr2[i];
        }
        for ( int i=0; i< arr3.length; i++) {
            System.out.println(arr3[i]);
        }

    }
}