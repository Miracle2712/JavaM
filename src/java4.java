import java.util.Scanner;
public class java4 {
    public static void main(String[] args) {
        int a;
        boolean soNguyenTo = false;
        System.out.println("Nhap vao so nguyen to");
        Scanner so = new Scanner(System.in);
        a=so.nextInt();
        System.out.println("1 2");
        for(int i=3;i<=a;i++){
            soNguyenTo=true;
            for (int j=2;j<i;j++){
                if(i%j==0){
                    soNguyenTo=false;
                }
            }
            if(soNguyenTo==true){
                System.out.println(i+"");
            }
        }
    }
}
