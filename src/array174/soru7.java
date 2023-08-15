package array174;

import java.util.ArrayList;
import java.util.Arrays;

//Soru 7-Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
// eski array’e yeni degeri atayin.
public class soru7 {
    public static void main(String[] args) {
        int [] arr={10,20,30,40};
        int sayi=50;
        //elemanEkle(arr,sayi);
        System.out.println(Arrays.toString(elemanEkle(arr,sayi)));
    }

    private static int[] elemanEkle(int[] arr, int sayi) {
       int[] arr1= new int[arr.length+1];
       arr1[arr1.length-1]=sayi;
        for (int i = 0; i <arr.length ; i++) {
            arr1[i]=arr[i];
        }
        return arr1;
    }
}
