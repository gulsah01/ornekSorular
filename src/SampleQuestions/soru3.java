package SampleQuestions;

import java.util.Scanner;

/*
Soru 3-)   SCANNER
Kullanicidan 5 tane sayi alin,alinan bu sayilarin ortalamasini hesaplayan java kodunu yaziniz.
 */
public class soru3 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ortalamasini almak istediginiz 5 sayiyi  giriniz");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();
        int sayi3=scan.nextInt();
        int sayi4=scan.nextInt();
        int sayi5=scan.nextInt();
        System.out.println("Girdiginiz 5 sayinin ortalamasi: "+(sayi1+sayi2+sayi3+sayi4+sayi5)/5);







    }
}