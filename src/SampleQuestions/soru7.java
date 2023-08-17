package SampleQuestions;

import java.util.Scanner;

/*
Soru 7-)  Kullanicidan Double türünde bir sayi alin. Alinan bu sayiyi tam sayiya cevirerek konsolda yazdirin.
(Istege bagli) Float degerinde bir sayi alin bu sayiyi da short degisken türünde bir sayiya döndürün
ipuclari:
( Data Casting -> Auto Widening ve Explicit Narrowing )
 */
public class soru7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ondalikli bir sayi giriniz: ");
        double sayi=scan.nextDouble();

        int sayi2=(int)sayi ;
        System.out.println("Girilen sayinin tamsayi hali: "+sayi2);




    }
}