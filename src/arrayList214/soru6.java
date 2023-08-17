package arrayList214;

import java.util.ArrayList;

//6-Verilen pozitif bir tamsayiyi,
 // tam bolebilen tum pozitif tamsayilari bir liste olarak bize donduren bir method olusturun.
public class soru6 {
     public static void main(String[] args) {
         int sayi = 300;
         System.out.println(tamBolen(sayi));
     }
     private static ArrayList<Integer> tamBolen(int sayi) {
         ArrayList<Integer> tamBolenSayisi =new ArrayList<>();
         for (int i =1 ; i <=sayi ; i++) {
             if (sayi%i==0){
                 tamBolenSayisi.add(i);
             }
         }
         return tamBolenSayisi;
     }
 }