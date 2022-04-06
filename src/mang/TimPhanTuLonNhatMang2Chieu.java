package mang;

public class TimPhanTuLonNhatMang2Chieu {
    public static void main(String[] args) {
        int [][] arr ={
                {1,2,3,4},
                {5,6,7,8},
        };
        int max=0;
        for (int i = 0;i<arr.length;i++){
            max=arr[0][0];
            for (int j=0;j<arr[i].length;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        System.out.println(max);

    }

}