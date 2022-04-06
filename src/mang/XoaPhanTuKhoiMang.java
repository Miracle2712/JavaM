package mang;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số cần xóa: ");
        int inp = sc.nextInt();
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == inp) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Phần tử cần xóa không có trong mảng");
        }
        else {
            int[] temp = new int[arr.length-1];
            for (int i = 0; i < index; i++) {
                temp[i] = arr[i];
            }
            for (int i = index; i < temp.length; i++) {
                temp[i] = arr[i+1];
            }
            arr = temp;
            for (int i : arr) {
                System.out.print(i + "\t");
            }
        }
    }
}