package temmuz19_while_loop;

public class slayt150_soru3 {
    public static void main(String[] args) {
        //  Soru 3- While loop kullanarak verilen bir String’i terse cevirip,
        //  bu halini bize donduren bir method olusturun.

        System.out.println(terstenMetinYazdirma("yusuf"));
    }

    public static String terstenMetinYazdirma(String metin) {
        String tersMetin = "";
        int uzunluk = metin.length()-1 ;
        System.out.println(uzunluk);
        while (uzunluk >= 0) {
            tersMetin += metin.charAt(uzunluk);
            uzunluk--;
        }
        return tersMetin;
    }

}


