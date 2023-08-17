package arrayList214;

import java.util.ArrayList;
import java.util.List;

//Soru 4-Verilen pozitif bir n tamsayisini alarak,
// bize ilk n tane tane Fibonacci sayisini bir list olarak donduren bir method olusturun.
public class soru4 {
    public static void main(String[] args) {
        fibonacciListesiOlustur(5);

    }public static List<Integer> fibonacciListesiOlustur(int fibonacciSayiAdedi) {
        List<Integer> fibonacciSerisi = new ArrayList<>();
        int ilk = 0;
        int ikinci = 1;
        int temp;
        if (fibonacciSayiAdedi <= 0) {
            System.out.println("Lutfen giciklik yapmayiniz");
            return fibonacciSerisi;
        } else if (fibonacciSayiAdedi == 1) {
            fibonacciSerisi.add(ilk);
            return fibonacciSerisi;
        } else {
            fibonacciSerisi.add(ilk);
            fibonacciSerisi.add(ikinci);
            for (int i = 1; i <= fibonacciSayiAdedi - 2; i++) {
                fibonacciSerisi.add(ilk + ikinci);
                temp = ilk + ikinci;
                ilk = ikinci;
                ikinci = temp;
            }
            return fibonacciSerisi;
        }
    }}
