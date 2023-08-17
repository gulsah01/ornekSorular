package SampleQuestions;

import java.util.Scanner;

public class soru4
{
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir sayı alın ve aldiginiz bu sayının küpünün yarısını konsola yazdırin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz: ");
        int sayi =scan.nextInt();

        System.out.println("Girilen sayinin kupu:"+(sayi*sayi*sayi)/2);

    }
}
