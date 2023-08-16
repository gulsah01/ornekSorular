package slayt199;
//Soru 5-Verilen 2 katli bir array’de her bir inner array’in
// son elementlerinin toplaminini yazdiran bir method olusturun.
public class soru5 {
    public static void main(String[] args) {
        int [][] arr={{2,2,2},{8,9,7},{8,5},{1,2}};
        sonElementleriTopla(arr);
    }
    private static void sonElementleriTopla(int[][] arr) {
        int toplam=0;
        for (int i = 0; i <arr.length ; i++) {
            int sonIndexElementi=arr[i].length-1;
            int sonSayi=arr[i][sonIndexElementi];
            toplam+=sonSayi;
        }
        System.out.println("Inner arrayin son elemanlari toplami : "+toplam);
    }

}