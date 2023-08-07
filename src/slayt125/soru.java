package slayt125;

import java.util.Scanner;

public class soru {
    public static void main(String[] args) {
       // Soru - Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf
        // olarak yazdirin, yoksa girilen harfi yazdirin.
        /*Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char girilenHarf=scanner.next().charAt(0);

        if (Character.isLowerCase(girilenHarf)){
            char buyukHarf = Character.toUpperCase(girilenHarf);
            System.out.println(buyukHarf);
        }else {
            System.out.println(girilenHarf);/

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        char karakter = scan.next().charAt(0);
        if (Character.isUpperCase(karakter)) {
            System.out.println("Girdiginiz harf: " + karakter);
        } else {
            System.out.println("Kucuk girilen harf buyuk harfe donusturulmustur : " + Character.toUpperCase(karakter));


        }




        }



    }

