package LopVaHuongDoiTuong;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Chiều rộng: ");
        double width = scanner.nextDouble();
        System.out.print("Chiều dài: ");
        double height = scanner.nextDouble();
        Hcn hcn = new Hcn(width, height);

        System.out.println("Hình chữ nhật \n"+ hcn.display());
        System.out.println("Chu vi: "+ hcn.getchuVi());
        System.out.println("Diện tích: "+ hcn.getdienTich());
    }
}