package Slayt150;

import java.util.Scanner;

public class ornek3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi = scanner.nextInt();
        boolean bl = false;

        for (int i = 1; i * i <= sayi; i++) {
            if (i * i == sayi) {
                bl = true;
                break;
            }
        }

        System.out.println(bl);

    }
}
