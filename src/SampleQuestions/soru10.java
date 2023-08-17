package SampleQuestions;

import java.util.Scanner;

/*
Soru 10-)  Klasik Soru :
                    Kullanıcıdan kilosunu ve boyunu isteyin ve kütleyi hesaplayan bir program yazın
		 **indeks Hesaplama: İPUCU : Vücut Kitle İndeksi = Ağırlık (kg) / Boy uzunluğunun karesi (m) // If konusunu hatırlayın!***
                   Kullanıcıya aşağıdaki gibi mesaj verin
                    Eğer VKİ 18.5'ten az ise --> zayıfsınız
                    Eğer VKİ 18.5 ile 25 arasında ise --> kilo idealdir
                    Eğer VKİ 25 ila 30 arasındaysa --> şişmansınız
                    VKİ 30'a eşit veya daha fazlaysa --> agam obezsin, diyet yap!  */
public class soru10 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen boyunuzu giriniz: ");
        double kilo= scan.nextDouble();;
        System.out.println("Lutfen kilonuzu giriniz: ");
        double boy=scan.nextDouble();
        double vkIndexi = kilo*10000/(boy*boy);

        if (vkIndexi>=30){
            System.out.println("Vücut kitle endeksiniz: "  +vkIndexi+ "Agam obezsin, diyet yap!");
        } else if (vkIndexi>=25) {
            System.out.println("Vücut kitle endeksiniz: "  +vkIndexi+"Sişmansınız ");
        } else if (vkIndexi>=18.5) {
            System.out.println("Vücut kitle endeksiniz: "  +vkIndexi+"Kilo idealdir");
        }  else {
            System.out.println("Vücut kitle endeksiniz: "  +vkIndexi+"Zayıfsınız");
        }
    }
}
