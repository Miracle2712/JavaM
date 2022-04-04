import java.util.Scanner;

public class Java2 {
    public static void main(String[] args) {
        String[] arr = {"hello", "xin", "chao", "bro"};
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Tên Học Sinh là ");
        String nhap = Scanner.nextLine();{
           for (int i = 0 ; i<arr.length ; i++)
            if(arr[i].equals(nhap)){
                System.out.println("Tên học sinh là " + nhap + " vị trí" + i);
            }
        }
    }
}
