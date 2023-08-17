package arrayList214;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Soru 5-Kullanicidan pozitif bir tamsayi alip,
 o tamsayidan kucuk Fibonacci sayilarini bir liste olarak bize donduren bir method olusturun.
 */
public class soru5 {
    public static
    List<Integer> fibonacciList(int sayi) {
        List<Integer> fibonacciList = new ArrayList<>();
        int ilkSayi = 0;
        int ikinciSayi = 1;
        while (ilkSayi< sayi) {
            fibonacciList.add(ilkSayi);
            int temp = ikinciSayi;
            ikinciSayi = ilkSayi+ ikinciSayi;
            ilkSayi = temp;
        }
        return fibonacciList;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pozitif bir tamsayı girin: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Lütfen pozitif bir tamsayı girin.");
        } else {
            List<Integer> result = fibonacciList(number);
            System.out.print(number + " sayısından küçük Fibonacci sayıları: ");
            for (int fib : result) {
                System.out.print(fib + " ");
            }
        }
    }

}