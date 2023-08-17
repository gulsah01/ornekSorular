package slayt199;
//Soru 5-Verilen 2 katli bir array’de her bir inner array’in
// son elementlerinin toplaminini yazdiran bir method olusturun.
public class soru5 {
    public static void main(String[] args) {
        int [][] arr={{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
        sonElementleriTopla(arr);
    }
    private static void sonElementleriTopla(int[][] arr) {
        int toplam=0;
        for (int i = 0; i <arr.length ; i++) {
            toplam+=arr[i][arr[i].length-1];
        }
        System.out.println("Inner arrayin son elemanlari toplami : "+toplam);
    }

}