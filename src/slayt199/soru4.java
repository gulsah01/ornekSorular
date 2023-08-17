package slayt199;
import java.util.Arrays;
//Soru 4-Verilen 2 katli bir array’de bulunan
// tum sayilarin carpimini bize donduren bir method olusturun.
public class soru4 {
    public static void main(String[] args) {
        int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
        System.out.println(sayilarinCarpiminibul(arr));
    }
    private static int sayilarinCarpiminibul(int[][] arr) {
        int carpim=1;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                carpim*=arr[i][j];
            }
        }
        return carpim;
    }
}
