import java.util.Scanner;

public class kdv_hesaplama {
    public static void main(String[] args) {
        
        double girdi;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Değer giriniz: ");
        girdi = input.nextDouble();
        
        double tutarA , tutarB ;
        tutarA = 0.18;
        tutarB = 0.08;

        double sonuc = (girdi >= 1000) ? girdi+(girdi*tutarB) : girdi+(girdi*tutarA) ;
        double tutar = (girdi >= 1000) ? tutarB : tutarA ;

        System.out.println("KDV Tutarı: " + tutar);
        System.out.println("KDV'li Fiyat: "+ sonuc);
    }
}