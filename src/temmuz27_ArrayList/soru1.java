package temmuz27_ArrayList;

import java.util.Arrays;

public class soru1 {
    public static void main(String[] args) {
        // Soru 1- Verilen bir array’de tekrar eden elementler icin,
        // mukerrer olanlari silip,
        // tum elemanlardan sadece 1 tane yapip bize dondurecek bir method olusturun.


        int[] arr = {1, 9, 2, 2, 3, 3, 4, 4, 1, 5, 6, 7, 8, 8, 9};

        int[] newArr = removeDublicates(arr);
        for (int each : newArr
        ) {
            System.out.print(each + " ");
        }
    }

    public static int[] removeDublicates(int[] arr) {
       int number = arr.length;
       if (number==0 || number==1){
           return arr;
       }

       Arrays.sort(arr);
       int unigueCount = 1;
        for (int i = 1; i <number ; i++) {
            if (arr[i] !=arr[i-1]){
                unigueCount++;
            }

        }
        int[] newArr = new int[unigueCount];
        newArr[0]=arr[0];

        int newIndex=1;
        for (int i = 1; i <number ; i++) {

            if (arr[i]!=arr[i-1]){
                newArr[newIndex]=arr[i];
                newIndex++;

            }
        }
        return newArr;
    }
}

