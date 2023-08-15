package array174;
//Soru 4-Verilen bir array’de istenen bir elemanin var olup olmadigini
// ve varsa kac kere kullanildigini yazdiran bir method olusturun.
public class soru4 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int sayi=9;
        sayiVarMi(arr,sayi);
    }

    private static void sayiVarMi(int[] arr, int sayi) {
        boolean flag=false;
        int counter=0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==sayi){
                flag=true;
                counter++;
            }
        }
        if (flag==true){
            System.out.println("Istenen sayi: "+sayi+" arrayde " +counter+". kez bulunmaktadir.");
        }else {
            System.out.println("Istenen sayi: "+sayi+" bulunmamaktadir.");
        }
    }
}
