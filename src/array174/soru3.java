package array174;

import java.util.Arrays;

//Soru 3-Verilen bir array’deki tum elementleri bir saga kaydirip,
// sondaki elementi de basa tasiyacak bir method olusturun,
// array’i yeni haliyle kaydedin.
// Orn :  input : [4,5,6,7]   array’in son hali. : [7,4,5,6]
public class soru3 {
    public static void main(String[] args) {
        int [] arr={4,5,6,7};
       //sagaKaydir(arr);
        System.out.println(Arrays.toString(sagaKaydir(arr)));
    }

    public static int[] sagaKaydir(int[] arr) {
        int [] arr2=new int [arr.length];
        arr2[0]=arr[arr.length-1];
        for (int i = 0; i < arr.length-1; i++) {
            arr2[i+1]=arr[i];


        }
        return arr2;
    }
}
