package temmuz27_eachLoop;

public class soru2 {
    public static void main(String[] args) {
        //Soru 2- Verilen int array’deki her elementin karelerini alip,
        // karelerinin toplamini yazdiran bir method olusturun.

   int[] arr={3,6,9,5,7,9};

   int sumOfSquares= calculateSumOfSquares(arr);
            System.out.println("Sum of Squares :"+sumOfSquares);

    }

    private static int calculateSumOfSquares(int[] arr) {
        int sum =0;
        for (int each:arr) {
            sum+=each*each;
        }
        return sum;
    }

}




