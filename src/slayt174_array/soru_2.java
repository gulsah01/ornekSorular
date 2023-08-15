package slayt174_array;

public class soru_2 {
    public static void main(String[] args) {
        //Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
        //method yaziniz.
        int[] arr = {10, 20, 30, 40, 50};
        toplam(arr);
    }

    public static void toplam(int[] arr) {
        int toplam = 0;
        for (int each : arr
        ) {
            if (each > 0)
                toplam += each;

        }
        System.out.println(toplam);;

    }
}