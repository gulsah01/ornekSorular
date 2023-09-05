package forEachLoop_214;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
5- Verilen iki array’in elementlerini karsilastirip, ikisinde ortak olan elementleri
ayri bir liste olarak veren bir program yazin.
 */
public class soru5 {
    public static void main(String[] args) {
        int[] sayi1={1,3,5,7,9,12,15};
        int[]  sayi2={2,3,4,5,12,22,7};
        ArrayList<Integer> ortakList=new ArrayList<>();

        for (int each1:sayi1
             ) {
            for (int each2:sayi2
                 ) {
if (each1==each2 && !ortakList.contains(each1)){
    ortakList.add(each1);
}
            }
        }
        Collections.sort(ortakList);
        System.out.println(ortakList);

    }
}
