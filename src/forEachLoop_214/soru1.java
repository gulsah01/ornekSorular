package forEachLoop_214;
import java.util.ArrayList;
/*
Soru 1- Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
elemanlardan sadece 1 tane yapip eski array’e yeni halini atayip yazdirin.
 */
public class soru1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 4, 5, 5, 7, 7, 9, 9, 0, 0,};
        ArrayList<Integer> yeniList=new ArrayList<>();
        for (int each:arr
             ) {
            if (!(yeniList.contains(each))){
                yeniList.add(each);
            }
        }
        System.out.println(yeniList);
    }
}
