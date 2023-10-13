package array174;

import java.util.Arrays;

public class soru1 {
    //Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method
    //olusturun. Eski array’i yeni haliyle kaydedin.
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4,};
        arr = yeniHali(arr);

        System.out.println(Arrays.toString(arr));
    }


    public static int[] yeniHali(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=arr[i]+2;

        }

        return arr;
    }


}
