package SampleQuestions;
import java.util.Scanner;
/*
Soru-8)  Kullanicidan üc basamaklı bir sayı alin.
               Kullanicidan alinan bu sayinin basamaklari toplamini ekranda yazdirin.
ipuclari:
Matematiksel Islemler konusuna bakalim.
Bölme islemi kullanarak sayinin basamaklarini alalim ve toplam adli bir konteynira (Variable) atalim.
 */
public class soru8 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen uc basamakli bir tamsayi giriniz: ");
        int girilenSayi=scan.nextInt();
        int toplam=0;
        int birlerBasamagi=0;
        birlerBasamagi=girilenSayi%10;
        toplam=birlerBasamagi+toplam;
        girilenSayi=girilenSayi/10;

        birlerBasamagi=girilenSayi%10;
        toplam=birlerBasamagi+toplam;
        girilenSayi=girilenSayi/10;

        birlerBasamagi=girilenSayi%10;
        toplam=birlerBasamagi+toplam;
        girilenSayi=girilenSayi/10;

        System.out.println("Rakamlarin toplami : "+toplam+" dir.");







    }
}
