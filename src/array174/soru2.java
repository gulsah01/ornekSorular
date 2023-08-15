package array174;
//Soru 2-Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir method yaziniz.
public class soru2 {
    public static void main(String[] args) {
        int[] arr={10,20,30,40};
        //arrayToplam(arr);
        System.out.println(arrayToplam(arr));
    }

    private static int arrayToplam(int[] arr) {
        int toplam=0;
        for (int i = 0; i <arr.length ; i++) {
            toplam+=arr[i];

        }
        return toplam;
    }
}