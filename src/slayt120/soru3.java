package slayt120;

import java.util.Scanner;

public class soru3 {
    /*Kullanicidan alinan metindeki istenmeyen rakam ve ozel karakterleri silip,
    sadece ilk harfi buyuk diger harfler kucuk harf yapan bir program yazin.
    input : java1 ogRe2@nMek3 #ne +Gu=zel
    output : Java ogrenmek ne guzel.

     */

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz ");
        String metin =scanner.nextLine();

        metin=metin.replaceAll(" ","_");
        metin=metin.replaceAll("\\d","");
        metin=metin.replaceAll("\\W","");
        metin=metin.replaceAll("_"," ");
        metin=metin.substring(0,1).toUpperCase()+metin.substring(1).toLowerCase();

        System.out.println(metin);







    }


}
