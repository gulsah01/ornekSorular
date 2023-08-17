package arrayList214;

import java.util.ArrayList;

//Soru 1-Verilen bir array’de tekrar eden elementler icin,
// mukerrer olanlari silip,
// tum elemanlardan  sadece 1 tane yapip bize dondurecek bir method olusturun.
public class soru1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 4, 5, 5, 7, 7, 9, 9, 0, 0,};
        ayniElemaniSil(arr);
    }

    private static void ayniElemaniSil(int[] arr) {
        ArrayList<Integer> yeniList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!yeniList.contains(arr[i])) {
                yeniList.add(arr[i]);
            }
        }
        System.out.println(yeniList);
    }
}