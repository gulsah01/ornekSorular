package array174;
//Soru 6-Verilen String bir array’deki en uzun ve
// en kisa kelimeleri yazdiran bir method olusturun.
public class soru6 {
    public static void main(String[] args) {


        String[] arr = {"Gulsah", "Rumeysa", "Ayfer", "Bulutluoz", "Esra"};
        uzunVeKisa(arr);
    }

    private static void uzunVeKisa(String[] arr) {
        String u = arr[0];
        String k = arr[0];
        for (int i = 0; i < arr.length-1 ; i++) {
            if (arr[i].length()>arr[i+1].length()){
                u=arr[i];
            }else {
                u=arr[i+1];
            }
            if (arr[i].length()<arr[i+1].length()){
                k=arr[i];
            }else {
                k=arr[i+1];
            }

        }
        System.out.println(u+"\n"+k);
    }
}