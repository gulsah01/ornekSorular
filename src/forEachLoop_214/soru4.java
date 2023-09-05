package forEachLoop_214;

import java.util.Scanner;

/*
Soru 4- Kullanicidan bir cumle ve bir harf alin, harf cumlede kullanilmissa kac kere
kullanildigini yazdirin, kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.
 */
public class soru4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz:  ");
        String cumle=scan.nextLine();

        System.out.println("Lutfen bir harf giriniz: ");
        String harf=scan.next();
        String[] cumleArr = cumle.split("");
        int counter=0;
        for (String each:cumleArr
             ) {
            if (each.equals(harf)){
                counter++;
            }
        }
        if (counter==0){
            System.out.println("Aradigin harf yoktur");
        }else {
            System.out.println("Aradigin harf "+counter+" kere var");
        }
    }


}
