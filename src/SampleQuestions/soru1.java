package SampleQuestions;

import java.util.Scanner;

/*
Soru 1-)   SOUT/SYSO
Dairenin alanini ve cevresini hesaplayan java kodu yaziniz.
Ipuclari:
* r=7;
* Pi=3.14
* Dairenin Cevresi : 2*Pi*r
* Dairenin Alani : Pi*r*r
 */
public class soru1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen olusturmak istediginiz dairenin yaricapini  giriniz:");
        double yaricap=scanner.nextDouble();
        double  pi=3.14;
        double daireninCevresi=2*pi*yaricap;
        double daireninAlani=pi*yaricap*yaricap;

        System.out.println("Dairenin Cevresi: "+daireninCevresi);
        System.out.println("Dairenin Alani: "+daireninAlani);

    }

}
