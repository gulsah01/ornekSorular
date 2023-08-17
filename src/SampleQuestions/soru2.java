package SampleQuestions;

import java.util.Scanner;

/*
Soru-2)   SOUT/SYSO
Dikdortgenin alanini ve cevresini hesaplayan kodu yaziniz.
Ipuclari:
* Dikdortgenin Cevresi: 2 * (uzun kenar + kisa kenar)
* Dikdortgenin Alani : uzun kenar * kisa kenar
 */
public class soru2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin uzun kenarini giriniz:");
        double uzunKenar=scanner.nextDouble();
        System.out.println("Lutfen dikdortgenin kisa kenarini giriniz");
        double kisaKenar=scanner.nextDouble();
        double dikdortgeninCevresi=2*(uzunKenar+kisaKenar);
        double dikdortgeninAlani=uzunKenar*kisaKenar;
        System.out.println("Dikdortgenin Cevresi: "+dikdortgeninCevresi);
        System.out.println("Dikdortgenin Alani: "+dikdortgeninAlani);


    }
}
