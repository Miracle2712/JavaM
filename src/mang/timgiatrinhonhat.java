package mang;

public class timgiatrinhonhat {

    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        int index = timMin(arr);
        System.out.println("số nhỏ nhất là : " + arr[index]);
    }

    public static int timMin(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}