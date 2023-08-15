package array174;

import java.util.Arrays;
import java.util.Scanner;

//Soru 5-Kullanicidan array’in boyutunu ve elementlerini alip
// array’i olusturan ve bize donduren bir method olusturun.
public class soru5 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayOlustur()));

    }

    private static int[] arrayOlustur() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen olusturmak istediginiz arrayin boyutunu giriniz: ");
        int lenght=scanner.nextInt();
        int[] arr=new int[lenght];
        for (int i = 0; i <lenght ; i++) {
            System.out.println("Tamsayi giriniz");
            arr[i]=scanner.nextInt();
        }
        return arr;
    }


}
