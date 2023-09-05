package forEachLoop_214;
/*
Soru 2- Verilen int array’deki her elementin karelerini alip, karelerinin toplamini
yazdiran bir method olusturun.
 */
public class soru2 {
    public static void main(String[] args) {
        int[] arr = {2, 3};

        kareleriToplami(arr);
    }
    private static void kareleriToplami(int[] arr) {
        int toplam = 0;

        for (int each : arr
        ) {
            toplam += each * each;

        }
        System.out.println(toplam);
    }

}
