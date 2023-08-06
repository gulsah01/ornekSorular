package temmuz27_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {
        // Soru 2- Kullanicidan istedigi kadar isim alip,
        //        Q’ya bastiginda girdigi isimleri bize
        //        liste olarak dondurecek bir method olusturun.

            List<String> nameList = getNames();
            System.out.println("Entered names: " + nameList);
        }

        public static List<String> getNames() {
            List<String> nameList = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter names (Press 'Q' to quit):");
            while (true) {
                String name = scanner.nextLine().trim();

                if (name.equalsIgnoreCase("Q")) {
                    break;
                }

                nameList.add(name);
            }

            return nameList;



    }
}