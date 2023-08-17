package arrayList214;

import org.w3c.dom.DOMStringList;

import java.util.ArrayList;
import java.util.List;

//Soru 3-Verilen String bir listede istenmeyen harf iceren elementleri silip,
// kalan kismini list olarak bize donduren bir method olusturun
public class soru3 {
        public static void main(String[] args) {
            List<String> sehirler=new ArrayList<>();
            sehirler.add("adana");
            sehirler.add("bursa");
            sehirler.add("istanbul");
            sehirler.add("ankara");
            System.out.println(istenmeyenHarfiSil(sehirler,"i"));
            sehirler= istenmeyenHarfiSil(sehirler,"i");
            System.out.println(sehirler);
        }
        private static List<String> istenmeyenHarfiSil(List<String> sehirler, String c ) {
            ArrayList<String> yeniList=new ArrayList<>();
            for (int i = 0; i < sehirler.size(); i++) {
                if(!sehirler.get(i).contains(c)){
                    yeniList.add(sehirler.get(i));
                }
            }
            return yeniList;
        }

    }

