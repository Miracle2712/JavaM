package LopVaHuongDoiTuong;
import java.util.Scanner;
public class Ptb2Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập c: ");
        double c = scanner.nextDouble();
        Ptb2 PhuongTrinh = new Ptb2(a, b, c);

        if (PhuongTrinh.delta()>0){
            System.out.println("nghiệm 1 = " +PhuongTrinh.Nghiem1()+" và nghiệm 2 = "+PhuongTrinh.Nghiem2());
        }else if (PhuongTrinh.delta()==0){
            System.out.println(-PhuongTrinh.getB()/(2* PhuongTrinh.getA()));
        }else {
            System.out.println("Pt vô nghiệm");
        }
    }
}
