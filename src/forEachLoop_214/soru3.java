package forEachLoop_214;

import java.util.ArrayList;

/*
Soru 3- Verilen String bir array’deki her bir elementi kontrol edip,
- Kelimenin uzunlugu cift sayi ise ilk yarisini
- Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
yeni bir listeye ekleyip yazdirin.
 */
public class soru3 {
    public static void main(String[] args) {
        String[] arr={"Gulsah","Rumeysa","Esra"};
        ArrayList<String> yeniList=new ArrayList<>();
        for (String each:arr
             ) {
if (each.length()%2==0){
    yeniList.add(each=each.substring(0,each.length()/2));

}else{
    yeniList.add(each.substring((each.length()-1)/2));
}
        }
        System.out.println(yeniList);
    }
}
