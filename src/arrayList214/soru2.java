package arrayList214;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Soru 2-Kullanicidan istedigi kadar isim alip,
// Q’ya bastiginda girdigi isimleri bize liste olarak dondurecek bir method olusturun.
public class soru2 {
    public static void main(String[] args) {
        System.out.println(listOlustur());}

    public static List<String> listOlustur(){
        String girilenIsim;
        List<String> isimList = new ArrayList<>();
        do{
            Scanner scanner=new Scanner(System.in);
            System.out.println("Listeye eklemek icin isim giriniz:" +
                    ",\nBitirmek icin q ya basiniz");
            girilenIsim =scanner.nextLine();
            if (!girilenIsim.equalsIgnoreCase("Q")){
                isimList.add(girilenIsim);
            }
        }while (!girilenIsim.equalsIgnoreCase("q"));

        return isimList;
    }
    }




