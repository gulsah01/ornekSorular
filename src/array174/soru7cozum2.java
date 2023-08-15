package array174;

import java.util.Arrays;
import java.util.Scanner;

//Soru 7-Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
// eski array’e yeni degeri atayin.
public class soru7cozum2 {
    public static void main(String[] args) {
        elemanEkle();

    }

    private static void elemanEkle() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen olusturmak istediginiz arrayin boyutunu girin");
        int boyut=scan.nextInt();
        int[] arr=new int[boyut];
        for (int i = 0; i <boyut ; i++) {
            System.out.println("Lutfen element giriniz: ");
            arr[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Lutfen eklemek istediginiz elementi giriniz");
        int sayi=scan.nextInt();
        int[] arr1=new int[arr.length+1];
        arr1[arr1.length-1]=sayi;
        for (int i = 0; i <arr.length ; i++) {
            arr1[i]=arr[i];

        }
        System.out.println(Arrays.toString(arr1));
    }

}
