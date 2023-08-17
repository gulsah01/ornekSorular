package SampleQuestions;

import java.util.Scanner;

/*
Kullanıcıdan karenin kenar uzunluğunu alın. Aldiginiz uzunluklarla karenin alanını ve çevresini hesaplayan kodu yazın.
Ipuclari:
Google yaparak karenin alaninin ve cevresinin nasil bulundugunu ögrenin :-)
 */
public class soru5 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen karenin kenar uzunlugunu giriniz: ");
        int kenar=scanner.nextInt();
        System.out.println("Karenin alani: "+kenar*kenar);
        System.out.println("Karenin cevresi: "+kenar*4);
    }

}
