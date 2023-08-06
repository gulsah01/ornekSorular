package temmuz27_ArrayList;

import org.w3c.dom.DOMStringList;

import java.util.ArrayList;
import java.util.List;

public class soru3 {
    public static void main(String[] args) {
        //Soru 3- Verilen String bir listede istenmeyen harf iceren elementleri silip,
        // kalan kismini list olarak bize donduren bir method olusturun

        List<String> stringList = new ArrayList<>();
        stringList.add("Hasan");
        stringList.add("Tolga");
        stringList.add("Mustafa");
        stringList.add("Huriye");
        stringList.add("Gulsah");
        stringList.add("Dilek");

        List<String> filteredNames=removeUnwantedNames(stringList,"e");

        for (String each:filteredNames
             ) {
            System.out.println(each);
        }
    }

    public static List<String > removeUnwantedNames(List<String> List,String unwantedLetter){
        List<String> filteredNames=new ArrayList<>();

        for (String each:List
             ) {
            if (!each.contains(unwantedLetter)){
                filteredNames.add(each);
            }
        }
        return filteredNames;
    }
}
