package array174;

import java.util.Arrays;

//Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method
//olusturun. Eski array’i yeni haliyle kaydedin.
public class soru11 {
    public static void main(String[] args) {
        int [] arr={10,20,30,40,50,60,70};
        System.out.println(Arrays.toString(elementiIkiArtir(arr)));
    }

    private static int[] elementiIkiArtir(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=arr[i]+2;

        }
        return arr;
    }

}
