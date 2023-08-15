package Slayt150;

import java.util.Scanner;

public class soru3slayt153 {
    public static void main(String[] args) {
       /* Soru 3- Kullanicidan bir pozitif sayi isteyin, sayının tam kare olup olmadığını
        bulunuz, tamkare ise true değilse false yazdırınız.
                Ornek : input : 16, output: 4

        */
        Scanner scanner;
        int sayi;
        boolean b = false;
        do {
            scanner = new Scanner(System.in);
            System.out.println("lutfen bir sayi girin");
            sayi = scanner.nextInt();
            for (int i = 1; i <= sayi; i++) {
                if (sayi / i == i) {
                    b = true;
                }
            }
            if (b==true) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        } while (b == true);


    }
}
