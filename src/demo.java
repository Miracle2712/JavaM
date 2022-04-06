public class demo {
    public static void main(String[] args) {
        int[] a = {5,7,8,9,10};
        int[] b = new int[6];
        for (int i = 0; i < a.length; i++) {
            if(i<5){
                b[i]=a[i];
            }
            b[5]=15;
        }

        System.out.println("\nArray after adding element is: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(b[i] +" ");
        }
    }
}