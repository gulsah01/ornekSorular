package temmuz19_while_loop;

import java.util.Scanner;

public class slayt150_soru4 {
    public static void main(String[] args) {

     /*Soru 4- Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
        Kullaniciya bitirmek istediginde 0'a basmasini soyleyin
        Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdigini ve
        bunlarin toplaminin kac oldugunu yazdirin
        Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin bu
        negatif sayiyi sayi adedine ve toplama eklemeyin

         */

        Scanner scanner=new Scanner(System.in);
        int number=1;
        int sayac=0;
        int total=0;
        while (number!=0){
            System.out.println("Sayilari giriniz:\n Bitirmek icin 0 a basiniz");
            number=scanner.nextInt();

            if (number>0){
                sayac++;
                total += number;
            } else if (number<0) {
                System.out.println("Negatif sayi kullanamazsiniz");
            }
        }
        System.out.println(sayac+" sayinin toplami :"+total);
    }


}
