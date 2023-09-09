import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class soru_tekrar {
    public static void main(String[] args) {
        /*
5- Verilen iki array’in elementlerini karsilastirip, ikisinde ortak olan elementleri
ayri bir liste olarak veren bir program yazin.
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("bir isim ve karakter giriniz");
        String isim = scan.nextLine();
        char karakter = scan.next().charAt(0);
        int sayac = 0;
        int index = 0;
        while (index <= isim.length()) {
            char k2 = isim.charAt(index);
            if (k2 == karakter) {
                sayac++;
            }
            index++;
        }
        System.out.println(isim);
        System.out.println("aranan karakter :" + karakter);
        System.out.println(sayac + " kere kullanılmıştır");
    }
}