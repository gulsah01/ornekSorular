package slayt125;

import java.util.Scanner;

public class soru9 {
    public static void main(String[] args) {

       // Soru 9 (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String metin=scanner.nextLine();


        int lenght=metin.length();
        String tersMetin="";

        for (int i =metin.length()-1; i >= 0; i--) {
            tersMetin+=metin.charAt(i);

        }
        System.out.println(tersMetin);
    }
}
