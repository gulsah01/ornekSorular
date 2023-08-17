package SampleQuestions;

import java.util.Scanner;

/*
Soru 9-)  Girilen zamanı saniyeye çeviriniz.
               Örnek: 2 saat 3 dakika 10 saniye ==>	 7390 saniye
         Ipucu:
         Saati alıp saniyeye cevirebilirsiniz.
 */
public class soru9 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen saniyeye cevirmek istediginiz saati,dakikayi, saniyeyi sirasiyla giriniz : ");
        int saat=scan.nextInt();
        int dakika=scan.nextInt();
        int saniye =scan.nextInt();
        System.out.println("Saati: "+saat+" saat:"+dakika+" dakika:"+saniye+" saniye olarak girdiniz");
        int toplam=0;
        toplam=saniye+(dakika*60)+(saat*3600);
        System.out.println("Girilen saatin saniyeye cevrilmis hali : "+toplam+" saniyedir.");

    }
}
