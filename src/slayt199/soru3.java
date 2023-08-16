package slayt199;

import java.util.Arrays;

//Soru 3-Verilen 2 katli bir array’de her bir ic array’deki elementleri toplayip,
// yeni olusturacagimiz tek katli bir array’e bu toplamlari atayin.
// input :      int[][] arr=  {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}}; output:
// [10, 3, 12, 10, 9]
public class soru3 {
    public static void main(String[] args) {
        int[][] arr=  {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
        int[] yeniArr=new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            int toplam=0;
            for (int j = 0; j <arr[i].length ; j++) {
                toplam+= arr[i][j];
                yeniArr[i]=toplam;
            }
        }
        System.out.println(Arrays.toString(yeniArr));
    }

    }

