package temmuz27_eachLoop;

import java.util.ArrayList;
import java.util.List;

public class soru1 {
    public static void main(String[] args) {
        //Soru 1- Verilen bir array’de tekrar eden elementler icin,
        // mukerrer olanlari silip,
        // tum elemanlardan sadece 1 tane yapip eski array’e yeni halini atayip yazdirin.

        int [] arr ={1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,0,0};

        int[] yeniarr = tekrarlariSil(arr);
        System.out.print("Yeni array listesi :");
        for (int each:yeniarr
             ) {
            System.out.print(each + " ");
        }
    }

    private static int[] tekrarlariSil(int[] arr) {
        List<Integer> list=new ArrayList<>();

        for (int each:arr
             ) {
            if (!list.contains(each)){
                list.add(each);
            }
        }
        int[] yeniarr= new int[list.size()];
        for (int i = 0; i <list.size() ; i++) {
            yeniarr[i]=list.get(i);
        }
        return yeniarr;
    }
}
