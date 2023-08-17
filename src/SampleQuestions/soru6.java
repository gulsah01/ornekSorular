package SampleQuestions;

import java.util.Scanner;

/*
Soru 6-)  Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun.
 Yılda kaç çay içtigini ve kaç kg şeker kullandığını hesaplayın ve bunları ekranda yazdırın.
 1 şeker = 1.5 gr
1 kg = 1000 gram      olarak hesaplayın.
 */
public class soru6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gunde kac bardak cay ictiginizi giriniz: ");
        int bardak=scan.nextInt();
        System.out.println("Lutfen bir  bardak cayda kac seker kullandiginizi giriniz: ");
        double seker=scan.nextDouble();
        System.out.println("Bir yilda tuketilen cay miktari "+bardak*365+" bardak olarak hesaplanmistir.");
        System.out.println("Bir yilda tuketilen seker miktari "+(seker*365)/1000+" kg olarak hesaplanmistir.");



    }


}

