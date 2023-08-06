package temmuz30_sampleQuestions;

public class soru42 {
    /*Soru 42
    Biri parametreli, diğeri parametresiz 2 constructor oluşturun.
    Bu const. kullanarak en az 2 nesne oluşturun ve konsolda bu nesnelerin özellikleri yazdırın
    Ipucu: Constructor konusunu pratik yapalım. Nesnelerin rengini
    adını sayısını gönderelim sonra cagırıp konsolda yazdıralım.
     */

    String diziIsmi;
    String diziBasrol;
    int diziSezon;
    String diziTuru;

    public soru42(){ //parametresiz constructor
       this.diziIsmi="Breaking Bad";
       this.diziBasrol="Bryan Cranston";
       this.diziSezon=7;
       this.diziTuru="American crime drama";
    }

    public soru42(String diziIsmi,String diziBasrol,int diziSezon,String diziTuru){//parametreli constructor

        this.diziIsmi=diziIsmi;
        this.diziBasrol=diziBasrol;
        this.diziSezon=diziSezon;
        this.diziTuru=diziTuru;

        }

        @Override
    public String toString() {
        return "Dizi Bilgileri==>{" +
                "diziIsmi:'" + diziIsmi + '\'' +
                ", diziBasrol:'" + diziBasrol + '\'' +
                ", diziSezon:" + diziSezon +
                ", diziTuru:'" + diziTuru + '\'' +
                '}';
    }

    public static void main(String[] args) {
    soru42 dizi1=new soru42();// parametresiz ile nesne olusturma
        System.out.println(dizi1);

    soru42 dizi2=new soru42("Downton Abbey","Michelle Dockery",6,"British historical drama");
    //parametreli ile nesne olusturma
        System.out.println(dizi2);



    }

}
